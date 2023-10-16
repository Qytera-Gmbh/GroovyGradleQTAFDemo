package utils

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class WebDriverSingleton {
    private static WebDriver driver

    private WebDriverSingleton() {}

    static WebDriver getDriver() {
        if (!driver) {
            WebDriverManager.chromedriver().setup()
            driver = new ChromeDriver()
        }
        return driver
    }

    static void closeDriver() {
        if (driver) {
            try {
                driver.close()
            } catch (e) {
                // nothing to do here
            }

            driver = null
        }
    }
}

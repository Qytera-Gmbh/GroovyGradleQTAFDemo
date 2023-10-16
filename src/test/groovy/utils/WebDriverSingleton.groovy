package utils

import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

@Singleton
class WebDriverSingleton {
    private WebDriver driver

    WebDriver getDriver() {
        if (!driver) {
            WebDriverManager.chromedriver().setup()
            driver = new ChromeDriver()
        }

        driver
    }

    void quitDriver() {
        if (driver) {
            driver.quit()
            driver = null
        }
    }
}

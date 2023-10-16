package utils

import de.qytera.qtaf.core.config.ConfigurationFactory
import de.qytera.qtaf.core.config.entity.ConfigMap
import de.qytera.qtaf.core.selenium.FirefoxDriver
import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxOptions

import java.time.Duration

@Singleton
class WebDriverSingleton {
    private WebDriver driver
    ConfigMap configuration = ConfigurationFactory.getInstance()

    WebDriver getDriver() {
        if (!driver) {
            WebDriverManager.chromedriver().setup()

            switch(configuration.getString('driver.name')) {
                case ['chrome', '']:
                    ChromeOptions options = new ChromeOptions()
                    if (configuration.getBoolean 'driver.headless') options.addArguments "--headless=new"
                    driver = new ChromeDriver(options)
                    break
                case 'firefox':
                    FirefoxOptions options = new FirefoxOptions()
                    if (configuration.getBoolean 'driver.headless') options.addArguments "--headless=new"
                    driver = new FirefoxDriver(options)
                    break
                default:
                    break
            }

            def implicitTimeout = configuration.getInt('driver.implicitWaitTimeout')
            if (implicitTimeout) driver.manage().timeouts().implicitlyWait Duration.ofSeconds(implicitTimeout)
        }

        driver
    }

    void quitDriver() {
        if (driver) {
            if (configuration.getBoolean 'driver.quitAfterTesting') {
                driver.quit()
                driver = null
            }
        }
    }
}

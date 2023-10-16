import org.openqa.selenium.WebDriver
import org.testng.annotations.AfterMethod
import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeMethod
import utils.WebDriverSingleton

abstract class BaseTest {
    WebDriver driver

    @BeforeMethod
    void setup() {
        driver = WebDriverSingleton.getInstance().getDriver()
    }

    @AfterMethod
    void teardownTest() {
        // nothing to do right now
    }

    @AfterSuite
    void teardownSuite() {
        WebDriverSingleton.getInstance().quitDriver()
    }
}

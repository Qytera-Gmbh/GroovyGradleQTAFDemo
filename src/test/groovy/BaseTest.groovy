import org.openqa.selenium.WebDriver
import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeSuite

abstract class BaseTest {
    WebDriver driver

    @BeforeSuite
    void setup() {
        driver = WebDriverSingleton.getDriver()
    }

    @AfterSuite
    void teardown() {
        WebDriverSingleton.closeDriver()
    }
}

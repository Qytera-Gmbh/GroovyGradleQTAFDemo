package page

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import utils.WebDriverSingleton

abstract class BasePage {
    private final static String BASE_URL = 'https://www.qytera.de'

    private WebDriver driver

    BasePage() {
        driver = WebDriverSingleton.getInstance().getDriver()
        String.mixin NavigationMethodCategory
    }

    abstract void navigateToPage()

    static class NavigationMethodCategory {
        static void navigate(String suffix) {
            WebDriverSingleton.getInstance().getDriver().get "${BASE_URL}${suffix}"
        }

        static void click(String linkText) {
            def link = WebDriverSingleton.getInstance().getDriver().findElement By.linkText(linkText)
            link.click()
        }

        static String toAbsoluteURL(String suffix) {
            "${BASE_URL}${suffix}"
        }
    }
}

package de.qytera.ggqd.pages

import de.qytera.qtaf.core.config.ConfigurationFactory
import de.qytera.qtaf.core.guice.annotations.Step
import de.qytera.qtaf.testng.context.QtafTestNGContext
import org.junit.experimental.categories.Category
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.$$

abstract class APage extends QtafTestNGContext {
    private static final String BASE_URL_KEY = 'driver.remoteUrl'
    private static String baseUrl
    String path

    APage() {
        baseUrl = ConfigurationFactory.getInstance().getString(BASE_URL_KEY)
        String.mixin NavigationMethodCategory
    }

    @Category(String)
    static class NavigationMethodCategory {
        static void navigate(String suffix) {
            driver.get toAbsoluteURL(suffix)
        }

        static WebElement findLink(String linkText) {
            $(By.linkText linkText)
        }

        static String toAbsoluteURL(String suffix) {
            "$baseUrl$suffix"
        }
    }

    @Step(name = 'Navigate to Page', description = 'Open the website https://www.qytera.de with sub-path')
    void 'navigate to page'() {
        path.navigate()
        assertEquals driver.currentUrl, path.toAbsoluteURL()
    }

    @Step(name = 'Check headline', description = 'Check that the headline matches the given text')
    void 'current headline should be'(String expected) {
        assertEquals $('h1').text(), expected
    }

    @Step(name = 'Check current URL', description = 'Check that the current URL matches the given one')
    void 'current url should be'(String expected) {
        assertEquals driver.currentUrl, expected.toAbsoluteURL()
    }

    @Step(name = 'type search text into text field and submit', description = 'type search text into text field and submit')
    void 'type into searchbox and submit'(String searchBoxId, String searchText) {
        ($(By.id searchBoxId)).sendKeys(searchText + Keys.RETURN)
    }

    @Step(name = 'Find all elements of given class and check their number of appearance', description = 'Find all elements of given class and check their number of appearance')
    void 'elements with given class are expected'(String className, int numberOfExpectedFinds) {
        def foundElements = $$(By.className className)
        assertEquals foundElements.size(), numberOfExpectedFinds
    }

    @Step(name = 'Find all elements of given class with filter and check their number of appearance', description = 'Find all elements of given class with filter and check their number of appearance')
    void 'filtered elements with given class are expected'(String className, String filterText, int numberOfExpectedFinds) {
        def foundElements = $$(By.className className)
        assertEquals foundElements.count { it.text.contains(filterText) }, numberOfExpectedFinds
    }
}

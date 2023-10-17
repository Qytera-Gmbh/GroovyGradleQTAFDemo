package de.qytera.ggqd.pages

import de.qytera.qtaf.core.config.ConfigurationFactory
import de.qytera.qtaf.core.guice.annotations.Step
import de.qytera.qtaf.testng.context.QtafTestNGContext
import org.openqa.selenium.By

import static com.codeborne.selenide.Selenide.$

abstract class APage extends QtafTestNGContext {
    private static final String BASE_URL_KEY = 'driver.remoteUrl'
    private static String baseUrl
    String path

    APage() {
        baseUrl = ConfigurationFactory.getInstance().getString(BASE_URL_KEY)
        String.mixin NavigationMethodCategory
    }

    def steps(Closure cl) {
        cl.delegate = this
        cl.resolveStrategy = Closure.DELEGATE_FIRST
        cl.call()
    }

    static class NavigationMethodCategory {
        static void navigate(String suffix) {
            driver.get "$baseUrl$suffix"
        }

        static void click(String linkText) {
            def link = driver.findElement By.linkText(linkText)
            link.click()
        }

        static String toAbsoluteURL(String suffix) {
            "$baseUrl$suffix"
        }
    }

    @Step(name = 'Navigate to Page', description = 'Open the website https://www.qytera.de with sub-path')
    void navigateToPage() {
        path.navigate()
        assertEquals driver.currentUrl, path.toAbsoluteURL()
    }

    @Step(name = 'Check headline', description = 'Check that the headline matches the given text')
    void checkHeadline(String expectedText) {
        assertEquals $('h1').text(), expectedText
    }

    @Step(name = 'Check current URL', description = 'Check that the current URL matches the given one')
    void checkCurrentUrl(String expectedUrl) {
        assertEquals driver.currentUrl, expectedUrl.toAbsoluteURL()
    }
}

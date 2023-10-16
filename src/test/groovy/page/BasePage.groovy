package page

import de.qytera.qtaf.core.config.ConfigurationFactory
import de.qytera.qtaf.core.guice.annotations.Step
import de.qytera.qtaf.testng.context.QtafTestNGContext
import org.openqa.selenium.By

abstract class BasePage extends QtafTestNGContext {
    private static final String BASE_URL_KEY = 'driver.remoteUrl'
    private static String baseUrl
    String path

    BasePage() {
        baseUrl = ConfigurationFactory.getInstance().getString(BASE_URL_KEY)
        String.mixin NavigationMethodCategory
    }

    @Step(name = 'Navigate to Page', description = 'Navigate to Page')
    void navigateToPage() {
        path.navigate()
    }

    static class NavigationMethodCategory {
        static void navigate(String suffix) {
            driver.get "${baseUrl}${suffix}"
        }

        static void click(String linkText) {
            def link = driver.findElement By.linkText(linkText)
            link.click()
        }

        static String toAbsoluteURL(String suffix) {
            "${baseUrl}${suffix}"
        }
    }
}

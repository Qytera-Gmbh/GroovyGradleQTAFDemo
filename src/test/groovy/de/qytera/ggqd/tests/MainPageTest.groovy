package de.qytera.ggqd.tests


import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import de.qytera.ggqd.pages.MainPage
import org.testng.annotations.Test

@TestFeature
class MainPageTest extends QtafTestNGContext {
    @Test(testName = "GGQD-001", description = "test something")
    void "test something"() {
        def page = load(MainPage)
        page.steps {
            navigateToPage:
            checkCurrentUrl: "https://www.qytera.de/"
            checkHeadline: "Die Experten in Continuous Testing und Testautomatisierung"
        }
    }
}

package de.qytera.ggqd.tests


import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import de.qytera.ggqd.pages.MainPage
import org.testng.annotations.Test

@TestFeature
class MainPageTest extends ATest {
    @Test(testName = "GGQD-001", description = "test loading of main page with correct headline")
    void "test loading of main page with correct headline"() {
        withPage(load(MainPage)) {
            navigateToPage()
            checkCurrentUrl '/'
            checkHeadline 'Die Experten in Continuous Testing und Testautomatisierung'
        }
    }
}

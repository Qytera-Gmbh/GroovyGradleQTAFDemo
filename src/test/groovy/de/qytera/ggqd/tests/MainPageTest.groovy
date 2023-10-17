package de.qytera.ggqd.tests


import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import de.qytera.ggqd.pages.MainPage
import org.testng.annotations.Test

@TestFeature
class MainPageTest extends ATest {
    @Test(testName = "GGQD-Main-001", description = "test loading of main page with correct headline")
    void "test loading of main page with correct headline"() {
        withPage(load(MainPage)) {
            navigateToPage()
            checkCurrentUrl '/'
            checkHeadline 'Die Experten in Continuous Testing und Testautomatisierung'
        }
    }

    @Test(testName = "GGQD-Main-002", description = "test click on consulting button leads to appointment page")
    void "test click on consulting button leads to appointment page"() {
        withPage(load(MainPage)) {
            navigateToPage()
            clickConsultingButton()
            checkCurrentUrl('/telefon-termin')
            checkHeadline 'Die Experten in Continuous Testing und Testautomatisierung'
        }
    }
}

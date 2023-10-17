package de.qytera.ggqd.tests

import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import org.testng.Assert
import org.testng.annotations.Test
import de.qytera.ggqd.pages.MainPage

@TestFeature(name = 'Test Main Page',
        description = 'Test Main Page')
class MainPageTest extends QtafTestNGContext {
    @Test(
            testName = "GGQD-003",
            description = "test main page - find and click on -Beratungstermin vereinbaren- and check new URL"
    )
    void 'test main page - find and click on -Beratungstermin vereinbaren- and check new URL'() {
        MainPage pageMain = MainPage.instance
        pageMain.navigateToPage()

        pageMain.clickConsultingButton()
        Assert.assertEquals driver.getCurrentUrl(), '/telefon-termin'.toAbsoluteURL()
    }
}

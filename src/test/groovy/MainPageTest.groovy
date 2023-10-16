import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import org.testng.Assert
import org.testng.annotations.Test
import page.PageMain

@TestFeature(name = 'Test Main Page',
        description = 'Test Main Page')
class MainPageTest extends QtafTestNGContext {
    @Test
    void 'test main page - find and click on -Beratungstermin vereinbaren- and check new URL'() {
        PageMain pageMain = PageMain.instance
        pageMain.navigateToPage()

        pageMain.clickConsultingButton()
        Assert.assertEquals driver.getCurrentUrl(), '/telefon-termin'.toAbsoluteURL()
    }
}

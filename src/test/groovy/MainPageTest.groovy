import de.qytera.qtaf.core.config.annotations.TestFeature
import org.testng.Assert
import org.testng.annotations.Test
import page.PageMain

@TestFeature(name = 'Test Main Page',
        description = 'Test Main Page')
class MainPageTest extends BaseTest {
    @Test
    void 'test main page - find and click on "Beratungstermin vereinbaren" and check new URL'() {
        def pageMain = PageMain.instance
        pageMain.navigateToPage()

        pageMain.clickConsultingButton()
        Assert.assertEquals driver.getCurrentUrl(), '/telefon-termin'.toAbsoluteURL()
    }
}

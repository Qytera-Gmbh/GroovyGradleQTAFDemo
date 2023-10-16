import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import org.testng.Assert
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import page.PageMain

@TestFeature(name = 'Test Main Menu Buttons',
        description = 'Test Main Menu Buttons')
class MainMenuButtonsTest extends QtafTestNGContext {
    def pageMain

    @BeforeMethod
    void setup() {
        pageMain = PageMain.instance
    }

    @Test
    void 'test main menu - find and click on "Lösungen" and check new URL'() {
        pageMain.navigateToPage()

        pageMain.clickSolutionPageButton()
        Assert.assertEquals driver.getCurrentUrl(), '/testing-solutions'.toAbsoluteURL()
    }

    @Test
    void 'test main menu - find and click on "Seminare" and check new URL'() {
        pageMain.navigateToPage()

        pageMain.clickSeminarsPageButton()
        Assert.assertEquals driver.getCurrentUrl(), '/seminare-trainings'.toAbsoluteURL()
    }
}

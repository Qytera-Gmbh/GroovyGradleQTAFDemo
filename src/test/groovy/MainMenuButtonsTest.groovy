import de.qytera.qtaf.core.config.annotations.TestFeature
import org.testng.Assert
import org.testng.annotations.Test
import page.Page404
import page.PageMain

@TestFeature(name = 'Test Main Menu Buttons',
        description = 'Test Main Menu Buttons')
class MainMenuButtonsTest extends BaseTest {
    @Test
    void 'test main page button from 404 page - find and click on "Startseite" and check new URL'() {
        def page404 = Page404.instance
        page404.navigateToPage()
        Assert.assertEquals driver.getCurrentUrl(), '/not-existing-URL'.toAbsoluteURL()

        page404.clickMainPageButton()
        Assert.assertEquals driver.getCurrentUrl(), '/'.toAbsoluteURL()
    }

    @Test
    void 'test main menu - find and click on "Lösungen" and check new URL'() {
        def pageMain = PageMain.instance
        pageMain.navigateToPage()

        pageMain.clickSolutionPageButton()
        Assert.assertEquals driver.getCurrentUrl(), '/testing-solutions'.toAbsoluteURL()
    }

    @Test
    void 'test main menu - find and click on "Seminare" and check new URL'() {
        def pageMain = PageMain.instance
        pageMain.navigateToPage()

        pageMain.clickSeminarsPageButton()
        Assert.assertEquals driver.getCurrentUrl(), '/seminare-trainings'.toAbsoluteURL()
    }
}

import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import org.testng.Assert
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import page.PageNotFound

@TestFeature(name = 'Test Not Found Page (404)',
        description = 'Test Not Found Page (404)')
class NotFoundPageTest extends QtafTestNGContext {
    PageNotFound pageNotFound

    @BeforeMethod
    void setup() {
        pageNotFound = PageNotFound.instance
    }

    @Test
    void 'test main page button from 404 page - find and click on -Startseite- and check new URL'() {
        pageNotFound.navigateToPage()
        Assert.assertEquals driver.getCurrentUrl(), '/not-existing-URL'.toAbsoluteURL()

        pageNotFound.clickMainPageButton()
        Assert.assertEquals driver.getCurrentUrl(), '/'.toAbsoluteURL()
    }
}

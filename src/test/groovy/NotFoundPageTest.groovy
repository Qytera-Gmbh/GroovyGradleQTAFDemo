import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import org.testng.Assert
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test
import page.PageNotFound

@TestFeature(
        name = 'Test Not Found Page (404)',
        description = 'Test Not Found Page (404)'
)
class NotFoundPageTest extends QtafTestNGContext {
    PageNotFound pageNotFound = PageNotFound.instance

    @Test(
            testName = "GGQD-004",
            description = "from unavailable site - find and click on -Startseite- and check new URL"
    )
    void 'from unavailable site - find and click on -Startseite- and check new URL'() {
        pageNotFound.navigateToPage()
        Assert.assertEquals driver.getCurrentUrl(), '/not-existing-URL'.toAbsoluteURL()

        pageNotFound.clickMainPageButton()
        Assert.assertEquals driver.getCurrentUrl(), '/'.toAbsoluteURL()
    }
}

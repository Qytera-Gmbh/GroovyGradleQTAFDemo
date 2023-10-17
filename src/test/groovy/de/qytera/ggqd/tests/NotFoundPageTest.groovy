package de.qytera.ggqd.tests

import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import org.testng.Assert
import org.testng.annotations.Test
import de.qytera.ggqd.pages.NotFoundPage

@TestFeature(
        name = 'Test Not Found Page (404)',
        description = 'Test Not Found Page (404)'
)
class NotFoundPageTest extends QtafTestNGContext {
    NotFoundPage pageNotFound = NotFoundPage.instance

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

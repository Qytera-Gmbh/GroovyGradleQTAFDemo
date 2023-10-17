package de.qytera.ggqd.tests

import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import org.openqa.selenium.By
import org.testng.Assert
import org.testng.annotations.Test
import de.qytera.ggqd.pages.MainPage

@TestFeature(name = 'Test Main Menu Buttons',
        description = 'Test Main Menu Buttons')
class MainMenuButtonsTest extends QtafTestNGContext {
    MainPage pageMain = MainPage.instance

    @Test(
            testName = "GGQD-001",
            description = "test main menu - find and click on -Lösungen- and check new URL"
    )
    void 'test main menu - find and click on -Lösungen- and check new URL'() {
        pageMain.navigateToPage()

        pageMain.clickSolutionPageButton()
        Assert.assertEquals driver.getCurrentUrl(), '/testing-solutions'.toAbsoluteURL()
    }

    @Test(
            testName = "GGQD-002",
            description = "test main menu - find and click on -Seminare- and check new URL"
    )
    void 'test main menu - find and click on -Seminare- and check new URL'() {
        pageMain.navigateToPage()

        pageMain.clickSeminarsPageButton()
        Assert.assertEquals driver.getCurrentUrl(), '/seminare-trainings'.toAbsoluteURL()
    }

    @Test(
            testName = "GGQD-005",
            description = "test main menu - find and click on -Seminare- and check new URL"
    )
    void 'test search bar'() {
        pageMain.navigateToPage()

        pageMain.typeIntoSearchTextFieldAndSubmit('TEST')
        def snippets = driver.findElements(By.className('search-snippet-info'))
        Assert.assertEquals snippets.size(), 10
        Assert.assertEquals snippets.count{it.text.count('Test') >= 3}, 8
    }
}

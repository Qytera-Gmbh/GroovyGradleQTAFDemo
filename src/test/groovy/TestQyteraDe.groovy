import org.testng.Assert
import org.testng.annotations.Test

class TestQyteraDe extends BaseTest {
    @Test
    void "test main page - find and click on 'Beratungstermin vereinbaren' and check new URL"() {
        def pageMain = PageMain.instance
        pageMain.navigateToPage()

        pageMain.clickConsultingButton()
        Assert.assertEquals  driver.getCurrentUrl(), '/telefon-termin'.toAbsoluteURL()
    }

    @Test
    void "test 404 page - find and click on 'Startseite' and check new URL"() {
        def page404 = Page404.instance
        page404.navigateToPage()
        Assert.assertEquals  driver.getCurrentUrl(), '/not-existing-URL'.toAbsoluteURL()

        page404.clickMainPageButton()
        Assert.assertEquals  driver.getCurrentUrl(), '/'.toAbsoluteURL()
    }
}

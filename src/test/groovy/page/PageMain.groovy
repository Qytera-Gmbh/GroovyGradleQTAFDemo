package page


import de.qytera.qtaf.core.guice.annotations.Step

@Singleton
class PageMain extends BasePageWithMainMenu {
    {
        path = '/'
    }

    @Step(name = 'Click consulting button', description = 'Click consulting button')
    void clickConsultingButton() {
        'Beratungstermin vereinbaren'.click()
    }
}

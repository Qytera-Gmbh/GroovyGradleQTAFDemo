package page


import de.qytera.qtaf.core.guice.annotations.Step

@Singleton
class PageMain extends BasePageWithMainMenu {
    @Step(name = 'Navigate to Main Page', description = 'Navigate to Main Page')
    void navigateToPage() {
        '/'.navigate()
    }

    @Step(name = 'Click consulting button', description = 'Click consulting button')
    void clickConsultingButton() {
        'Beratungstermin vereinbaren'.click()
    }
}

package page


import de.qytera.qtaf.core.guice.annotations.Step

@Singleton
class Page404 extends BasePageWithMainMenu {
    @Step(name = 'Navigate to 404 Page', description = 'Navigate to 404 Page')
    void navigateToPage() {
        '/not-existing-URL'.navigate()
    }
}

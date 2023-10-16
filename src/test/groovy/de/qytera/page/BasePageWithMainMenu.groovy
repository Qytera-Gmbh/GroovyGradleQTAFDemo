package page

import de.qytera.qtaf.core.guice.annotations.Step

abstract class BasePageWithMainMenu extends BasePage {
    @Step(name = 'Click main page button', description = 'Click main page button')
    void clickMainPageButton() {
        'Startseite'.click()
    }

    @Step(name = 'Click solution page button', description = 'Click solution page button')
    void clickSolutionPageButton() {
        'Lösungen'.click()
    }

    @Step(name = 'Click seminars page button', description = 'Click seminars page button')
    void clickSeminarsPageButton() {
        'Seminare'.click()
    }

    @Step(name = 'Click knowledge page button', description = 'Click knowledge page button')
    void clickKnowledgePageButton() {
        'Wissen'.click()
    }

    @Step(name = 'Click career page button', description = 'Click career page button')
    void clickCareerPageButton() {
        'Karriere'.click()
    }

    @Step(name = 'Click company page button', description = 'Click company page button')
    void clickCompanyPageButton() {
        'Unternehmen'.click()
    }

    @Step(name = 'Click contact page button', description = 'Click contact page button')
    void clickContactPageButton() {
        'Kontakt'.click()
    }
}

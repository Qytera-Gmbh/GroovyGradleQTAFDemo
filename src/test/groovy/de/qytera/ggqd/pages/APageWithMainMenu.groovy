package de.qytera.ggqd.pages

import de.qytera.qtaf.core.guice.annotations.Step
import org.openqa.selenium.By
import org.openqa.selenium.Keys

abstract class APageWithMainMenu extends APage {
    @Step(name = 'Click main page button', description = 'Click main page button')
    void 'click Main Page button'() {
        'Startseite'.findLink().click()
    }

    @Step(name = 'Click solution page button', description = 'Click solution page button')
    void 'click Solution Page button'() {
        'Lösungen'.findLink().click()
    }

    @Step(name = 'Click seminars page button', description = 'Click seminars page button')
    void 'click Seminars Page button'() {
        'Seminare'.findLink().click()
    }

    @Step(name = 'Click knowledge page button', description = 'Click knowledge page button')
    void 'click Knowledge Page button'() {
        'Wissen'.findLink().click()
    }

    @Step(name = 'Click career page button', description = 'Click career page button')
    void 'click Career Page button'() {
        'Karriere'.findLink().click()
    }

    @Step(name = 'Click company page button', description = 'Click company page button')
    void 'click Company Page button'() {
        'Unternehmen'.findLink().click()
    }

    @Step(name = 'Click contact page button', description = 'Click contact page button')
    void 'click Contact Page button'() {
        'Kontakt'.findLink().click()
    }

    @Step(name = 'Click search button', description = 'Click search button')
    void 'click Search button'() {
        'Suche'.findLink().click()
    }
}

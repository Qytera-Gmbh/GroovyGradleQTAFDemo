package de.qytera.ggqd.pages

import de.qytera.qtaf.core.guice.annotations.Step
import org.openqa.selenium.By
import org.openqa.selenium.Keys

abstract class APageWithMainMenu extends APage {
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

    @Step(name = 'Click search button', description = 'Click search button')
    void clickSearchButton() {
        'Suche'.click()
    }

    @Step(name = 'type search text into text field and submit', description = 'type search text into text field and submit')
    void typeIntoSearchTextFieldAndSubmit(String searchText) {
        def searchTextField = driver.findElement By.id('edit-search-block-form--2')
        searchTextField.sendKeys(searchText)
        searchTextField.sendKeys(Keys.RETURN)
    }
}

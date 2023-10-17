package de.qytera.ggqd.tests

import de.qytera.ggqd.pages.MainPage
import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import org.testng.annotations.Test

@TestFeature
class MainPageTest extends QtafTestNGContext {
    @Test(testName = 'GGQD-Main-001', description = 'test loading of main page with correct headline')
    void 'test loading of main page with correct headline'() {
        load(MainPage).with {
            navigateToPage()
            checkCurrentUrl '/'
            checkHeadline 'Die Experten in Continuous Testing und Testautomatisierung'
        }
    }

    @Test(testName = 'GGQD-Main-002', description = 'test click on consulting button leads to appointment page')
    void 'test click on consulting button leads to appointment page'() {
        load(MainPage).with {
            navigateToPage()
            clickConsultingButton()
            checkCurrentUrl('/telefon-termin')
            checkHeadline 'Die Experten in Continuous Testing und Testautomatisierung'
        }
    }

    @Test(testName = 'GGQD-Main-003', description = 'test click on -Solutions- in top menu')
    void 'test click on -Solutions- in top menu'() {
        load(MainPage).with {
            navigateToPage()
            clickSolutionPageButton()
            checkCurrentUrl('/testing-solutions')
        }
    }

    @Test(testName = 'GGQD-Main-004', description = 'test click on -Seminars- in top menu')
    void 'test click on -Seminars- in top menu'() {
        load(MainPage).with {
            navigateToPage()
            clickSeminarsPageButton()
            checkCurrentUrl('/seminare-trainings')
        }
    }

    @Test(testName = 'GGQD-Main-005', description = 'test click on -Knowledge- in top menu')
    void 'test click on -Knowledge- in top menu'() {
        load(MainPage).with {
            navigateToPage()
            clickKnowledgePageButton()
            checkCurrentUrl('/wissen')
        }
    }

    @Test(testName = 'GGQD-Main-006', description = 'test click on -Career- in top menu')
    void 'test click on -Career- in top menu'() {
        load(MainPage).with {
            navigateToPage()
            clickCareerPageButton()
            checkCurrentUrl('/karriere')
        }
    }

    @Test(testName = 'GGQD-Main-007', description = 'test click on -Company- in top menu')
    void 'test click on -Company- in top menu'() {
        load(MainPage).with {
            navigateToPage()
            clickCompanyPageButton()
            checkCurrentUrl('/unternehmen')
        }
    }

    @Test(testName = 'GGQD-Main-008', description = 'test click on -Contact- in top menu')
    void 'test click on -Contact- in top menu'() {
        load(MainPage).with {
            navigateToPage()
            clickContactPageButton()
            checkCurrentUrl('/kontakt')
        }
    }
}

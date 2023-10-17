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
            'navigate to page'()
            'current url should be' '/'
            'current headline should be' 'Die Experten in Continuous Testing und Testautomatisierung'
        }
    }

    @Test(testName = 'GGQD-Main-002', description = 'test click on consulting button leads to appointment page')
    void 'test click on consulting button leads to appointment page'() {
        load(MainPage).with {
            'navigate to page'()
            'click Consulting button'()
            'current url should be' '/telefon-termin'
            'current headline should be' 'Die Experten in Continuous Testing und Testautomatisierung'
        }
    }

    @Test(testName = 'GGQD-Main-003', description = 'test click on -Solutions- in top menu')
    void 'test click on -Solutions- in top menu'() {
        load(MainPage).with {
            'navigate to page'()
            'click Solution Page button'()
            'current url should be' '/testing-solutions'
        }
    }

    @Test(testName = 'GGQD-Main-004', description = 'test click on -Seminars- in top menu')
    void 'test click on -Seminars- in top menu'() {
        load(MainPage).with {
            'navigate to page'()
            'click Seminars Page button'()
            'current url should be' '/seminare-trainings'
        }
    }

    @Test(testName = 'GGQD-Main-005', description = 'test click on -Knowledge- in top menu')
    void 'test click on -Knowledge- in top menu'() {
        load(MainPage).with {
            'navigate to page'()
            'click Knowledge Page button'()
            'current url should be' '/wissen'
        }
    }

    @Test(testName = 'GGQD-Main-006', description = 'test click on -Career- in top menu')
    void 'test click on -Career- in top menu'() {
        load(MainPage).with {
            'navigate to page'()
            'click Career Page button'()
            'current url should be' '/karriere'
        }
    }

    @Test(testName = 'GGQD-Main-007', description = 'test click on -Company- in top menu')
    void 'test click on -Company- in top menu'() {
        load(MainPage).with {
            'navigate to page'()
            'click Company Page button'()
            'current url should be' '/unternehmen'
        }
    }

    @Test(testName = 'GGQD-Main-008', description = 'test click on -Contact- in top menu')
    void 'test click on -Contact- in top menu'() {
        load(MainPage).with {
            'navigate to page'()
            'click Contact Page button'()
            'current url should be' '/kontakt'
        }
    }
}

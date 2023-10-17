package de.qytera.ggqd.tests


import de.qytera.ggqd.pages.SearchPage
import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import org.testng.annotations.Test

@TestFeature
class SearchPageTest extends QtafTestNGContext {
    @Test(testName = 'GGQD-Search-001', description = 'test search bar of top menu with word -TEST-')
    void 'test search bar of top menu with word -TEST-'() {
        load(SearchPage).with {
            'navigate to page'()
            'current url should be' '/search/node'
            'current headline should be' 'Die Experten in Continuous Testing und Testautomatisierung'
            'type into searchbox and submit' 'edit-search-block-form--2', 'TEST'
            'elements with given class are expected' 'search-snippet-info', 10
        }
    }

    @Test(testName = 'GGQD-Search-002', description = 'test search bar of top menu with word -TEST- and filter -ISTQB-')
    void 'test search bar of top menu with word -TEST- and filter -ISTQB-'() {
        load(SearchPage).with {
            'navigate to page'()
            'current url should be' '/search/node'
            'type into searchbox and submit' 'edit-search-block-form--2', 'TEST'
            'filtered elements with given class are expected' 'search-snippet-info', 'ISTQB', 4
        }
    }
}

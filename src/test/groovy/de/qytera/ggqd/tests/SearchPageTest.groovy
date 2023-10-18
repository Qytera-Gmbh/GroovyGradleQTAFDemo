package de.qytera.ggqd.tests


import de.qytera.ggqd.pages.SearchPage
import de.qytera.qtaf.core.config.annotations.TestFeature
import de.qytera.qtaf.testng.context.QtafTestNGContext
import de.qytera.qtaf.xray.annotation.XrayTest
import org.testng.annotations.Test

@TestFeature
class SearchPageTest extends QtafTestNGContext {
    @Test(testName = 'GGQD-Search-001', description = 'test search bar of top menu with word -TEST-')
    @XrayTest(key = "QTAF-1084")
    void 'test search bar of top menu with word -TEST-'() {
        load(SearchPage).with {
            navigateToPage()
            checkCurrentUrl '/search/node'
            checkHeadline 'Die Experten in Continuous Testing und Testautomatisierung'
            typeIntoSearchBoxAndSubmit 'edit-search-block-form--2', 'TEST'
            findClassAndCheckAmount 'search-snippet-info', 10
        }
    }

    @Test(testName = 'GGQD-Search-002', description = 'test search bar of top menu with word -TEST- and filter -ISTQB-')
    @XrayTest(key = "QTAF-1085")
    void 'test search bar of top menu with word -TEST- and filter -ISTQB-'() {
        load(SearchPage).with {
            navigateToPage()
            checkCurrentUrl '/search/node'
            typeIntoSearchBoxAndSubmit 'edit-search-block-form--2', 'TEST'
            findClassAndCheckFilteredAmount 'search-snippet-info', 'ISTQB', 4
        }
    }
}

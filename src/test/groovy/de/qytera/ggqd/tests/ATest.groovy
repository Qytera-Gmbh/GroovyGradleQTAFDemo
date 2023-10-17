package de.qytera.ggqd.tests

import de.qytera.qtaf.testng.context.QtafTestNGContext

abstract class ATest extends QtafTestNGContext {
    def withPage(page, Closure cl) {
        cl.delegate = page
        cl.resolveStrategy = Closure.DELEGATE_FIRST
        cl()
    }
}

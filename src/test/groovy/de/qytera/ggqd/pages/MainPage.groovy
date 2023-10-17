package de.qytera.ggqd.pages

import de.qytera.qtaf.core.guice.annotations.Step

class MainPage extends APageWithMainMenu {
    {
        path = "/"
    }

    @Step(name = 'Click consulting button', description = 'Click consulting button')
    void clickConsultingButton() {
        'Beratungstermin vereinbaren'.click()
    }
}

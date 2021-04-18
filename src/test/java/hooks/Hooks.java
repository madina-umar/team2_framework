package hooks;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.*;


public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        CucumberLogUtils.initScenario(scenario);
    }

    @After
    public void tearDown() {
        WebDriverUtils.closeDriver();
    }
}

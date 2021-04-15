package hooks;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import utils.ConfigReaderUtils;
import utils.WebDriverUtils;


public class Hooks {

    @Before
    public void setUp(Scenario currentScenario) {
        WebDriverUtils.getDriver().get(ConfigReaderUtils.getProperty("url"));
    }

    @After
    public void tearDown() {
        WebDriverUtils.closeDriver();
    }
}

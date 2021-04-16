package hooks;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.СucumberLogUtils;
import utils.ConfigReaderUtils;
import utils.WebDriverUtils;
import utils.СucumberLogUtils;


public class Hooks {

    @Before
    public void setUp(Scenario currentScenario) {
        СucumberLogUtils.initScenario(currentScenario);
        WebDriverUtils.getDriver().get(ConfigReaderUtils.getProperty("url"));
        СucumberLogUtils.initScenario(currentScenario);
    }

    @After
    public void tearDown() {
        WebDriverUtils.closeDriver();
    }
}

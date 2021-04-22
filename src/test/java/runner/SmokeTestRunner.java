package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/smoke", "rerun:target/Rerun_Failed/SmokeRunner.txt", "json:target/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"steps", "hooks"},
        dryRun = false,
        tags = "@smoke"


)




public class SmokeTestRunner {
}

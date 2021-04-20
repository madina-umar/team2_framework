package runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/SettingsRunner-test-10", "rerun:target/Rerun_Failed/SettingsRunner.txt", "json:target/cucumber.json"},
        features = {"src/test/resources/features/settings.feature"},
        glue = {"steps", "hooks"},
        dryRun = false,
        //tags ="@plan-8"
        //tags = "@plan-9"
      //  tags = "@sanity"
        tags = "@plan-10"


)

public class SettingsPageRunner {
}

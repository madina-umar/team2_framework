package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "html:cucumber.html", "json:cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"steps"},
        dryRun = false,
        stepNotifications = true


)


public class Runner {
}

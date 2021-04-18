package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "html:target/reports/cucumber.html", "json:target/reports/cucumber.json"},
        features = {"src/test/resources/features/mainPage(PLAN-1).feature"},
        glue = {"steps","hooks"},
        dryRun = false,
        stepNotifications = true

)

public class Runner {
}

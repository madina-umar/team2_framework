package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/IncomeRunner",
                "rerun:target/Rerun_Failed/IncomeRunner.txt"},
        features = "src/test/resources/features/income.feature",
//        features = "@target/Rerun_Failed/IncomeRunner.txt",
        glue = {"steps", "hooks"}
        //, stepNotifications = true
        , dryRun = false
      //  , tags = "@PLAN-2"
        ,tags = "@PLAN-7"

)


public class incomeRunner {
}


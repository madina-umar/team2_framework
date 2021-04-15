package steps;
import utils.СucumberLogUtils;

import io.cucumber.java.en.Given;

public class MainSteps {

    @Given("Login in to main page")
    public void login_in_to_main_page() throws InterruptedException {
        СucumberLogUtils.logPass("Main Page", true);
        Thread.sleep(5000);
    }
}

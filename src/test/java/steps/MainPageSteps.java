package steps;
import implementation.MainPageImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CucumberLogUtils;
import utils.MiscUtils;
import utils.WebDriverUtils;

import java.util.List;
public class MainPageSteps {
    MainPageImplementation mainPageImplementation = new MainPageImplementation();

    @Given("I navigate to Project website")
    public void iNavigateToProjectWebsite() {
        mainPageImplementation.navigateToMainPage();
    }

    @Then("I should see the {string} page")
    public void iShouldSeeThePage(String pageName) {
        mainPageImplementation.validateCurrentPage(pageName);
    }

    @Then("I verify the following dashboards are displayed:")
    public void iVerifyTheFollowingDashboardsAreDisplayed(List<String> dashboardButtons) {
        for (String button : dashboardButtons) {
            try {
                WebElement webElement = WebDriverUtils.getDriver().findElement(By.id(button));

                if (webElement.isDisplayed()) {
                    MiscUtils.highlightElement(webElement);
                }
            } catch (Exception e) {
                CucumberLogUtils.logFail("element is NOT displayed", false);
            }
        }
        mainPageImplementation.verifyDashboards(dashboardButtons);
    }
}
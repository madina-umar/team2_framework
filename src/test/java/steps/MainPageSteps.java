package steps;
import implementation.MainPageImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;
public class MainPageSteps {
    MainPageImplementation mainPageImplementation = new MainPageImplementation();

    @Given("I navigate to Project website")
    public void iNavigateToProjectWebsite() {
        mainPageImplementation.navigateToPage();
    }

    @Then("I should see the {string} page")
    public void iShouldSeeThePage(String pageName) {
        mainPageImplementation.validateCurrentPage(pageName);
    }

    @Then("I verify the following dashboards are displayed:")
    public void iVerifyTheFollowingDashboardsAreDisplayed(List<String> dashboardButtons) {
        mainPageImplementation.verifyDashboards(dashboardButtons);
    }

    @Then("I verify the following mainPage income fields are displayed:")
    public void iVerifyTheFollowingMainPageIncomeFieldsAreDisplayed(List<String> mainPageDollarValue) {
        mainPageImplementation.verifyMainPageIncomeFields(mainPageDollarValue);
    }

    @Then("I verify the following mainPage expense fields are displayed:")
    public void iVerifyTheFollowingMainPageExpenseFieldsAreDisplayed(List<String> mainPageDollarValue) {
        mainPageImplementation.verifyMainPageExpenseFields(mainPageDollarValue);
    }

    @Then("I verify the following mainPage revenue fields are displayed:")
    public void iVerifyTheFollowingMainPageRevenueFieldsAreDisplayed(List<String> mainPageDollarValue) {
        mainPageImplementation.verifyMainPageRevenueFields(mainPageDollarValue);
    }
}

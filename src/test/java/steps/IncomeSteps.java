package steps;

import implementation.IncomePageImplementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


import java.util.List;

public class IncomeSteps {
    IncomePageImplementation impl = new IncomePageImplementation();

    @Then("I click {string} link")
    public void iClickLink(String linkName) {
        impl.clickLink(linkName);
    }

    @Then("I verify the following input fields are displayed:")
    public void iVerifyTheFollowingInputFieldsAreDisplayed(List<String> inputField) {
        impl.verifyInputFields(inputField);
    }

    @Then("I verify the fields from dropdown {string}")
    public void iVerifyTheFieldsFromDropdown(String dropDownName, List<String> dropDown) {
        impl.verifyFieldsDropDown(dropDown, dropDownName);
    }

    @Then("I verify the following columns are displayed:")
    public void iVerifyTheFollowingColumnsAreDisplayed(List<String> columns) {
        impl.verifyColumnsName(columns);
    }

    @Then("I read data form the table, Amount and Income Type columns")
    public void iReadDataFormTheTableAmountAndIncomeTypeColumns() {
        impl.readDataTable();
    }

    @And("I calculate the percentages")
    public void iCalculateThePercentages() {
        impl.calcPercentages();
    }

    @Then("I validate the percentages on Pie chart")
    public void iValidateThePercentagesOnPieChart() {
        impl.validatePieChart();
    }
}

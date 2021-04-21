package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.IncomePage;
import utils.BrowserUtils;
import utils.MiscUtils;
import utils.WebDriverUtils;

import java.util.Map;

public class IncomeSteps {
    private String totalAmtBefore = null;
    private String totalAmtAfter = null;

    @Given("I am navigating to {string} page")
    public void i_am_navigating_to_page(String string) {
        IncomePage incomePage = new IncomePage();
        incomePage.navigateToIncomeTab();
    }

    @And("I fill income form")
    public void i_fill_income_form(Map<String, String> incomeInfo) {
        MiscUtils.sleep(5000);
        IncomePage incomePage = new IncomePage();
        totalAmtBefore = WebDriverUtils.getDriver().findElement(By.xpath("//div[contains(text(), \"Total Amount\")]/span")).getText();
        System.out.println(totalAmtBefore);
        String name = incomeInfo.get("name");
        String description = incomeInfo.get("description");
        String amount = incomeInfo.get("amount");
        String type = incomeInfo.get("type");
        String frequency = incomeInfo.get("frequency");
        incomePage.fillIncomeForm(name, description, amount, type, frequency);
        MiscUtils.sleep(3000);
        totalAmtAfter = WebDriverUtils.getDriver().findElement(By.xpath("//div[contains(text(), \"Total Amount\")]/span")).getText();
        //throw new cucumber.api.PendingException();
        System.out.println(totalAmtAfter);
    }

    @Then("I validate total amount was updated with previously added")
    public void i_validate_total_amount_was_updated_with_previously_added(Map<String, String> amountList) {
        Integer addedAmount = Integer.parseInt(amountList.get("amount"));
        IncomePage incomePage = new IncomePage();
        Integer amountDiff = incomePage.verifyTotalAmountIsUpdated(totalAmtBefore, totalAmtAfter);
        MiscUtils.sleep(3000);
    }

    @And("I validate added item is displayed in main data table")
    public void iValidateAddedItemIsDisplayedInMainDataTable(Map<String, String> incomeInfo) {
        IncomePage incomePage = new IncomePage();
        BrowserUtils.waitForClickability(incomePage.firstIncomeRow, 3);
        String expName = incomeInfo.get("name");
        Assert.assertEquals("Actual name doesn't match exp one",expName,incomePage.addedName.getText());
        String expDescription = incomeInfo.get("description");
        Assert.assertEquals("Actual desc doesn't match exp one",expDescription,incomePage.addedDesc.getText());
        String expAmount = incomeInfo.get("amount");
        Assert.assertEquals("Actual amount doesn't match exp one",expAmount,incomePage.addedAmount.getText());
        String expType = incomeInfo.get("type");
        Assert.assertEquals("Actual type doesn't match exp one",expType,incomePage.addedIncomeType.getText());

    }


}

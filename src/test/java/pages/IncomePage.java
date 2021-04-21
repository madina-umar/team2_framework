package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserUtils;
import utils.MiscUtils;
import utils.WebDriverUtils;

import java.util.HashMap;
import java.util.Map;

public class IncomePage {
        public IncomePage(){
            PageFactory.initElements(WebDriverUtils.getDriver(), this);
}
        @FindBy(id="income")
        public WebElement incomeTab;


        @FindBy(id="name")
        public WebElement nameField;

        @FindBy (id = "description")
        public WebElement descriptionField;

        @FindBy(id="amount")
        public WebElement amountField;

        @FindBy(id="type")
        public WebElement typeOptions;

        @FindBy (id="frequency")
        public WebElement frequencyOptions;


        @FindBy(id="submit-btn")
        public WebElement enterBtn;
        @FindBy (xpath = "//div[contains(text(), \"Total Amount\")]/span")
        public WebElement totalAmount;
        @FindBy (xpath = "//table[@id=\"table\"]//tbody/tr[1]")
        public WebElement firstIncomeRow;

        @FindBy (xpath = "//table[@id=\"table\"]//tbody/tr[1]/td[1]")
        public WebElement addedName;

        @FindBy (xpath = "//table[@id=\"table\"]//tbody/tr[1]/td[2]")
        public WebElement addedDesc;

        @FindBy (xpath = "//table[@id=\"table\"]//tbody/tr[1]/td[3]")
        public WebElement addedAmount;

        @FindBy (xpath = "//table[@id=\"table\"]//tbody/tr[1]/td[4]")
        public WebElement addedIncomeType;




        public void navigateToIncomeTab() {
                BrowserUtils.waitForClickability(incomeTab, 5).click();
             Assert.assertTrue("TEST FAILED.", WebDriverUtils.getDriver().getCurrentUrl().contains("income") );


        }

        public void fillIncomeForm(String name, String description, String amount, String type, String frequency){

                nameField.sendKeys(name);
                descriptionField.sendKeys(description);
                amountField.sendKeys(amount);
                Select selectType = new Select(typeOptions);
                selectType.selectByVisibleText(type);
                Select selectFrqn = new Select(frequencyOptions);
                selectFrqn.selectByVisibleText(frequency);
                enterBtn.click();
                MiscUtils.sleep(2);


        }
        public Integer verifyTotalAmountIsUpdated(String totalAmtBefore, String totalAmtAfter) {
                Integer difference = (Integer.parseInt(totalAmtAfter)) - (Integer.parseInt(totalAmtBefore));
                return difference;
        }




    }

package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.MiscUtils;
import utils.WebDriverUtils;
import utils.СucumberLogUtils;

import java.util.ArrayList;
import java.util.List;

public class IncomePageImplementation {

    public void clickLink(String linkName) {
        WebElement element = WebDriverUtils.getDriver().findElement(By.id(linkName.toLowerCase()));
        MiscUtils.highlightElement(element).click();
        MiscUtils.sleep(1000);
        СucumberLogUtils.logPass(linkName + " link was successfully clicked ", true);
    }

    public void verifyInputFields(List<String> inputField) {

        for (String each : inputField) {
            WebElement element = WebDriverUtils.getDriver().findElement(By.xpath("//input[@placeholder=\"" + each + "\"]"));

            if (element.isDisplayed()) {
                СucumberLogUtils.logPass(each + " input field is displayed as expected", false);
            } else {
                СucumberLogUtils.logFail(each + " input field is NOT displayed", false);
            }
        }
    }

    public void verifyFieldsDropDown(List<String> dropDown, String dropDownName) {

        WebElement element = WebDriverUtils.getDriver().findElement(By.id(dropDownName.toLowerCase()));

        Select select = new Select(element);

        List<WebElement> list = select.getOptions();

        List<String> listWeb = new ArrayList<>();

        list.forEach(a -> listWeb.add(a.getText()));

        MiscUtils.highlightElement(element).click();
        MiscUtils.sleep(2000);
        for (String each : dropDown) {
            if (listWeb.contains(each)) {
                СucumberLogUtils.logPass(each + " drop-down field are displayed as expected", false);
            } else {
                СucumberLogUtils.logFail(each + " drop-down field are NOT displayed as expected", false);
            }
        }
    }

    public void verifyColumnsName(List<String> columns) {
        List<WebElement> columnList = WebDriverUtils.getDriver().findElements(By.xpath("//tr/th"));
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < columnList.size() - 1; i++) {
            stringList.add(columnList.get(i).getText());
        }
        for (String each : columns) {
            if (columns.equals(stringList)) {
                СucumberLogUtils.logPass("Columns name " + each + " are displayed as expected", false);
            } else {
                СucumberLogUtils.logFail("Columns name  " + each + " are NOT displayed as expected", false);
            }
        }

    }
}

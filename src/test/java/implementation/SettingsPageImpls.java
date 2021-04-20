package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MainPage;
import pages.SettingsPage;
import utils.MiscUtils;
import utils.WebDriverUtils;
import utils.СucumberLogUtils;

import java.util.ArrayList;
import java.util.List;

public class SettingsPageImpls {
    public void clickLink(String linkName) {
        WebElement element = WebDriverUtils.getDriver().findElement(By.id(linkName.toLowerCase()));
        MiscUtils.highlightElement(element).click();
        MiscUtils.sleep(1000);
        СucumberLogUtils.logPass(linkName + " link was successfully clicked ", true);
    }

    private SettingsPage settingsPage;

    private SettingsPage getPage() {
        if (settingsPage == null) {
            settingsPage = new SettingsPage(WebDriverUtils.getDriver());
        }
        return settingsPage;
    }

    public void displayedType(String entry) {

        WebElement element = WebDriverUtils.getDriver().findElement(By.xpath("//*[contains(text(),\"" + entry + "\")]"));

        if (element.isDisplayed()) {

            СucumberLogUtils.logPass(entry + " new fixed income is displayed", true);
        } else {
            СucumberLogUtils.logFail(entry + " new fixed income is NOT displayed", true);
        }
    }

    public void adding_to_window(String data) {


        WebElement element = WebDriverUtils.getDriver().findElement(By.xpath("//input[@class ='form-control']"));
        element.sendKeys(data);
        if (element.isDisplayed()) {
            СucumberLogUtils.logPass(data + " new type is successfully added", false);
        } else {
            СucumberLogUtils.logFail(data + " new data is NOT added", false);

        }
    }


    public void pressingEnter(String enter) {

        WebElement element = WebDriverUtils.getDriver().findElement((By.xpath("//button[@class='btn btn-outline-secondary']")));
        MiscUtils.highlightElement(element).click();
        if (element.isDisplayed()) {
            СucumberLogUtils.logPass(enter + " button was successfully clicked", false);
        } else {
            СucumberLogUtils.logFail(enter + " button was NOT clicked", false);

        }

    }

    public void deletingNewEntry(String newEntry) {

        WebElement element = WebDriverUtils.getDriver().findElement(By.xpath("//*[contains(text(),\"" + newEntry + "\")]/button[@class='delete']"));
        element.click();
        MiscUtils.sleep(500);

        try {

            WebElement element1 = WebDriverUtils.getDriver().findElement(By.xpath("//*[contains(text(),\"" + newEntry + "\")]"));
            СucumberLogUtils.logFail(newEntry + " was Not deleted", true);
        } catch (NoSuchElementException e) {
            СucumberLogUtils.logPass(newEntry + " was successfully deleted", true);
        }
    }

    //   Negative

    public void isNotDisplayedType(String entry) {
        try {

            WebElement element = WebDriverUtils.getDriver().findElement(By.xpath("//*[contains(text(),\"" + entry + "\")]"));


            СucumberLogUtils.logFail(entry + " new fixed income is displayed", true);
        } catch (NoSuchElementException e) {
            СucumberLogUtils.logPass(entry + " new fixed income is Not displayed", true);
        }

    }

    public void refreshingPage() {
        WebDriverUtils.getDriver().navigate().refresh();
        СucumberLogUtils.logPass("Page was refreshed", true);
    }

    public void gettingTitle() {
        String title = WebDriverUtils.getDriver().getTitle();
        СucumberLogUtils.logPass(title + "  is the title of the page", true);

    }

    public void addingFixedCost(String fCost) {


        List<WebElement> element = WebDriverUtils.getDriver().findElements(By.xpath("//input[@class ='form-control']"));
        WebElement fixedCost = element.get(2);
        fixedCost.sendKeys(fCost);
        if (fixedCost.isDisplayed()) {
            СucumberLogUtils.logPass(fCost + " new type is successfully added", false);
        } else {
            СucumberLogUtils.logFail(fCost + " new data is NOT added", false);

        }
    }

    public void pressingCostEnter(String enter) {

        List<WebElement> element = WebDriverUtils.getDriver().findElements((By.xpath("//button[@class='btn btn-outline-secondary']")));
        MiscUtils.highlightElement(element.get(2)).click();
        if (element.get(2).isDisplayed()) {
            СucumberLogUtils.logPass(enter + " button was successfully clicked", false);
        } else {
            СucumberLogUtils.logFail(enter + " button was NOT clicked", false);

        }
    }

    public void verifyTypeCostDropDown(String cost, String dropDownName) {

        WebElement element = WebDriverUtils.getDriver().findElement(By.id(dropDownName.toLowerCase()));

        Select select = new Select(element);

        List<WebElement> optionsList = select.getOptions();


        //  List<String> listWeb = new ArrayList<>();
        //for (int i = 0; i < optionsList.size(); i++) {
             for (WebElement each : optionsList) {
            ///  list.forEach(a -> listWeb.add(a.getText()));

            MiscUtils.highlightElement(element).click();
            MiscUtils.sleep(500);
            if (each.toString().contains(cost)) {

                СucumberLogUtils.logPass("All drop-down fields are displayed as expected", true);
            } else {
                System.out.println(each.toString());
                System.out.println(cost);
                continue;

            }

            СucumberLogUtils.logFail("Drop-down fields are NOT displayed as expected", true);

        }

    }
}



package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.MiscUtils;
import utils.WebDriverUtils;
import utils.СucumberLogUtils;

import java.util.*;

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

    public Map<String, Double> readDataTable() {
        List<WebElement> amount = WebDriverUtils.getDriver().findElements(By.xpath("//tr[*]//td[3]"));
        List<WebElement> incomeType = WebDriverUtils.getDriver().findElements(By.xpath("//tr[*]//td[4]"));

        Map<String, Double> map = new HashMap<>();

        for (int i = 0; i < incomeType.size(); i++) {
            String k = incomeType.get(i).getText();
            double v = Double.parseDouble(amount.get(i).getText());

            if (map.containsKey(k)) {
                map.put(k, map.get(k) + v);
            } else {
                map.put(k, v);
            }
        }

        for (Map.Entry<String, Double> each : map.entrySet()) {
            СucumberLogUtils.logInfo("Total for each Type: " + each.getKey() + " = " + each.getValue());
        }

        return map;
    }

    public List<String> calcPercentages() {
        Map<String, Double> map = readDataTable();
        double totalAmount = 0;
        List<String> percentagesList = new ArrayList<>();

        for (Map.Entry<String, Double> each : map.entrySet()) {
            totalAmount += each.getValue();
        }

        for (Map.Entry<String, Double> each : map.entrySet()) {
            int temp = (int) Math.round((each.getValue() * 100) / totalAmount);
            String strTemp = temp + "% " + each.getKey();
            percentagesList.add(strTemp);
        }
        Collections.sort(percentagesList);
        СucumberLogUtils.logInfo("Total Amount: " + totalAmount);
        percentagesList.forEach(each -> СucumberLogUtils.logInfo("Percentages for each type: " + each));

        return percentagesList;
    }

    public void validatePieChart() {
        JavascriptExecutor js = (JavascriptExecutor) WebDriverUtils.getDriver();
        js.executeScript("window.scrollBy(0,460)");
        СucumberLogUtils.logPass("", true);

        List<String> percentagesList = calcPercentages();
        List<WebElement> uiChart = WebDriverUtils.getDriver().findElements(By.cssSelector("#root > div > div > svg > text"));

        List<String> strUiChart = new ArrayList<>();
        uiChart.forEach(each -> strUiChart.add(each.getText()));
        Collections.sort(strUiChart);

        if (percentagesList.equals(strUiChart)) {
            js.executeScript("window.scrollBy(0,750)");
            СucumberLogUtils.logPass("Pie Chart are displayed as expected", true);
        } else {
            СucumberLogUtils.logFail("Pie Chart are NOT displayed as expected", true);
        }

    }
}
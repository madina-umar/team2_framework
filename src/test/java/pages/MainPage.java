package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebDriverUtils;

import java.util.List;

public class MainPage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div//p[contains(text(),'Income')]//following-sibling::p")
    public List<WebElement> mainPageIncomeDollarValue;

    @FindBy(xpath = "//div//p[contains(text(),'Expense')]//following-sibling::p")
    public List<WebElement> mainPageExpensDollarValue;

    @FindBy(xpath = "//div//p[contains(text(),'Revenue')]//following-sibling::p")
    public List<WebElement> mainPageRevenueDollarValue;


}

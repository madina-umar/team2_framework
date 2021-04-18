package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {
    public SummaryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//nav[1]//div[1]//div//p[@class='title']")
    public WebElement currentMonthExpense;

    @FindBy(xpath = "//nav[2]//div[1]//div//p[@class='title']")
    public WebElement lastMonthExpense;

    @FindBy(xpath = "//nav[3]//div[1]//div//p[@class='title']")
    public WebElement currentYearExpense;

    @FindBy(xpath = "//nav[4]//div[1]//div//p[@class='title']")
    public WebElement lastFiveYearsExpense;

    @FindBy(xpath = "//nav[1]//div[2]//div//p[@class='title']")
    public WebElement currentMonthIncome;

    @FindBy(xpath = "//nav[2]//div[2]//div//p[@class='title']")
    public WebElement lastMonthIncome;

    @FindBy(xpath = "//nav[3]//div[2]//div//p[@class='title']")
    public WebElement currentYearIncome;

    @FindBy(xpath = "//nav[4]//div[2]//div//p[@class='title']")
    public WebElement lastFiveYearsIncome;
}

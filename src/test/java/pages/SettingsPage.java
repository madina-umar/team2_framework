package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.SettingsPageSteps;
import utils.WebDriverUtils;

import java.util.List;


public class SettingsPage extends SettingsPageSteps {
    public SettingsPage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);

    }
    @FindBy(xpath = "//div[@class='input-group']")
    public List <WebElement>  inputFields;

    @FindBy(xpath = "//button[@class='btn btn-outline-secondary']")
    public List <WebElement>  enterButtons;







}

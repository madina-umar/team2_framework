package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class MainPage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }
}

package pages;

import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }
}

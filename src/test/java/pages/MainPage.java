package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}

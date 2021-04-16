package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.SettingsPage;

public class SettingsPageSteps {

    SettingsPage settingsPage = new SettingsPage();

    @Then("Adding {string} to Fixed income window")
    public void adding_to_window(String data) {
        settingsPage.inputFields.get(0).sendKeys(data);


    }

    @Then("I am pressing Enter button")
    public void iAmPressingEnterButton() {
        settingsPage.enterButtons.get(0).click();
    }

    @Then("I am verifying {string} displayed in Fixed Income field")
    public void i_am_verifying_displayed_in_field(String entry) {
    //    ("//*[contains(text(), '"+entry+"')]")




    }
}

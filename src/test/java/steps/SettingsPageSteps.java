package steps;

import implementation.SettingsPageImpls;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import pages.SettingsPage;

public class SettingsPageSteps {

    SettingsPageImpls settingsPageImpls = new SettingsPageImpls();

    @Then("Adding {string} to Fixed income window")
    public void adding_to_window(String data) {settingsPageImpls.adding_to_window(data);



    }
    @Then("I am pressing {string} button")
    public void iAmPressingButton(String enter) {settingsPageImpls.pressingEnter(enter);
    }






        //     ("//*[contains(text(), '"+entry+"')]")


    @Then("I am verifying {string} displayed in Fixed Income  field")
    public void iAmVerifyingDisplayedInFixedIncomeField(String entry) { settingsPageImpls.displayedType(entry);
    }


    @And("I am deleting {string} entry from the field")
    public void iAmDeletingEntryFromTheField(String newEntry) { settingsPageImpls.deletingNewEntry(newEntry);
    }

    @Then("I am verifying {string} is not displayed in Fixed Income  field")
    public void iAmVerifyingIsNotDisplayedInFixedIncomeField(String entry) { settingsPageImpls.isNotDisplayedType(entry);
    }

    @Then("Refreshing page")
    public void refreshingPage() { settingsPageImpls.refreshingPage();
    }

    @And("Getting title of the page")
    public void gettingTitleOfThePage() { settingsPageImpls.gettingTitle();
    }
}

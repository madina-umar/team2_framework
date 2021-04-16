package implementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import utils.*;

import java.util.List;

public class MainPageImplementation {

    private MainPage mainPage;

    private MainPage getPage(){
        if(mainPage == null){
            mainPage = new MainPage(WebDriverUtils.getDriver());
        }
        return mainPage;
    }

    public void navigateToPage() {
        String url = ConfigReaderUtils.getProperty("url");
        WebDriverUtils.getDriver().get(url);

        CucumberLogUtils.logPass("Successfully navigated to the url", false);
    }

    public void validateCurrentPage(String pageName) {
        boolean pageIsDisplayed = false;
        pageIsDisplayed = WebDriverUtils.getDriver().getTitle().equals("PlanIT");

        if(pageIsDisplayed) {
           CucumberLogUtils.logPass(pageName + " page is displayed", true);
        }else{
          CucumberLogUtils.logFail(pageName + " page is NOT displayed", true);
      }

    }
    public void verifyDashboards(List<String> dashboardList) {

        for (String eachDashboardNavElement : dashboardList) {

            try {
                WebElement webElement = WebDriverUtils.getDriver().findElement(By.id(eachDashboardNavElement));

                if (webElement.isDisplayed()) {
                    CucumberLogUtils.logPass(eachDashboardNavElement + " dashboard is displayed as expected", false);
                }

            } catch (Exception e) {
                CucumberLogUtils.logFail(eachDashboardNavElement + " dashboard is NOT displayed", false);
            }

        }
        CucumberLogUtils.logPass("All the dashboards are displayed as expected: " + dashboardList, true);
    }
}

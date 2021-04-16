$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/mainPage(PLAN-1).feature");
formatter.feature({
  "name": "Landing Page test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Landing page should have navigation tabs",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I navigate to Project website",
  "keyword": "Given "
});
formatter.match({
  "location": "MainPageSteps.iNavigateToProjectWebsite()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat utils.CucumberLogUtils.logPass(CucumberLogUtils.java:21)\n\tat implementation.MainPageImplementation.navigateToPage(MainPageImplementation.java:25)\n\tat steps.MainPageSteps.iNavigateToProjectWebsite(MainPageSteps.java:14)\n\tat ✽.I navigate to Project website(file:src/test/resources/features/mainPage(PLAN-1).feature:4)\n",
  "status": "failed"
});
formatter.step({
  "name": "I should see the \"PlanIT\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "MainPageSteps.iShouldSeeThePage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify the following dashboards are displayed:",
  "rows": [
    {
      "cells": [
        "summary"
      ]
    },
    {
      "cells": [
        "income"
      ]
    },
    {
      "cells": [
        "expense"
      ]
    },
    {
      "cells": [
        "forecast"
      ]
    },
    {
      "cells": [
        "settings"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MainPageSteps.iVerifyTheFollowingDashboardsAreDisplayed(String\u003e)"
});
formatter.result({
  "status": "skipped"
});
});
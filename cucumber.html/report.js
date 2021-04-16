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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Project website",
  "keyword": "Given "
});
formatter.match({
  "location": "MainPageSteps.iNavigateToProjectWebsite()"
});
formatter.write("2021-04-16 14:45:03 PASS: Successfully navigated to the url");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the \"PlanIT\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "MainPageSteps.iShouldSeeThePage(String)"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.result({
  "error_message": "java.lang.AssertionError: 2021-04-16 14:45:06 FAIL: PlanIT page is NOT displayed\n\tat org.junit.Assert.fail(Assert.java:89)\n\tat utils.CucumberLogUtils.logFail(CucumberLogUtils.java:38)\n\tat implementation.MainPageImplementation.validateCurrentPage(MainPageImplementation.java:41)\n\tat steps.MainPageSteps.iShouldSeeThePage(MainPageSteps.java:19)\n\tat ✽.I should see the \"PlanIT\" page(file:src/test/resources/features/mainPage(PLAN-1).feature:5)\n",
  "status": "failed"
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
formatter.after({
  "status": "passed"
});
});
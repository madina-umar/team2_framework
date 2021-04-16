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
formatter.write("2021-04-16 14:36:32 PASS: Successfully navigated to the url");
formatter.result({
  "status": "passed"
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
formatter.write("2021-04-16 14:36:32 PASS: summary dashboard is displayed as expected");
formatter.write("2021-04-16 14:36:32 PASS: income dashboard is displayed as expected");
formatter.write("2021-04-16 14:36:32 PASS: expense dashboard is displayed as expected");
formatter.write("2021-04-16 14:36:32 PASS: forecast dashboard is displayed as expected");
formatter.write("2021-04-16 14:36:33 PASS: settings dashboard is displayed as expected");
formatter.write("2021-04-16 14:36:33 PASS: All the dashboards are displayed as expected: [summary, income, expense, forecast, settings]");
formatter.embedding("image/png", "embedded0.png", null);
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
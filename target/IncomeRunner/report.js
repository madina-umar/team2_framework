$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/income.feature");
formatter.feature({
  "name": "Income page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Income page",
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
formatter.write("2021-04-19 18:59:04 PASS: Successfully navigated to the url");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Income\" link",
  "keyword": "Then "
});
formatter.match({
  "location": "IncomeSteps.iClickLink(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat utils.СucumberLogUtils.logPass(СucumberLogUtils.java:21)\n\tat implementation.IncomePageImplementation.clickLink(IncomePageImplementation.java:17)\n\tat steps.IncomeSteps.iClickLink(IncomeSteps.java:14)\n\tat ✽.I click \"Income\" link(file:src/test/resources/features/income.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "I verify the following input fields are displayed:",
  "rows": [
    {
      "cells": [
        "Name"
      ]
    },
    {
      "cells": [
        "Description"
      ]
    },
    {
      "cells": [
        "Amount"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "IncomeSteps.iVerifyTheFollowingInputFieldsAreDisplayed(String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify the fields from dropdown \"Type\"",
  "rows": [
    {
      "cells": [
        "Type"
      ]
    },
    {
      "cells": [
        "Salary"
      ]
    },
    {
      "cells": [
        "Rental"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "IncomeSteps.iVerifyTheFieldsFromDropdown(String,String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify the fields from dropdown \"Frequency\"",
  "rows": [
    {
      "cells": [
        "Frequency"
      ]
    },
    {
      "cells": [
        "Daily"
      ]
    },
    {
      "cells": [
        "Weekly"
      ]
    },
    {
      "cells": [
        "Bi-weekly"
      ]
    },
    {
      "cells": [
        "Monthly"
      ]
    },
    {
      "cells": [
        "Bi-monthly"
      ]
    },
    {
      "cells": [
        "Quarterly"
      ]
    },
    {
      "cells": [
        "Annually"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "IncomeSteps.iVerifyTheFieldsFromDropdown(String,String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});
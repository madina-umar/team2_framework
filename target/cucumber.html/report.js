$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/income.feature");
formatter.feature({
  "name": "Income page - add new Income item",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@income"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Add an item to income and verify added item is displayed in main data table",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am navigating to \"Income\" page",
  "keyword": "Given "
});
formatter.step({
  "name": "I fill income form",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "name",
        "\u003cname\u003e"
      ]
    },
    {
      "cells": [
        "description",
        "\u003cdescription\u003e"
      ]
    },
    {
      "cells": [
        "amount",
        "\u003camount\u003e"
      ]
    },
    {
      "cells": [
        "type",
        "\u003ctype\u003e"
      ]
    },
    {
      "cells": [
        "frequency",
        "\u003cfrequency\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "I validate added item is displayed in main data table",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "name",
        "\u003cname\u003e"
      ]
    },
    {
      "cells": [
        "description",
        "\u003cdescription\u003e"
      ]
    },
    {
      "cells": [
        "amount",
        "\u003camount\u003e"
      ]
    },
    {
      "cells": [
        "type",
        "\u003ctype\u003e"
      ]
    }
  ]
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "description",
        "amount",
        "type",
        "frequency"
      ]
    },
    {
      "cells": [
        "User",
        "PLAN-6",
        "30",
        "Salary",
        "Weekly"
      ]
    },
    {
      "cells": [
        "Jane",
        "PLAN-6",
        "99",
        "Rental",
        "Monthly"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add an item to income and verify added item is displayed in main data table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@income"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am navigating to \"Income\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "IncomeSteps.i_am_navigating_to_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill income form",
  "rows": [
    {
      "cells": [
        "name",
        "User"
      ]
    },
    {
      "cells": [
        "description",
        "PLAN-6"
      ]
    },
    {
      "cells": [
        "amount",
        "30"
      ]
    },
    {
      "cells": [
        "type",
        "Salary"
      ]
    },
    {
      "cells": [
        "frequency",
        "Weekly"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "IncomeSteps.i_fill_income_form(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate added item is displayed in main data table",
  "rows": [
    {
      "cells": [
        "name",
        "User"
      ]
    },
    {
      "cells": [
        "description",
        "PLAN-6"
      ]
    },
    {
      "cells": [
        "amount",
        "30"
      ]
    },
    {
      "cells": [
        "type",
        "Salary"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "IncomeSteps.iValidateAddedItemIsDisplayedInMainDataTable(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Add an item to income and verify added item is displayed in main data table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@income"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am navigating to \"Income\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "IncomeSteps.i_am_navigating_to_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill income form",
  "rows": [
    {
      "cells": [
        "name",
        "Jane"
      ]
    },
    {
      "cells": [
        "description",
        "PLAN-6"
      ]
    },
    {
      "cells": [
        "amount",
        "99"
      ]
    },
    {
      "cells": [
        "type",
        "Rental"
      ]
    },
    {
      "cells": [
        "frequency",
        "Monthly"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "IncomeSteps.i_fill_income_form(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate added item is displayed in main data table",
  "rows": [
    {
      "cells": [
        "name",
        "Jane"
      ]
    },
    {
      "cells": [
        "description",
        "PLAN-6"
      ]
    },
    {
      "cells": [
        "amount",
        "99"
      ]
    },
    {
      "cells": [
        "type",
        "Rental"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "IncomeSteps.iValidateAddedItemIsDisplayedInMainDataTable(String,String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/main.feature");
formatter.feature({
  "name": "Main",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Main",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Login in to main page",
  "keyword": "Given "
});
formatter.match({
  "location": "MainSteps.login_in_to_main_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/features/settings.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am navigating to \"main\" page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I am navigating to \"settings\" page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Adding \"Dividends\" to Fixed income window",
  "keyword": "And "
});
formatter.match({
  "location": "SettingsPageSteps.adding_to_window(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I am pressing Enter button",
  "keyword": "Then "
});
formatter.match({
  "location": "SettingsPageSteps.iAmPressingEnterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I am verifying \"Dividends\" displayed in Fixed Income  field",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});
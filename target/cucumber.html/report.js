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
  "status": "passed"
});
formatter.step({
  "name": "Login in to main page",
  "keyword": "Given "
});
formatter.match({
  "location": "MainSteps.login_in_to_main_page()"
});
formatter.write("2021-04-15 18:35:50 PASS: Main Page");
formatter.embedding("image/png", "embedded0.png", null);
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
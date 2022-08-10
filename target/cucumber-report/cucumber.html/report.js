$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "User Checking Functionality",
  "description": "",
  "id": "user-checking-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8884665800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "validation of careers functionality",
  "description": "",
  "id": "user-checking-functionality;validation-of-careers-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouseHover on careers tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on students \u0026 graduates tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should varify text we are currently looking for",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should be able to click on submit your cv tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 420980300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iMouseHoverOnCareersTab()"
});
formatter.result({
  "duration": 173378800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnStudentsGraduatesTab()"
});
formatter.result({
  "duration": 85140100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldVarifyTextWeAreCurrentlyLookingFor()"
});
formatter.result({
  "duration": 601440800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldBeAbleToClickOnSubmitYourCvTab()"
});
formatter.result({
  "duration": 62100,
  "status": "passed"
});
formatter.after({
  "duration": 982555500,
  "status": "passed"
});
});
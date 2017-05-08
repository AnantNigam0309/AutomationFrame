$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testModule.feature");
formatter.feature({
  "line": 1,
  "name": "This is a Test file used to do a dry run",
  "description": "",
  "id": "this-is-a-test-file-used-to-do-a-dry-run",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test Scene",
  "description": "",
  "id": "this-is-a-test-file-used-to-do-a-dry-run;test-scene",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am navigating to site",
  "keyword": "Given "
});
formatter.match({
  "location": "testModule.NavigateToSite()"
});
formatter.result({
  "duration": 121185698,
  "status": "passed"
});
});
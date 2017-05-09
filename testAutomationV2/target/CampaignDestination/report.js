$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testModule.feature");
formatter.feature({
  "line": 1,
  "name": "This is a Test file used to do a dry run",
  "description": "",
  "id": "this-is-a-test-file-used-to-do-a-dry-run",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Test Scene",
  "description": "",
  "id": "this-is-a-test-file-used-to-do-a-dry-run;test-scene",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@CsTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am navigating to site",
  "keyword": "Given "
});
formatter.match({
  "location": "testModule.NavigateToSite()"
});
formatter.result({
  "duration": 87680612,
  "status": "passed"
});
});
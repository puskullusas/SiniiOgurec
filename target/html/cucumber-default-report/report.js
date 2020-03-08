$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/test.feature");
formatter.feature({
  "name": "Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Test1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I do some step",
  "keyword": "When "
});
formatter.match({
  "location": "TestStesp.i_do_some_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I do another step",
  "rows": [
    {
      "cells": [
        "a",
        "b"
      ]
    },
    {
      "cells": [
        "c",
        "d"
      ]
    },
    {
      "cells": [
        "e",
        "f"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TestStesp.i_do_another_step(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I validate the outcomes",
  "rows": [
    {
      "cells": [
        "Header1",
        "Header2",
        "Header3"
      ]
    },
    {
      "cells": [
        "Data 1.1",
        "Data 1.2",
        "Data 1.3"
      ]
    },
    {
      "cells": [
        "Data 2.1",
        "Data 2.2",
        "Data 2.3"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestStesp.i_validate_the_outcomes(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "I check for the \u003cvalue\u003e in step",
  "keyword": "When "
});
formatter.step({
  "name": "I verify the \u003cvalue\u003e  and \"\u003cstatus\u003e\" in step",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "value",
        "status"
      ]
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ]
    },
    {
      "cells": [
        "name2",
        "7",
        "Fail"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I check for the 5 in step",
  "keyword": "When "
});
formatter.match({
  "location": "TestStesp.i_check_for_the_in_step(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify the 5  and \"success\" in step",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStesp.i_verify_the_and_in_step_if_we_use_quotes_it_will_see_it_as_a_string(Integer,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I check for the 7 in step",
  "keyword": "When "
});
formatter.match({
  "location": "TestStesp.i_check_for_the_in_step(Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify the 7  and \"Fail\" in step",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStesp.i_verify_the_and_in_step_if_we_use_quotes_it_will_see_it_as_a_string(Integer,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});
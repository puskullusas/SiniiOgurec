$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/addEmpAsel.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I logged into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmplStepsAsel.i_am_logged_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to Add Empl Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmplStepsAsel.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add and Modify Employee Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I enter employee details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "MiddleName",
        "LastName"
      ]
    },
    {
      "cells": [
        "MAri",
        "J",
        "Louisa"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddEmplStepsAsel.i_enter_employee_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clicked Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmplStepsAsel.i_click_Save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am able to modify Employee Details",
  "rows": [
    {
      "cells": [
        "DriverLisence",
        "ExpirationDate",
        "SSN",
        "SIN",
        "Gender",
        "MaritalStatus",
        "Nationality",
        "DOB"
      ]
    },
    {
      "cells": [
        "098766432",
        "2021-12-09",
        "xox-45-6789",
        "blob",
        "Male",
        "Other",
        "Afghan",
        "1980-10-10"
      ]
    },
    {
      "cells": [
        "756483909",
        "2018-12-09",
        "xxx-45-6789",
        "blab",
        "Female",
        "Single",
        "Burmese",
        "1980-10-10"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmplStepsAsel.modifyEmployeeDetails(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
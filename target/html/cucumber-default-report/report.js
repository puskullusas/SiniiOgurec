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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027txtUsername\u0027]\"}\n  (Session info: chrome\u003d80.0.3987.132)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-HKBDLIP\u0027, ip: \u0027192.168.1.145\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\mama\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:54285}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: dfcd9f7a9def34c365766be14b7f11fb\n*** Element info: {Using\u003dname, value\u003dtxtUsername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.clear(Unknown Source)\r\n\tat com.hrms.utils.CommonMethods.sendText(CommonMethods.java:200)\r\n\tat com.hrms.pages.LogPgAsel.login(LogPgAsel.java:34)\r\n\tat com.hrms.steps.AddEmplStepsAsel.i_am_logged_into_HRMS(AddEmplStepsAsel.java:37)\r\n\tat ✽.I logged into HRMS(file:src/test/resources/features/addEmpAsel.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I navigated to Add Empl Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmplStepsAsel.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.step({
  "name": "I clicked Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmplStepsAsel.i_click_Save()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});
@F3
Feature: Updates Employee

  Background: 
    Given user generates token

@SyntaxHRMSAPIEndToEnd22
  Scenario: This test will check to see if an Empl is updated
    Given user calls updateEmployee API
    When user sends the request of updated employee
    Then user validates status code is 200
    Then user validates employee is updated

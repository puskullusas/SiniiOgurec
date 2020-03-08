@F4
Feature: Deleting Employee

  Background:
  Given user generates token
#@APITEST1
  Scenario: check if the employee is deleted
    Given user calls deleteEmployee API
    When user sends the request of delete employee
    Then user validates status code of deleted employee is 200
    Then user validates employee is deleted

@F3
Feature: Updating Employee

  Background: 
    Given user generates token

#@APITEST1
  Scenario: This test will check to see if an Employee is updated
    Given user calls updateEmployee API
    When user sends the request of updated employee
    Then user validates status code is 200
    Then user validates employee is updated

@F5
Feature: Validating All Employees Statusses
Background:
Given user generates token
  
@APITEST1
  Scenario: This test will verify Status of all employees
  Given user calls get EmployeeStatus Api
  When user gets Response
  Then Status is 200
  Then user verifies Statuses
  
  
    

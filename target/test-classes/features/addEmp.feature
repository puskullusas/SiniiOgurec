#Author: puskullusas
@sprint2 @addEmployee
Feature: Add employee
  
  Background: 
    Given I am logged into HRMS
    And I navigated to Add Employee Page
################################################
  @smoke
  Scenario: Adding new employee
    When I add "John", "S" and "Smith"
    And I click Save bttn
   
    Then I see the Employee has been added
#################################################
  #@regression
  #Scenario Outline: Add new Employee
    #When I add "<FirstName>", "<MiddleName>" and "<LastName>" 
    #And I click Save bttn
    #Then I see Employee with "<FirstName>", "<MiddleName>" and "<LastName>" is displayed
#
    #Examples: 
      #| FirstName | MiddleName | LastName     |
      #| Maria     | M          | Marianovich  |
      #| Georgina  | G          | Georginovich |
      #| Kuzina    | K          | Kuzinovich   |
      
    Scenario Outline: Add Employee without employee id
    
    When I add "<firstName>", "<middleName>" and "<lastName>"
     And I delete employee id
    And I click Save
    Then I see employee without employee id is being added
  Examples:
    |firstName|middleName|lastName| 
    |Kuzya|KuKushkin	|Kuzminovich|	
  
  
  #Scenario: Add Employee negative scenario
    #When I click Save
    #Then I see required error message next to the first and last name
#
  #Scenario: AddEmployee and Login Credentials
    #When I add firstName, middleName and last name
    #And I click on create login checkbox
    #And I enter username, password and confirm password
    #When I click Save
    #Then I see Employee has been succesfully added
      

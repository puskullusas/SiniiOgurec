@tag
Feature: Test
  
  @smoke
  Scenario: Test1
  
    When I do some step
     And I do another step
     |a|b|
     |c|d|
     |e|f|
    Then I validate the outcomes
    |Header1|Header2|Header3|
    |Data 1.1| Data 1.2| Data 1.3|
    |Data 2.1| Data 2.2| Data 2.3|
   
       
  @tag2
  Scenario Outline: Title of your scenario outline
 
 	 When I check for the <value> in step 
   Then I verify the <value>  and "<status>" in step 
   #if we use quotes it will see it as a string

    Examples: 
    # in scenario outline this first line is a header
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

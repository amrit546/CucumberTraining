Feature: Test Calculator
  I want to test add feaure in calculator

 
  Scenario: Add two numbers
    Given I enter 50 in calculator.
    And  I press add.
    And I have entered 50 in the calculator.
    When I press equal in the calculator. 
  
    Then I get the result as 100.


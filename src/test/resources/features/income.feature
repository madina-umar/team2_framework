@income
Feature: Income page - add new Income item

  Scenario Outline: Add an item to income and verify added item is displayed in main data table
    Given I am navigating to "Income" page
    And I fill income form
      | name        | <name>        |
      | description | <description> |
      | amount      | <amount>      |
      | type        | <type>        |
      | frequency   | <frequency>   |
    #Then I validate total amount was updated with previously added
      #| amount | <amount> |
    And I validate added item is displayed in main data table
      | name        | <name>        |
      | description | <description> |
      | amount      | <amount>      |
      | type        | <type>        |

    Examples:
      | name | description | amount | type   | frequency |
      | User | PLAN-6      | 30    | Salary | Weekly    |
      | Jane | PLAN-6      | 99   | Rental | Monthly   |

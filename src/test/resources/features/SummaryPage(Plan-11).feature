Feature: Summary Page - Expenses view

  Scenario: Sum of all expenses based on their dates should be displayed on Summary page
    Given I navigate to Project website
    Then  I verify the following elements are displayed:
      | Current month Expenses |
      | Last month  Expenses|
      | Current year  Expenses |
      | Last 5 years  Expenses |


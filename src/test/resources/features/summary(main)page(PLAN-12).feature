Feature: Summary page - Expenses view

  Scenario: Summary page should have sum of all expenses based on their dates
    Given I navigate to Project website
    Then I should see the "PlanIT" page
    Then I verify the following mainPage expense fields are displayed:
      | CURRENT MONTH expense |
      | LAST MONTH expense |
      | CURRENT YEAR expense |
      | LAST 5 YEAR expense |

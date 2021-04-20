Feature: Summary page - Expenses view

  Scenario: Summary page should have sum of all expenses based on their dates
    Given I navigate to Project website
    Then I should see the "PlanIT" page
    Then I verify the following mainPage income fields are displayed:
      | CURRENT MONTH Income |
      | LAST MONTH income |
      | CURRENT YEAR income |
      | LAST 5 YEAR income |

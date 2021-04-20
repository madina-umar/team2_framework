Feature: Summary page - Revenue view

  Scenario: Summary page should have correct revenue based on income and expense difference
    Given I navigate to Project website
    Then I should see the "PlanIT" page
    Then I verify the following mainPage revenue fields are displayed:
      | CURRENT MONTH revenue |
      | LAST MONTH revenue |
      | CURRENT YEAR revenue |
      | LAST 5 YEAR revenue |

Feature: Income page

  @PLAN-5
  Scenario: Income page
    Given I navigate to Project website
    Then I click "Income" link
    Then I verify the following input fields are displayed:
      | Name        |
      | Description |
      | Amount      |
    Then I verify the fields from dropdown "Type"
      | Type   |
      | Salary |
      | Rental |

    Then I verify the fields from dropdown "Frequency"
      | Frequency  |
      | Daily      |
      | Weekly     |
      | Bi-weekly  |
      | Monthly    |
      | Bi-monthly |
      | Quarterly  |
      | Annually   |

  @PLAN-2
  Scenario: PLAN-2 Income page - Data table
    Given I navigate to Project website
    Then I click "Income" link
    Then I should see the "PlanIT - Income" page
    Then I verify the following columns are displayed:
      | Name        |
      | Description |
      | Amount      |
      | Income Type |
      | Date        |

  @PLAN-2
  Scenario: PLAN-2 Income page - Data table
    Given I navigate to Project website
    Then I click "Income" link
    Then I should see the "PlanIT - Income" page
    Then I verify the following columns are displayed:
      | Name        |
      | Description |
      | Amount      |
      | Income Type |
      | Date        |
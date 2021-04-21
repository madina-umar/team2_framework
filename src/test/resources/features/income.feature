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

  @PLAN-7
  Scenario: PLAN-7 Income page - Pie chart
    Given I navigate to Project website
    Then I click "Income" link
    Then I read data form the table, Amount and Income Type columns
    And I calculate the percentages
    Then I validate the percentages on Pie chart
Feature: Summary Page - Income view

  Scenario: Sum of all income based on their dates should be displayed on Summary page
    Given I navigate to Project website
    Then  I verify the following elements are displayed:
      | Current month Income |
      | Last month Income   |
      | Current year Income  |
      | Last 5 years Income |


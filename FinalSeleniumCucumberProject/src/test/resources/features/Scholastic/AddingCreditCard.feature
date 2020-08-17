Feature: Credit card verification

Scenario: I add credit card and verify it is displayed when shopping using credit card
    Given I am on the Homepage
     When I Login
      And I go to My Accounts page
      And I add credit card number 4916998634060065
     Then I verify credit card ending 0065 is added successfully in My Accounts
      And I verify added card ending 0065 is displayed when shopping using credit card
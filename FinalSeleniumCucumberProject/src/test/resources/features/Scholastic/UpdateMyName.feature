Feature: I update my name

Scenario: I update my name
    Given I am on the Homepage
     When I Login
      And I go to My Accounts page
      And I update the name to Happy
     Then I verify name is updated successfully in My Accounts
      And I verify name is updated successfully in Page Header
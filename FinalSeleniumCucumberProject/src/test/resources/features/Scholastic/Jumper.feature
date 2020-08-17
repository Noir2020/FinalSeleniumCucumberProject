Feature: Jumper

Scenario: I verify jumper is displayed
    Given I am on the Homepage
     When I Login
      And I go to YTO page
      And I go to By Flyer tab
      And I click on BonusPoint-Qty box
     Then I verify jumper is NOT displayed
      And I click on Price-Qty box
     Then I verify jumper is displayed



Scenario: I verify jumper is NOT displayed twice
    Given I am on the Homepage
     When I Login
      And I go to YTO page
      And I go to By Flyer tab
      And I click on Price-Qty box
     Then I verify jumper is displayed
     When I click on Price-Qty again
     Then I verify jumper is NOT displayed
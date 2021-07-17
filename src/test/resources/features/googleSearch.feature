Feature: Google search functionality


  Scenario: User search title verification

  Scenario: Search page title verification
    Given User is on Google Home Page
    Then  User should see title is Google

    Given User is on Google Home Page
    When User searches for apple
    Then User should see apple in the title
Feature: Etsy search page


  Scenario: Etsy default title verification
    Given user is on Etsy landing page
    Then user should see the Etsy title as expected

# expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  @wip

  Scenario: Etsy Search Functionality Title Verification
    Given user is on Etsy landing page
    When  user types Wooden Spoon
    And user clicks to search button
    Then user sees title is Wooden Spoon | Etsy
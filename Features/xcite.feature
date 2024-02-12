@XciteTest
Feature: Test Login feature

@TestLogin
  Scenario: Xcite login and search
    Given I navigate to homepage
    And I login with username password
    Then I search with keyword "iphone"
    Then select 2nd search result and click on add to cart
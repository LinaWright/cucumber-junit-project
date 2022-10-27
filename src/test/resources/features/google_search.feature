@smoke
Feature: Google Search Functionality Title Verification
   User story:
   As a user, When I an on the Google search page
   I should be able to search whatever I want and see relevant information

Background:
  Given User is on Google search page

  Scenario: Search functionality result functionality

  When User types apple in the google search box and clicks enter
  Then User sees apple – Google Search is in the google title

@googleSearch
  Scenario: Search functionality result functionality

    When User types "apple" in the google search box and clicks enter
    Then User sees "apple - Google Search" is in the google title
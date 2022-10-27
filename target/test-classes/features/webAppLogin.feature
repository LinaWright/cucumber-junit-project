@smoke
Feature: Users should be able to login with correct credentials
  Agile story:
  Background:
    Given user is in web table login page

  @webAppLogin
  Scenario: Web table login scenario

    When user enters username "Test"
    And user enters password "Tester"
    And user click login button
    Then user should see url contains orders


  Scenario: positive login scenario

    When use enters username "Test", password "Tester" and login
    Then user should see url contains orders

    Scenario: map data table practice
      When user enters below credentials
        | username | Test   |
        | password | Tester |
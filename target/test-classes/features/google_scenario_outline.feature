Feature: Data Driven testing using Scenario Outline

  @google_scenario_outline
  Scenario Outline:

    Given User is on Google search page
    When User searches for "<country>" capital
    Then  User should see "<capital>" in the result

    Examples: Google capital cities search.
      | country   | capital          |
      | China     | Beijing          |
      | USA       | Washington, D.C. |
      | Canada    | Ottawa           |
      | Australia | Canberra        |
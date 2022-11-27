Feature: Smoke
  As a user
  I want to have an opportunity to search for a specific book
  So that I can know whether the book is available

  Scenario Outline: Check presence of a book on search result page
    Given User opens the home page
    And page is loaded
    When user searches for '<searchKeyword>' via search field
    And page is loaded
    Then result page contains '<bookName>'

    Examples:
      | searchKeyword | bookName                        |
      | camilla       | Transfer Activity Book Unicorns |
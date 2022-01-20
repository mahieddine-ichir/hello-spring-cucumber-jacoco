# Created by michir at 19/01/2022
Feature: MyService
  check service operations implementation

  Scenario: addition
    Given Operation "add"

    When first number is 2
    And second number is 3
    Then result should be 5

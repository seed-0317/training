Feature: Play with dog

  Scenario: Dog catches frisbee
    Given I have a dog
    And the dog is rested
    When I throw the frisbee
    Then the dog catches the frisbee

  Scenario: Dog naps
    Given I have a dog
    And the dog is not rested
    Then the dog naps

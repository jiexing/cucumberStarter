@foo
  Feature: Calculator

    Scenario: Multiply
      When multiply 4 and 5
      Then the result is 20

    Scenario: Multiply Zero
      When multiply 5 and 0
      Then the result is 0
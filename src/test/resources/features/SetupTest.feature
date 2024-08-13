Feature: This feature to setup framework
@Smoke
Scenario: Validate top left corner logo
Then validate top left corner is TEKSCHOOL


@Smoke
  Scenario: Validate Logo and Sign in button
    Then validate top left corner is TEKSCHOOL
    Then Validate Sign in button is Enabled
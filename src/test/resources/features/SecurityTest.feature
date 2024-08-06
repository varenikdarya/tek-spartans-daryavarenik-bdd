@Smoke @Regression

Feature: Security tests scenarios

Scenario: Validate sign in functionality with valid credential
When user click on sign in link
Then validate user is in sign in page
When user enter "guardiansclass@gmail.com" and "Class2023!" and click on login
# When user enter username and password and click on login
Then user should be able to see account link

 Scenario Outline: Validate sign in with invalid credentials
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "<username>" and "<password>" and click on login
    Then user should see error "wrong username or password"
    Examples:
      | username                    | password      |
      | guardiansclass@gmail.com    | Class2023!    |
      | mohammad2536@gmail.com      | WrongPassword |
      | invalid@gmail.com           | WrongPassword |

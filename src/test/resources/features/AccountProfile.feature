@Regression
Feature: Account profile feature

  Background: Login to to account and setups
    Given user click on "Sign in" link
    Then validate user is in sign in page
    When user enter "guardiansclass@gmail.com" on "Email" field
    When user enter "Class2023!" on "Password" field
    When user click on "Login" button
    Then user should be able to see account link
    Given user click on "Account" link
    Then validate user is in account page

  @UserStory5
  Scenario: Change Name and phone number and validate
    When user enter "Maria" on "Name" field
    When user enter "2023233636" on "Phone Number" field
    When user click on "Update" button
    Then validate Toast Displayed
    When wait for 5 seconds
    Then validate account name is "Maria"
    When user enter "John" on "Name" field
    When user enter "1023022536" on "Phone Number" field
    When user click on "Update" button
    Then validate Toast Displayed

     @UserStory6
     Scenario: Change password
    When user enter "Class2023!" on "Previous Password" field
    When user enter "Class2024!" on "New Password" field
    When user enter "Class2024!" on "Confirm Password" field
    When user click on "Change Password" button
    Then validate Toast Displayed
    When wait for 5 seconds
    Then user enter "Class2024!" on "Previous Password" field
    When user enter "Class2023!" on "New Password" field
    When user enter "Class2023!" on "Confirm Password" field
    When user click on "Change Password" button
    Then validate Toast Displayed

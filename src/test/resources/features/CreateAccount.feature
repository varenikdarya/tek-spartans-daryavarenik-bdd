Feature: New Account Creation

Scenario Outline: Create new Account
          When user click on sign in link
          Then  user click on  Create new account link
          When user enter "Darya" and "spartansclass@gmail.com" and "Password123!" and "Password123!" click on Sign Up
          Then validate New Account Created.







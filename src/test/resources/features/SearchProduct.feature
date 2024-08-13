Feature: Search for a product on the Retail app landing page

  Scenario: Search for a product and validate results
   Then validate top left corner is TEKSCHOOL
   When the user searches for "laptop"
   Then the search results for "laptop" should be displayed on the page
   And the user should see relevant products listed with their details
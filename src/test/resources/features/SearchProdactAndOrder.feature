Feature: Search for a product on the Retail app landing page

   Scenario: Validate search result for a product and validate results
    @UserStory7
     Scenario Outline: Validate search result for a searched keyword
       When user enter "<SearchKeyWord>" on search bar and click search
       Then validate search result contains "<SearchKeyWord>" for all products
       Examples:
         | SearchKeyWord |
         | TV            |
         | Card          |
         | Keyboard      |
         | Xbox          |
         | LED           |
         | LG            |
         | Sony          |

     @UserStory8
       Scenario: Add product in cart and delete
         Given user click on "Sign in" link
         Then validate user is in sign in page
         When user enter "guardiansclass@gmail.com" on "Email" field
         When user enter "Class2023!" on "Password" field
         When user click on "Login" button
         Then user should be able to see account link
         When user enter "TV" on search bar and click search
         Then validate search result contains "TV" for all products
         When user click on first item in search result
         When user click on "Add to Cart" button
         When user click on cart link
         Then verify 1 item in the cart list
         When user delete all items in cart
         Then validate shopping cart is empty
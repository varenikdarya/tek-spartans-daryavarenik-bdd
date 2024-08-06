package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.AccountPage;
import tek.bdd.pages.SignInPage;
import tek.bdd.pages.SignUpPage;
import tek.bdd.utility.RandomGenerator;
import tek.bdd.utility.SeleniumUtility;

public class CreateAccountSteps extends SeleniumUtility {

    private static String emailToUse;


    @When("user enter {string} and {string}  and {string}")
    public void userEnterNewAccountInfo(String name, String email, String password) {
        emailToUse = email.equalsIgnoreCase("random")
                ? RandomGenerator.generateRandomEmail() : email;

        sendText(SignUpPage.NAME_INPUT, name);
        sendText(SignUpPage.EMAIL_INPUT, emailToUse);
        sendText(SignUpPage.PASSWORD_INPUT, password);
        sendText(SignUpPage.CONFIRM_PASSWORD_INPUT, password);
    }

    @Then("validate user is in account page")
    public void validateUserInAccountPage() {
        String actualText  = getElementText(AccountPage.PROFILE_PAGE_TITLE);

     Assert.assertEquals("Account page should contains Your Profile Text"
             ,"Your Profile", actualText);
}
    @Then("validate email address in account page match")
    public void validate_email_address_in_account_page_match() {
        String actualEmail = getElementText(AccountPage.PROFILE_EMAIL_TEXT);

        Assert.assertEquals("Email in Account page should match with email used in create account step",
                emailToUse, actualEmail);
    }

}
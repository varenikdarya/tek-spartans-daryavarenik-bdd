package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.ProfilePage;
import tek.bdd.pages.SignInPage;
import tek.bdd.pages.SignUpPage;
import tek.bdd.utility.SeleniumUtility;

public class CreateAccountSteps extends SeleniumUtility {
    @Then("user click on  Create new account link")
    public void user_click_on_create_new_account_link() {
        clickOnElement(SignInPage.CREATE_NEW_ACCOUNT_BUTTON);
    }
    @When("user enter {string} and {string} and {string} and {string} click on Sign Up")
    public void user_enter_and_and_and_click_on_sign_up(String name, String email, String password, String confirmPassword) {
       sendText(SignUpPage.NAME_INPUT, name);
        sendText(SignUpPage.EMAIL_INPUT, email);
        sendText(SignUpPage.PASSWORD_INPUT, password);
        sendText(SignUpPage.CONFIRM_PASSWORD_INPUT, confirmPassword);
        clickOnElement(SignUpPage.SIGN_UP_BUTTON);
    }
    @Then("validate New Account Created.")
    public void validate_new_account_created() {
        boolean isLogOutBtnEnabled = isElementEnabled(ProfilePage.LOGOUT_BUTTON);
        Assert.assertTrue(isLogOutBtnEnabled);
    }
}

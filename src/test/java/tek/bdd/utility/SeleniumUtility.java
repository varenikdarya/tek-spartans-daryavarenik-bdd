package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtility  extends BaseSetup {


    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }

    private WebElement waitForVisability(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void clickOnElement (By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator))
                .click();

    }

    public  void sendText(By locator, String value) {
getWait().until(ExpectedConditions.visibilityOfElementLocated(locator))
        .sendKeys(value);

    }

    public String getElementText(By locator) {
        return waitForVisability(locator).getText();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class CheckoutPage {

    private WebDriver driver;

    private By firstname = By.id("input-payment-firstname");
    private By lastname = By.id("input-payment-lastname");
    private By email = By.id("input-payment-email");
    private By telephone = By.id("input-payment-telephone");
    private By continueBtn = By.id("button-payment-address");

    private By errorMessage = By.cssSelector(".text-danger");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillRegistration(Map<String, String> data) {
        driver.findElement(firstname).sendKeys(data.get("firstname"));
        driver.findElement(lastname).sendKeys(data.get("lastname"));
        driver.findElement(email).sendKeys(data.get("email"));
        driver.findElement(telephone).sendKeys(data.get("telephone"));

        driver.findElement(continueBtn).click();
    }

    public void openRegistrationPage() {
        driver.get("https://tutorialsninja.com/demo/index.php?route=checkout/checkout");
    }

    public void fillInvalidRegistration() {
        driver.findElement(continueBtn).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}

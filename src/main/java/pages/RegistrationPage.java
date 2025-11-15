package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {
    WebDriver driver;
    WebDriverWait wait;

    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By email = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerBtn = By.id("register-button");

    By successMessage = By.cssSelector(".result");
    By errorMessage = By.cssSelector(".field-validation-error");

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open(){
        driver.get("https://demowebshop.tricentis.com/register");
    }

    public void fillRegistrationForm(String fName, String lName, String emailVal, String pwd){
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(email).sendKeys(emailVal);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(confirmPassword).sendKeys(pwd);
    }

    public boolean submitFormAndVerify(){
        driver.findElement(registerBtn).click();
        try {
            WebElement msg = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
            System.out.println("Registration success message: " + msg.getText());
            return msg.getText().contains("Your registration completed");
        } catch (Exception e){
            // If registration failed, print all error messages
            driver.findElements(errorMessage).forEach(el -> System.out.println("Field error: " + el.getText()));
            return false;
        }
    }
}

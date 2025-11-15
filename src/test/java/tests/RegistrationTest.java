package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTest extends BaseTest {

    @Test
    public void registerNewUser() {
        RegistrationPage regPage = new RegistrationPage(driver);
        regPage.open();

        // Generate unique email
        String uniqueEmail = "user" + System.currentTimeMillis() + "@test.com";

        regPage.fillRegistrationForm("Avadhut", "Patil", uniqueEmail, "Test@1234");

        boolean isRegistered = regPage.submitFormAndVerify();
        Assert.assertTrue(isRegistered, "Registration failed!");
    }
}

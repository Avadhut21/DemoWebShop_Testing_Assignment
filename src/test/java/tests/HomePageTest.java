package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.ReportManager;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitle() {
        HomePage home = new HomePage(driver);
        home.open();
        String title = home.getTitle();
        ReportManager.getTest().info("Page title: " + title);
        Assert.assertTrue(title.contains("Demo Web Shop"));
    }
}

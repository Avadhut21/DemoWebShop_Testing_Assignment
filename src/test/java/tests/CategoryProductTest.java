package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CategoryPage;
import pages.HomePage;
import utils.ReportManager;
import java.util.List;

public class CategoryProductTest extends BaseTest {

    @Test
    public void verifyCategories() {
        HomePage home = new HomePage(driver);
        home.open();

        CategoryPage category = new CategoryPage(driver);
        List<String> categories = category.getMainCategories();
        ReportManager.getTest().info("Categories: " + categories);
        Assert.assertTrue(categories.size() > 0);
    }
}

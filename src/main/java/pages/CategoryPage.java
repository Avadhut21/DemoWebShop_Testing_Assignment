package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;

public class CategoryPage {

    private WebDriver driver;

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<String> getMainCategories() {
        List<String> categories = new ArrayList<>();
        driver.findElements(By.cssSelector(".top-menu > li > a"))
              .forEach(e -> categories.add(e.getText()));
        return categories;
    }
}

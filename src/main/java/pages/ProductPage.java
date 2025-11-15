package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    private By addToCartBtn = By.id("button-cart");
    private By successAlert = By.cssSelector(".alert-success");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public boolean isAddedToCart() {
        return driver.findElements(successAlert).size() > 0;
    }
}

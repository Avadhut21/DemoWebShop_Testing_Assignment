package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;

    private By cartItems = By.cssSelector("table tbody tr");
    private By totalPrice = By.xpath("//strong[text()='Total:']/../following-sibling::td");
    private By checkoutBtn = By.linkText("Checkout");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getItemCount() {
        return driver.findElements(cartItems).size();
    }

    public double getTotalPrice() {
        return Double.parseDouble(driver.findElement(totalPrice).getText().replace("$", "").trim());
    }

    public void clickCheckout() {
        driver.findElement(checkoutBtn).click();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage {
	WebDriver driver;
    By proceedToCheckout = By.xpath("//a[contains(text(),'Proceed To Checkout')]");
    By placeOrder = By.xpath("//a[contains(text(),'Place Order')]");

    public PlaceOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkout() {
        driver.findElement(proceedToCheckout).click();
        driver.findElement(placeOrder).click();
    }
}

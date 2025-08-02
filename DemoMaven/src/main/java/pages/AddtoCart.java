package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoCart {
	WebDriver driver;

    By firstProductAddBtn = By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]");
    By viewCartBtn = By.xpath("//u[text()='View Cart']");

    public AddtoCart(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProductToCart() {
        driver.findElement(firstProductAddBtn).click();
        driver.findElement(viewCartBtn).click();
    }
}

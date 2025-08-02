package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

    By loginLink = By.xpath("//a[text()=' Signup / Login']");
    By emailField = By.xpath("//input[@data-qa='login-email']");
    By passwordField = By.xpath("//input[@data-qa='login-password']");
    By loginButton = By.xpath("//button[text()='Login']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}


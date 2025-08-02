package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	 WebDriver driver;
	    By loggedUser = By.xpath("//a[contains(text(),'Logged in as')]");

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public String getLoggedInUser() {
	        return driver.findElement(loggedUser).getText();
	    }
}

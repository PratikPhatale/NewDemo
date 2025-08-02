package test.com;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.AddtoCart;
import pages.HomePage;
import pages.LoginPage;
import pages.PlaceOrderPage;

@Listeners(utility.Listeners.class)
public class LoginTest extends BaseClass{
    @Test
    public void loginTest() {
    	
        LoginPage lp = new LoginPage(driver);
        lp.clickLoginLink();
        lp.login(prop.getProperty("email"), prop.getProperty("password"));

        HomePage hp = new HomePage(driver);
        System.out.println("Logged in user: " + hp.getLoggedInUser());
        
        AddtoCart ap = new AddtoCart(driver);
        ap.addFirstProductToCart();
        
        PlaceOrderPage po = new PlaceOrderPage(driver);
        po.checkout();
        
    }

}

package base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import utility.ConfigReader;

public class BaseClass {
 public static WebDriver driver;
	 
	 public static WebDriver getDriver() {
	        return driver;
	    }
	    public Properties prop;
	    

	    @BeforeClass
	    public void setup() {
	        prop = ConfigReader.initProperties();
	     //   System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get(prop.getProperty("url"));
	    }

	  //  @AfterClass
	  //  public void tearDown() {
	   //     driver.quit();
	    }
	//}




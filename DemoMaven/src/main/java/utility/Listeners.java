package utility;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseClass;

public class Listeners extends BaseClass implements ITestListener {
	 ExtentReports extent = ExtentReportManager.getReportInstance();
	    ExtentTest test;

	    public void onTestStart(ITestResult result) {
	        test = extent.createTest(result.getMethod().getMethodName());
	    }

	    public void onTestSuccess(ITestResult result) {
	        test.pass("Test passed: " + result.getMethod().getMethodName());
	    }

	    public void onTestFailure(ITestResult result) {
	    	WebDriver driver = BaseClass.getDriver();
	    	String testName = result.getName();
	        test.fail("Test failed: " + result.getMethod().getMethodName());
	        test.fail(result.getThrowable());
	        
	        String ScreenshotPath = NewScreenshots.captureScreenshot(driver,testName);
	        System.out.println("Screenshot saved at: " + ScreenshotPath);

	        // Optionally attach to Extent Report (if you use it)
	       // extent.fail("Test Failed. Screenshot: " + extent.addScreenCaptureFromPath(ScreenshotPath));
	    }

	    // Other methods like onTestStart, onTestSuccess can be overridden if needed
	

	    public void onFinish(org.testng.ITestContext context) {
	        extent.flush();
	    }
	    
	   
	}




package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	private static ExtentReports extent;

    public static ExtentReports getReportInstance()  {
        ExtentSparkReporter reporter = new   ExtentSparkReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
      //  extent.fail("Test Failed. Screenshot: " + extent.addScreenCaptureFromPath(Screenshotpath));
        return extent;
    }

}




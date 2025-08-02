package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class NewScreenshots {


	public static String captureScreenshot(WebDriver driver ,String testName) {
        TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String Screenshotpath = "screenshots/" + testName + "_" + timestamp + ".png";

        try {
            FileUtils.copyFile(src, new File(Screenshotpath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Screenshotpath;
	}
}





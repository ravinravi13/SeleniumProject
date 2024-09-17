package Utilities;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import BaseClass.Base;
import io.qameta.allure.Attachment;

public class Screenshot extends Base{

	 public static String captureScreenshot(RemoteWebDriver driver, String screenshotName) {
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        String dest = System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png";
	        File destination = new File(dest);
	        try {
	            FileUtils.copyFile(source, destination);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return dest;
	    }
	
	 
	 @Attachment(value = "Screenshot", type = "image/png")
	    public static byte[] captureStepScreenshot(RemoteWebDriver driver) {
	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        try {
	            return FileUtils.readFileToByteArray(source);
	        } catch (IOException e) {
	            e.printStackTrace();
	            return new byte[0];
	        }
	    }
	 
	 
	 
	 
	 
	 
	 
	 
	
}

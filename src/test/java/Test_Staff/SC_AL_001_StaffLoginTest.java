package Test_Staff;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Utilities.Locators;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class SC_AL_001_StaffLoginTest extends Base{

	@Description("Click the AlumniStaff button and enter valid email and password to verify the Staff page after login")
	@Test
	public void VerifyStaffLogin()
	{
		boolean value = isDisplay(Locators.xpath, "//h4[normalize-space(text())='Dashboard']");
		System.out.println(value);
		Screenshot.captureStepScreenshot(Base.driver);
	}
	
	
}

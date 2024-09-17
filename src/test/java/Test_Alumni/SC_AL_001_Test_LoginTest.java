package Test_Alumni;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_Alumni_Module.SC_AL_001_LoginPage_Alumni;
import Utilities.AllureListeners;
import Utilities.Locators;
import Utilities.Screenshot;
import io.qameta.allure.Description;
@Listeners({AllureListeners.class})
public class SC_AL_001_Test_LoginTest extends Base{
	
	@Test(priority=1,groups="ALumni_login")
	@Description("Verify the Alumni Login with correct credentails and Verify with text of 'Welcome to Alumni Helpdesk' ")
	public void TC001_VerifyLogin()
	{
		
		Browerlaunch("chrome");
		SC_AL_001_LoginPage_Alumni login = new SC_AL_001_LoginPage_Alumni();
		login.ClickAlumni_button();
		login.EnterEmail(prop.getProperty("Alumni_Email"));
		login.EnterPassword(prop.getProperty("Alumni_Password"));
		login.ClickLogin();
		Assert.assertEquals(Findelement(Locators.xpath, Base.LocatorsSetup("Verify_ALumni_login_loc")).getText(), "Welcome to Alumni Helpdesk");
        Screenshot.captureStepScreenshot(Base.driver);
		System.out.println("Login Successfully");
	}
	
	@Test(priority=2,groups="ALumni_login")
	@Description("Verify the Alumni Login with Incorrect credentails of Invalid Email and Verify the relavent error of 'User not found'")
	public void TC002_VerifyInavlidEmail()
	{
		Browerlaunch("chrome");
		SC_AL_001_LoginPage_Alumni login = new SC_AL_001_LoginPage_Alumni();
		login.ClickAlumni_button();
		login.EnterEmail("demouser200@yopmail.com");
		login.EnterPassword(Base.PropertiesSetup("Alumni_Password"));
		login.ClickLogin();
		boolean value = isDisplay(Locators.xpath, Base.LocatorsSetup("incorrect_user_msg"));
		Screenshot.captureStepScreenshot(Base.driver);
        Assert.assertEquals(value, true);
	}
	
	
	
	@Test(priority=3,groups="ALumni_login")
	@Description("Verify the Alumni Login with Incorrect credentails of Invalid Password and Verify the relavent error of 'Incorrect Password'")
	public void TC003_VerifyInvalidPassword()
	{
		Browerlaunch("chrome");
		SC_AL_001_LoginPage_Alumni login = new SC_AL_001_LoginPage_Alumni();
		login.ClickAlumni_button();
		login.EnterEmail(prop.getProperty("Alumni_Email"));
		login.EnterPassword("Wrongpass");
		login.ClickLogin();
		boolean value = isDisplay(Locators.xpath, Base.LocatorsSetup("incorrect_pass_msg"));
        Assert.assertEquals(value, true);
        Screenshot.captureStepScreenshot(Base.driver);
		
	}
	

}

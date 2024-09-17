package Test_Alumni;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_Alumni_Module.SC_AL_002_ForgetPassword_Alumni;
import Utilities.AllureListeners;
import Utilities.Locators;
import Utilities.Screenshot;
import io.qameta.allure.Description;
@Listeners({AllureListeners.class})
public class SC_AL_002_ForgetPassword_Test extends Base{

	SC_AL_002_ForgetPassword_Alumni forget = new SC_AL_002_ForgetPassword_Alumni();
	
	@Test(priority =1,groups="SC_AL_002")
	@Description("Verify the Reset password is working ")
	public void VerifyValidEmail()
	{
		Browerlaunch("chrome");
		forget.ClickAlumni_button();
		forget.ClickForgetPass();
		forget.EnterEmail(Base.PropertiesSetup("Alumni_Email"));
//		forget.ClickRestPassButton();
		Screenshot.captureStepScreenshot(Base.driver);
	
	}
	
	@Test(priority =2,groups="SC_AL_002")
	@Description("Verify the rest password of provide Invalid email of 'demouser200@yopmail.com' and validate with Error of 'The provided email address does not exist. Please provide the registered email address.'")
	public void VerifyInvalidEmail()
	{
		Browerlaunch("chrome");
		forget.ClickAlumni_button();
		forget.ClickForgetPass();
		forget.EnterEmail(Base.PropertiesSetup("error"));
		forget.ClickRestPassButton();
		Utilities.sleep(2);
		boolean value = isDisplay(Locators.xpath, Base.LocatorsSetup("unregister_mail_loc"));
		Assert.assertEquals(value, true, "Element is not Displayed");
		Screenshot.captureStepScreenshot(Base.driver);
	}
	
//	@Test(priority =3,groups="SC_AL_002")
	public void VerifyStaffEMail()
	{
		Browerlaunch("chrome");
		forget.ClickAlumni_button();
		forget.ClickForgetPass();
		forget.EnterEmail(Base.PropertiesSetup("Staff_email"));
		forget.ClickRestPassButton();
		Utilities.sleep(2);
		boolean value = isDisplay(Locators.xpath, Base.LocatorsSetup("unregister_mail_loc"));
		Assert.assertEquals(value, true, "Element is not Displayed");
	}
}

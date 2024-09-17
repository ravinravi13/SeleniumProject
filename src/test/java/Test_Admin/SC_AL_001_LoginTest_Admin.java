package Test_Admin;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.Base;
import Pages_AlumniAdmin.LoginPage_Admin;
import Utilities.Locators;
import Utilities.Screenshot;

public class SC_AL_001_LoginTest_Admin extends Base{

	
	
	 @Test(priority=1)
	 public void TC_001_VerifyAdminLogin()
	 {
   
		 LoginPage_Admin login = new LoginPage_Admin();
		 Browerlaunch("chrome");
		 login.ClickAlumni_button();
		 login.EnterEmail(Base.PropertiesSetup("Admin_Email"));
		 login.EnterPassword(Base.PropertiesSetup("Admin_Password"));
		 login.ClickLogin();
		 login.ClickProfile();
		 Screenshot.captureStepScreenshot(Base.driver);
	 }
	 
	 
	 @Test(priority=2)
		public void TC002_VerifyInavlidEmail()
		{
			Browerlaunch("chrome");
			 LoginPage_Admin login = new LoginPage_Admin();
			login.ClickAlumni_button();
			login.EnterEmail("demouser200@yopmail.com");
			login.EnterPassword("qazqazqaz");
			login.ClickLogin();
			if(Findelement(Locators.xpath, "//small[normalize-space(text())='User not found']").isDisplayed())
			{
				Screenshot.captureStepScreenshot(Base.driver);
				System.out.println("User not found is Displayed");
			}
		}
		@Test(priority=3)
		public void TC003_VerifyInvalidPassword()
		{
			Browerlaunch("chrome");
			 LoginPage_Admin login = new LoginPage_Admin();
			login.ClickAlumni_button();
			login.EnterEmail("alumniadmin@ilink-systems.com");
			login.EnterPassword("Wrongpass");
			login.ClickLogin();
			if(Findelement(Locators.xpath, "//small[normalize-space(text())='Incorrect password !']").isDisplayed())
			{
				Screenshot.captureStepScreenshot(Base.driver);
				System.out.println("Incorrect password is Displayed");
			}
		}
	
	
}

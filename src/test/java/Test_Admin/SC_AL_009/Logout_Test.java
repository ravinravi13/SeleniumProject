package Test_Admin.SC_AL_009;

import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.Logout.Logout_Admin;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class Logout_Test extends Base{
	Logout_Admin Objlogout = new Logout_Admin();
	
	@Description("Verify Admin Able to Logout")
	@Test
	public void VerifyLogout()
	{
		Objlogout.ClickLogout();
		Utilities.sleep(3);
		Screenshot.captureStepScreenshot(Base.driver);
		
		
	}
	
	
}

package Test_Alumni;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_Alumni_Module.SC_AL_006_Logout_Alumni;
import Utilities.Screenshot;

public class SC_AL_006_Test_Logout extends Base{
	
	
	SC_AL_006_Logout_Alumni logout = new SC_AL_006_Logout_Alumni();
	
    @Test
	public void VerifyLogout()
	{
		logout.ClickLogout();
		Utilities.sleep(3);
		Screenshot.captureStepScreenshot(Base.driver);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

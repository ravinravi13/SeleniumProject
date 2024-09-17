package Test_Alumni;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_Alumni_Module.SC_AL_005_SearchBox_Alumni;
import Utilities.CommonFunction;
import Utilities.Locators;
import Utilities.Screenshot;

public class SC_AL_005_Test_SearchBox extends Base{
	
	SC_AL_005_SearchBox_Alumni search = new SC_AL_005_SearchBox_Alumni();
	
	
	
	@Test
	public void VerifyPass_Ticket_ID()
	 {
		 search.ClickMyRequest();
		 String actual = "208 ";
		 search.enterSerachBox(actual);
		 Utilities.sleep(2);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 Utilities.sleep(4);	 
         String expected = search.GetticketId();
		 Assert.assertEquals(actual, expected,"Search value is not Matched");
		 Screenshot.captureStepScreenshot(Base.driver);
	 }
	
	
	

}

package Test_Admin.Manage.SC_AL_006;

import org.testng.annotations.Test;

import BaseClass.Base;
import Pages_AlumniAdmin.Manage.Oraganization.Oraganization;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class Organization_Test extends Base{

	
	@Description("Verify able to create department in manage section")
	//@Test
	public void VerifyCreateNewDepartment()
	{
		Oraganization org = new Oraganization();
		org.ClickManage();
		org.ClickOranization();
		org.EnterDepartment("Dummy Department");
		org.EnterDescription("Dummy Description");
		org.SelectOrganization("iLink Alumni");
		Screenshot.captureStepScreenshot(Base.driver);
	}

   @Description("Verify able to create new Vertical in manage section")
@Test
  public void verifyCreate_New_Vertical()
  {
	   Oraganization org = new Oraganization();
		org.ClickManage();
		org.ClickOranization();
		org.ClickVertical();
		org.Entervertical("Dummy Veritical");
		org.SelectOrganization("iLink Alumni");
		Screenshot.captureStepScreenshot(Base.driver);
  }
	
   
   
   @Description("Verify able to create new Location in manage section")
 //  @Test
  public void verifyCreate_New_Location()
  {
	  Oraganization org = new Oraganization();
		org.ClickManage();
		org.ClickOranization();
		org.ClickLocation();
		org.EnterLocation("Dummy Department");
		org.EnterDescription("Dummy Description");
		org.SelectOrganization("iLink Alumni");
		Screenshot.captureStepScreenshot(Base.driver);
  }
	
	
	
	
	
	
}

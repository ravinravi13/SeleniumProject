package Test_Admin.SC_AL_005;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.ManageStaff.Mange_Sfaff;
import Utilities.Screenshot;
import Utilities.Sleep;
import io.qameta.allure.Description;

public class Manage_Staff_Test extends Base{
	
	
	
	@Description("Verify staff from their respective departments when selecting a department and validate with UI and API response")
	//@Test(priority=1)
	public void TC_001_Validate_Staff_Department()
	{
		Mange_Sfaff manage = new Mange_Sfaff();
		manage.ClickMangeStaff();
		manage.SelectDepartment("Others");
		Utilities.sleep(3);
		List<Map<String, String>>  uiData= manage.GetStaffName();	
		List<Map<String, String>> apiData =  manage.GetSatffNameApi();
		 Assert.assertEquals(uiData, apiData, "UI data does not match API data!");
		 Screenshot.captureStepScreenshot(Base.driver);
	    
	}
	@Description("Verify display staff name when passing name of staff")
	@Test(priority=2)
	public void TC_002_VerifySeachBox()
	{
		Mange_Sfaff manage = new Mange_Sfaff();
		manage.ClickMangeStaff();
		String Actual ="raveendran";
		manage.EnterText(Actual);
		manage.clickSearch();
		Utilities.sleep(3);
		String expected = manage.GetStaffSearch().toLowerCase();
		boolean result;
		if(expected.startsWith(Actual))
		{
			result =true;
		}
		else {
			result = false;
		}
		
		 Assert.assertEquals(result, true, "Text is not Matched");
	}
  
	@Description("Verify display or not staff name when passing invalid number")
	@Test(priority=3)
	public void TC_003_VerifyInavlidSearch() // Invalid Test num
	{
		Mange_Sfaff manage = new Mange_Sfaff();
//		manage.ClickMangeStaff();
		String Actual ="12345";
		manage.EnterText(Actual);
		manage.clickSearch();
		Utilities.sleep(3);
	
		boolean result= manage.Nostafferror();
		
		 Assert.assertEquals(result, true, "Text is not Displayed");
		 Screenshot.captureStepScreenshot(Base.driver);
	}
   
	@Description("Verify display or not staff name when passing invalid name")
	 @Test(priority=4)
   public void TC_004_VerifyInvalid_UnkownName() // Invalid Test Name
   {
	   Mange_Sfaff manage = new Mange_Sfaff();
//		manage.ClickMangeStaff();
		String Actual ="Thalapathy Vijay";
		manage.EnterText(Actual);
		manage.clickSearch();
		Utilities.sleep(3);
	
		boolean result= manage.Nostafferror();
		
		 Assert.assertEquals(result, true, "Name is not Displayed");
		 Screenshot.captureStepScreenshot(Base.driver);
   }
	
	
}



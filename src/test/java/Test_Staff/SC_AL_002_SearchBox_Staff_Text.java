package Test_Staff;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Alumnihelpdesk.portal.Utilities;
import BaseClass.Base;
import Pages_Alumni_Staff.SearchBox_Staff.SC_AL_002_SearchBox_Staff;
import Utilities.CommonFunction;
import Utilities.Locators;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class SC_AL_002_SearchBox_Staff_Text extends Base{
	SC_AL_002_SearchBox_Staff search = new SC_AL_002_SearchBox_Staff();
	
	 @Description("")
     @Test(priority=1)
	 public void TC_001_validTicket_ID()
	 {
		
		 search.ClickAllReqest();
		 String actual ="209 ";
		 search.EnterSearchBox(actual);
		 Utilities.sleep(2);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 Utilities.sleep(4);	 
         String expected = search.GetticketId();
		 Assert.assertEquals(actual, expected,"Search value is not Matched");
		 Screenshot.captureStepScreenshot(Base.driver);
	 }
	 
     @Test(priority=2)
	 public void TC_002_InvlidTicket_ID()
	 {
		
		 search.ClickAllReqest();
		 search.EnterSearchBox("1000");
		 Utilities.sleep(2);
		 Assert.assertEquals(isDisplay(Locators.xpath, "//h6[normalize-space(text())='No Results found.']"), true);
		 Screenshot.captureStepScreenshot(Base.driver);
	 }
	 @Test(priority=3)
	 public void TC_003_ReportName()
	 {
	
		 search.ClickAllReqest();
		 search.EnterSearchBox("raveendran");
		 Utilities.sleep(2);
		 Assert.assertEquals(isDisplay(Locators.xpath, "//h6[normalize-space(text())='No Results found.']"), true);
		 Screenshot.captureStepScreenshot(Base.driver);
	 }
	 
	
	 public void TC_004_CategoryValue()
	 {
		 
		 search.ClickAllReqest();
		 search.EnterSearchBox("pf related");
		 Utilities.sleep(2);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 search.verifyPageCheckEnable("pf related",total_ticket);
		 Assert.assertEquals(total_ticket==search.c, true);
		 Screenshot.captureStepScreenshot(Base.driver);
		
	 }

}

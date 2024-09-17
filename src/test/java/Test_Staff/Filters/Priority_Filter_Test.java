package Test_Staff.Filters;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;
import BaseClass.Base;
import Pages_AlumniAdmin.Filters_Admin.Priority_filter_Admin;
import Pages_Alumni_Staff.Filters_Staff.Priority_filter_Staff;
import Utilities.CommonFunction;
import Utilities.Locators;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class Priority_Filter_Test extends Base{


	@Description("Verify the filter functionality of the priority field and validate each ticket in the category column. Conduct a thorough check to ensure the filter operates correctly, accurately displaying the relevant tickets. Examine each ticket to confirm it is correctly categorized and validate the accuracy of the Department assignments.")
	@Test(priority=1)
	public void VerifyStatusFilter()
	{
		Priority_filter_Staff Priority = new Priority_filter_Staff();
		Priority.ClickMyequest();
		Priority.ClickFiliter();
		Priority.SelectPriority(3);
		Priority.ClickApplyFilter();
		 Utilities.sleep(3);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 if(total_ticket==0)
		 {
			 Assert.assertEquals(isDisplay(Locators.xpath ,Base.LocatorsSetup("No_ticket_found_loc")), true);
		 }
		 else {
		 Priority.verifyPageCheckEnable("LOW",total_ticket);		
		 
		 }
		 
		 Assert.assertEquals(total_ticket==Priority.count, true);
		 Screenshot.captureStepScreenshot(Base.driver);
	}
	
	
	public void VerifyApplyFilter_Btn()
	{
		Priority_filter_Staff Priority = new Priority_filter_Staff();
		 Priority.ClickMyequest();
		 Priority.ClickFiliter();
		WebElement value = Priority.checkApplyFilter();
		 Assert.assertEquals(!value.isEnabled(), true,"Verfiy Apply Fileter is fine");
		 System.out.println("Verfiy Apply Filter is fine");
	}
	
	
	public void VerifyClear_Btn()
	{
		Priority_filter_Staff Priority = new Priority_filter_Staff();
		 Priority.ClickMyequest();
		 Priority.ClickFiliter();
		 WebElement value = Priority.checkApplyFilter();
		 Assert.assertEquals(!value.isEnabled(), true,"Verfiy Clear Fileter is fine");
		 System.out.println("Verfiy Clear Filter is fine");
	}
	
	
	
}

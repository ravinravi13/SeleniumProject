package Test_Staff.Filters;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.Filters_Admin.Status_filter_Admin;
import Pages_Alumni_Staff.Filters_Staff.Status_filter_Staff;
import Utilities.CommonFunction;
import Utilities.Locators;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class Status_Staff_Test extends Base{
	
	
	@Description("Verify the filter functionality of the Status field and validate each ticket in the category column. Conduct a thorough check to ensure the filter operates correctly, accurately displaying the relevant tickets. Examine each ticket to confirm it is correctly categorized and validate the accuracy of the Department assignments.")
	@Test(priority=1)
	public void VerifyStatusFilter()
	{
		Status_filter_Staff status = new Status_filter_Staff();
		status.ClickMyequest();
		status.ClickFiliter();
		status.SelectStatus(1);
		status.ClickApplyFilter();
		 Utilities.sleep(3);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 if(total_ticket==0)
		 {
			 Assert.assertEquals(isDisplay(Locators.xpath ,"//p[normalize-space(text())='No Tickets Found !']"), true);
		 }
		 else {
		 status.verifyPageCheckEnable("NEW",total_ticket);	
		 }
		 
		 Assert.assertEquals(total_ticket==status.count, true);
		 Screenshot.captureStepScreenshot(Base.driver);
	}
	
	public void VerifyApplyFilter_Btn()
	{
		Status_filter_Admin status = new Status_filter_Admin();
		status.ClickMyequest();
		status.ClickFiliter();
		WebElement value = status.checkApplyFilter();
		 Assert.assertEquals(!value.isEnabled(), true,"Verfiy Apply Fileter is fine");
		 System.out.println("Verfiy Apply Filter is fine");
	}
	
	
	public void VerifyClear_Btn()
	{
		Status_filter_Admin status = new Status_filter_Admin();
		status.ClickMyequest();
		status.ClickFiliter();
		 WebElement value = status.checkApplyFilter();
		 Assert.assertEquals(!value.isEnabled(), true,"Verfiy Clear Fileter is fine");
		 System.out.println("Verfiy Clear Filter is fine");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

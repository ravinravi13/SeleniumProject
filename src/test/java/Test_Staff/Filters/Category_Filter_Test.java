package Test_Staff.Filters;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.Filters_Admin.Category_filter_Admin;
import Pages_Alumni_Staff.Filters_Staff.Category_filter_Staff;
import Utilities.CommonFunction;
import Utilities.Locators;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class Category_Filter_Test extends Base{
	
	@Description("Verify the filter functionality of the category field and validate each ticket in the category column. Conduct a thorough check to ensure the filter operates correctly, accurately displaying the relevant tickets. Examine each ticket to confirm it is correctly categorized and validate the accuracy of the category assignments.")
	@Test(priority=2)
	public void VerifyCategoryFilter()
	{
		Category_filter_Staff cat = new Category_filter_Staff();
		 cat.ClickMyequest();
		 cat.ClickFiliter();
		 cat.SelectCategory("PF related");
		 cat.ClickApplyFilter();
		 Utilities.sleep(3);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 Screenshot.captureStepScreenshot(Base.driver);
		 if(total_ticket==0)
		 {
			 Assert.assertEquals(isDisplay(Locators.xpath ,Base.LocatorsSetup("No_ticket_found_loc")), true);
		 }
		 else {
			 cat.verifyPageCheckEnable("pf related",total_ticket);
			 
			 
		 }
	  
	   Assert.assertEquals(total_ticket==cat.count, true);
	   Screenshot.captureStepScreenshot(Base.driver);
		 
	}
	@Description("Verify the clear button is working after the select the fileter it will clear all fields")
//	@Test(priority=1)
	public void VerifyClear_Btn()
	{
		 Category_filter_Admin cat = new Category_filter_Admin();
		 cat.ClickMyequest();
		 cat.ClickFiliter();
		 WebElement value = cat.checkApplyFilter();
		 Assert.assertEquals(!value.isEnabled(), true,"Verfiy Clear Fileter is fine");
		 System.out.println("Verfiy Clear Filter is fine");
		 Screenshot.captureStepScreenshot(Base.driver);
	}

}

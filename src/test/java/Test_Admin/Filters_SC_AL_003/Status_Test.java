package Test_Admin.Filters_SC_AL_003;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.Filters_Admin.Category_filter_Admin;
import Pages_AlumniAdmin.Filters_Admin.Priority_filter_Admin;
import Pages_AlumniAdmin.Filters_Admin.Status_filter_Admin;
import Utilities.CommonFunction;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class Status_Test extends Base{

	@Description("verify the Filter functionality of Status field")
	@Test(priority=1)
	public void TC_001_VerifyStatusFilter()
	{
		Status_filter_Admin status = new Status_filter_Admin();
		status.ClickMyequest();
		status.ClickFiliter();
		status.SelectStatus(1);
		status.ClickApplyFilter();
		 Utilities.sleep(3);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 status.verifyPageCheckEnable("NEW",total_ticket);		
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

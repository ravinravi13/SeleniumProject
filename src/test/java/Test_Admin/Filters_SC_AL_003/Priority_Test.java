package Test_Admin.Filters_SC_AL_003;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.Filters_Admin.Category_filter_Admin;
import Pages_AlumniAdmin.Filters_Admin.Priority_filter_Admin;
import Utilities.CommonFunction;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class Priority_Test extends Base{
	
	@Description("verify the Filter functionality of Priority field")
	@Test(priority=1)
	public void TC_001_VerifyStatusFilter()
	{
		Priority_filter_Admin Priority = new Priority_filter_Admin();
		Priority.ClickMyequest();
		Priority.ClickFiliter();
		Priority.SelectPriority(1);
		Priority.ClickApplyFilter();
		 Utilities.sleep(3);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 Priority.verifyPageCheckEnable("LOW",total_ticket);		
		 Assert.assertEquals(total_ticket==Priority.count, false);
		 Screenshot.captureStepScreenshot(Base.driver);
	}
	
	public void VerifyApplyFilter_Btn()
	{
		Priority_filter_Admin Priority = new Priority_filter_Admin();
		 Priority.ClickMyequest();
		 Priority.ClickFiliter();
		WebElement value = Priority.checkApplyFilter();
		 Assert.assertEquals(!value.isEnabled(), true,"Verfiy Apply Fileter is fine");
		 System.out.println("Verfiy Apply Filter is fine");
	}
	
	
	public void VerifyClear_Btn()
	{
		Priority_filter_Admin Priority = new Priority_filter_Admin();
		 Priority.ClickMyequest();
		 Priority.ClickFiliter();
		 WebElement value = Priority.checkApplyFilter();
		 Assert.assertEquals(!value.isEnabled(), true,"Verfiy Clear Fileter is fine");
		 System.out.println("Verfiy Clear Filter is fine");
	}

}

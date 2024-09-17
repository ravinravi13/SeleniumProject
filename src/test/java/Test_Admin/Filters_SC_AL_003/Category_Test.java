package Test_Admin.Filters_SC_AL_003;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.Filters_Admin.Category_filter_Admin;
import Utilities.CommonFunction;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class Category_Test extends Base{
	
	@Description("verify the Filter functionality of category field")
	@Test(priority=1)
	public void VerifyCategoryFilter()
	{
		Category_filter_Admin cat = new Category_filter_Admin();
		 cat.ClickMyequest();
		 cat.ClickFiliter();
		 cat.SelectCategory("Laptop Submission");
		 cat.ClickApplyFilter();
		 Utilities.sleep(3);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 Utilities.sleep(3);
		 cat.verifyPageCheckEnable("laptop submission",total_ticket);	
		 Assert.assertEquals(total_ticket==cat.count, true);
		 Screenshot.captureStepScreenshot(Base.driver);
		 
	}
	
//	public void VerifyApplyFilter_Btn()
//	{
//		 Category_filter_Admin cat = new Category_filter_Admin();
//		 cat.ClickMyequest();
//		 cat.ClickFiliter();
//		WebElement value = cat.checkApplyFilter();
//		 Assert.assertEquals(!value.isEnabled(), true,"Verfiy Apply Fileter is fine");
//		 System.out.println("Verfiy Apply Filter is fine");
//	}
	
	public void VerifyClear_Btn()
	{
		 Category_filter_Admin cat = new Category_filter_Admin();
		 cat.ClickMyequest();
		 cat.ClickFiliter();
		 WebElement value = cat.checkApplyFilter();
		 Assert.assertEquals(!value.isEnabled(), true,"Verfiy Clear Fileter is fine");
		 System.out.println("Verfiy Clear Filter is fine");
	}
	
	
	
}

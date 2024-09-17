package Test_Staff.Filters;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.Filters_Admin.Department_filter_Admin;
import Pages_Alumni_Staff.Filters_Staff.Department_filter_Staff;
import Utilities.CommonFunction;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class Department_filter_Test extends Base{
	
	
	@Description("Verify the filter functionality of the Department field and validate each ticket in the category column. Conduct a thorough check to ensure the filter operates correctly, accurately displaying the relevant tickets. Examine each ticket to confirm it is correctly categorized and validate the accuracy of the Department assignments.")
	@Test(priority=1)
	public void VerifyDepartment()
	{
		
		Department_filter_Staff dept = new Department_filter_Staff();
		dept.ClickAllequest();
		dept.ClickFiliter();
		Utilities.sleep(3);
		dept.SelectDpartment("HR");
		dept.ClickApplyFilter();
		Utilities.sleep(3);
		CommonFunction common = new CommonFunction();
		int total_ticket = common.getTotalNumberTicket();
		dept.verifyPageCheckEnable(total_ticket);
		String actual[] = dept.Hrdepartment();
		 List<String> list1 = Arrays.asList(actual);
//		 List<String> list2 = Arrays.asList(dept.array);
	      System.out.println(dept.deptList);
	      
	      if(list1.containsAll(dept.deptList))
	      {
	    	  System.out.println("All department are matched");
	    	  Screenshot.captureStepScreenshot(Base.driver);
	      }
	      else {
	    	  System.out.println("All department not matched");
	      }
	}


}

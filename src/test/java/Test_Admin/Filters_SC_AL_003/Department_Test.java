package Test_Admin.Filters_SC_AL_003;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.Filters_Admin.Department_filter_Admin;
import Utilities.CommonFunction;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class Department_Test extends Base{
	
	
	@Description("verify the Filter functionality of Department field")
	@Test(priority=1)
	public void TC_001_VerifyDepartment()
	{
		
		Department_filter_Admin dept = new Department_filter_Admin();
		dept.ClickAllequest();
		dept.ClickFiliter();
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
	    	  Screenshot.captureStepScreenshot(Base.driver);
	    	  System.out.println("All department are matched");
	      }
	      else {
	    	  System.out.println("All department not matched");
	      }
	}

}

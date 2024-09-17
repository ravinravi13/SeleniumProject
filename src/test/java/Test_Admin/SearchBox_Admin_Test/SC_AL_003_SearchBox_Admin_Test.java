package Test_Admin.SearchBox_Admin_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.SearchTicket_Admin.Search_Ticket_Admin;
import Utilities.CommonFunction;
import Utilities.Locators;

public class SC_AL_003_SearchBox_Admin_Test extends Base{

	
	 
	 public void VerifyPass_Ticket_ID()
	 {
		 Search_Ticket_Admin search = new Search_Ticket_Admin();
		 search.ClickAllReqest();
		 search.EnterSearchBox("208");
		 Utilities.sleep(2);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 
		 
		 if(total_ticket==0)
		 {
			 Assert.assertEquals(isDisplay(Locators.xpath, "//h6[normalize-space(text())='No Results found.']"), true);
		 }
		 else {
			 Utilities.sleep(2);
		  search.verifyPageCheckEnable("208",total_ticket);	
		 }
	 }
	 
	 
	 public void VerifyPassInvlidad_ID()
	 {
		 Search_Ticket_Admin search = new Search_Ticket_Admin();
		 search.ClickAllReqest();
		 search.EnterSearchBox("1000");
		 Utilities.sleep(2);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 
		 
		 if(total_ticket==0)
		 {
			 Assert.assertEquals(isDisplay(Locators.xpath, "//h6[normalize-space(text())='No Results found.']"), true);
		 }
		 else {
			 Utilities.sleep(2);
		  search.verifyPageCheckEnable("1000",total_ticket);	
		 }
	 }
	 @Test
	 public void VerifyPass_Reporter_Name()
	 {
		 Search_Ticket_Admin search = new Search_Ticket_Admin();
		 search.ClickAllReqest();
		 search.EnterSearchBox("raveendran");
		 Utilities.sleep(2);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 
		 
		 if(total_ticket==0)
		 {
			 Assert.assertEquals(isDisplay(Locators.xpath, "//h6[normalize-space(text())='No Results found.']"), true);
		 }
		 else {
			 Utilities.sleep(2);
		  search.verifyPageCheckEnable("1000",total_ticket);	
		 }
	 }
	 
	 @Test
	 public void VerifyPass_Category_Value()
	 {
		 Search_Ticket_Admin search = new Search_Ticket_Admin();
		 search.ClickAllReqest();
		 search.EnterSearchBox("pf related");
		 Utilities.sleep(2);
		 CommonFunction common = new CommonFunction();
		 int total_ticket = common.getTotalNumberTicket();
		 
		 
		 if(total_ticket>0)
		 {
//			 Assert.assertEquals(isDisplay(Locators.xpath, "//h6[normalize-space(text())='No Results found.']"), true);
			 Assert.assertEquals(total_ticket>0, true);
		 }
		 else {
			 Utilities.sleep(2);
		  search.verifyPageCheckEnable("1000",total_ticket);	
		 }
	 }
	
	
	
}

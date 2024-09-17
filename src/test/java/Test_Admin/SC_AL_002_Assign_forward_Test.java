package Test_Admin;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.AssignTicket.Assgin_and_Forword_Ticket;
import Utilities.Screenshot;
import Utilities.Sleep;
import io.qameta.allure.Description;

public class SC_AL_002_Assign_forward_Test extends Base{
  
	@Description("Verify the Forward functionality")
	@Test
	public void verifyForwardTicket()
	{
		Assgin_and_Forword_Ticket assign = new Assgin_and_Forword_Ticket();
		assign.ClickAllrequest();
		assign.ClickEdit_btn();
		assign.ClickForwardrequest();
		Utilities.sleep(2);
		assign.SelectCategorgy("PF RELATED");
		Utilities.sleep(2);
		assign.selectStatus("NEW");
		Utilities.sleep(2);
		assign.EnterComment("Forword to HR department");
		Utilities.sleep(2);
		assign.Clickforward();
		Screenshot.captureStepScreenshot(Base.driver);
		Utilities.sleep(2);
		boolean value = assign.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
		 Screenshot.captureStepScreenshot(Base.driver);
		
	}
	@Description("Verify the Forward Ticket by select Category only")
	//@Test(priority=1)
   public void TC_001_SelectCategory()
   {
	   Assgin_and_Forword_Ticket assign = new Assgin_and_Forword_Ticket();
	    assign.ClickAllrequest();
		assign.ClickEdit_btn();
		assign.ClickForwardrequest();
		Utilities.sleep(2);
		assign.SelectCategorgy("PF RELATED");
		Utilities.sleep(2);
		boolean value = assign.forwardidDisplay();
		System.out.println(value);
		Assert.assertEquals(value, true);
   }
   
	@Description("Confirm the ticket is forwarded by selecting the status only")
	//@Test(priority=2)
	 public void TC_002_SelectStatus()
	   {
		   Assgin_and_Forword_Ticket assign = new Assgin_and_Forword_Ticket();
		    assign.ClickAllrequest();
			assign.ClickEdit_btn();
			assign.ClickForwardrequest();
			Utilities.sleep(2);
			assign.selectStatus("INPROGRESS");
			Utilities.sleep(2);
			boolean value = assign.forwardidDisplay();
			System.out.println(value);
			Assert.assertEquals(value, true);
			Screenshot.captureStepScreenshot(Base.driver);
	   }
	 @Description("Confirm the ticket is forwarded by Passing Comments only")
	// @Test(priority=3)
   public void TC_003PassComments()
   {
	   Assgin_and_Forword_Ticket assign = new Assgin_and_Forword_Ticket();
//	    assign.ClickAllrequest();
//		assign.ClickEdit_btn();
//		assign.ClickForwardrequest();
		assign.EnterComment("Forword to HR department");
		Utilities.sleep(2);
		boolean value = assign.forwardidDisplay();
		System.out.println(value);
		Assert.assertEquals(value, true);
		Screenshot.captureStepScreenshot(Base.driver);
   }
  
    
	 public void verfiyTochangeStatus()
	   {
		   Assgin_and_Forword_Ticket assign = new Assgin_and_Forword_Ticket();
		    assign.ClickAllrequest();
			assign.ClickEdit_btn();
			assign.ClickForwardrequest();
			Utilities.sleep(2);
			assign.SelectCategorgy("ACCESS");
			Utilities.sleep(2);
			assign.selectStatus("INPROGRESS");
			Utilities.sleep(2);
			assign.EnterComment("Forword to IT department");
			Utilities.sleep(2);
			boolean value = assign.forwardidDisplay();
			System.out.println(value);
			Assert.assertEquals(value, true);
	   }
	 @Description("veriy the ticket is not assign any staff and make it assgin staff")
	 //@Test
     public void TC_004_VerifyAssignStaff()
     {
    	 Assgin_and_Forword_Ticket assign = new Assgin_and_Forword_Ticket();
 		assign.ClickAllrequest();
 		assign.clickCheckboc();
 		assign.ClickAssignStaff();
 		Utilities.sleep(2);
 		assign.SelectAssignStaff("Raveendran Manickam");
 		Screenshot.captureStepScreenshot(Base.driver);
 		assign.Clicksumbit();
 		boolean value = assign.DisplaySucces_msg();
 		System.out.println(value);
 		Assert.assertEquals(value, true);
 		Screenshot.captureStepScreenshot(Base.driver);
     }
	 
	 
	
	 
	 
	 
	
	
}

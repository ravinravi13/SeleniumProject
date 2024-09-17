package Test_Staff.AssginAndForward;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Alumnihelpdesk.portal.Utilities;
import BaseClass.Base;
import Pages_Alumni_Staff.Assign_Forward_Staff_Ticket.Assign_Forward_Ticket;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class SC_AL_003_AssignAndForward_Test extends Base{
	
	
	Assign_Forward_Ticket assign = new Assign_Forward_Ticket();
	//@Description("Confirm the ticket is closed before updating it to the Reopen status")
	//@Test(priority=1)
	public void TC_001_VerifyForward_Ticket_Closed()
	{
		
		assign.ClickAllrequest();
		assign.ClickEdit_btn();
		Utilities.sleep(2);
		assign.ClickForwardrequest();
		Utilities.sleep(2);
		assign.SelectCategorgy("LAPTOP SUBMISSION");
		Utilities.sleep(2);
		assign.selectStatus("REOPENED");
		Utilities.sleep(2);
		assign.EnterComment("Forword to IT department");
		Utilities.sleep(2);
		Screenshot.captureStepScreenshot(Base.driver);
		assign.Clickforward();
		Utilities.sleep(2);
		boolean value = assign.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
		Screenshot.captureStepScreenshot(Base.driver);
		System.out.println("verifyForwardTicket executed");
	}
	//@Description("Verify the Forward Ticket by select Category only")
	//@Test(priority=2)
   public void Only_SelectCategory()
   {
	  
	    assign.ClickAllrequest();
		assign.ClickEdit_btn();
		Utilities.sleep(2);
		assign.ClickForwardrequest();
		Utilities.sleep(2);
		assign.SelectCategorgy("LAPTOP SUBMISSION");
		Utilities.sleep(2);
		Screenshot.captureStepScreenshot(Base.driver);
		boolean value = assign.forwardidDisplay();
		System.out.println(value);
		Assert.assertEquals(value, true);
		Screenshot.captureStepScreenshot(Base.driver);
		System.out.println("Only_SelectCategory executed");
   }
   // @Description("Confirm the ticket is forwarded by selecting the status only")
	//@Test(priority=3)
	 public void Only_SelectStatus()
	   {
	
		    assign.ClickAllrequest();
			assign.ClickEdit_btn();
			Utilities.sleep(2);
			assign.ClickForwardrequest();
			Utilities.sleep(2);
			assign.selectStatus("INPROGRESS");
			Utilities.sleep(2);
			boolean value = assign.forwardidDisplay();
			System.out.println(value);
			Assert.assertEquals(value, true);
			System.out.println("Only_SelectStatus executed");
	   }
	 
	// @Description("Confirm the ticket is forwarded by Passing Comments only")
	//  @Test(priority=4)
   public void Only_PassComments()
   {
	  
	    assign.ClickAllrequest();
		assign.ClickEdit_btn();
		Utilities.sleep(2);
		assign.ClickForwardrequest();
		assign.EnterComment("Forword to IT department");
		Utilities.sleep(2);
		Screenshot.captureStepScreenshot(Base.driver);
		boolean value = assign.forwardidDisplay();
		System.out.println(value);
		Assert.assertEquals(value, true);
		System.out.println("Only_PassComments executed");
		
   }
  
	//@Test(priority=5)
	 public void verfiyTochangeStatus()
	   {
	
		    assign.ClickAllrequest();
			assign.ClickEdit_btn();
			Utilities.sleep(2);
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
			System.out.println("verfiyTochangeStatus executed");
	   }
	 @Description("veriy the ticket is not assign any staff and make it assgin staff")
	  @Test(priority=6)
     public void VerifyAssignStaff()
     {
		
 		assign.ClickAllrequest();
 		assign.clickCheckboc();
 		Utilities.sleep(2);
 		assign.ClickAssignStaff();
 		Utilities.sleep(2);
 		assign.SelectAssignStaff("Raveendran Manickam");
 		Screenshot.captureStepScreenshot(Base.driver);
 		assign.Clicksumbit();
 		boolean value = assign.DisplaySucces_msg();
 		System.out.println(value);
 		Assert.assertEquals(value, true,"VerifyAssignStaff not executed");
 		Screenshot.captureStepScreenshot(Base.driver);
 		System.out.println("VerifyAssignStaff executed");
     }
	 

}

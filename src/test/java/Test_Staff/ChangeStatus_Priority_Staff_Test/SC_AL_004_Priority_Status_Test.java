package Test_Staff.ChangeStatus_Priority_Staff_Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;
import BaseClass.Base;
import Pages_Alumni_Staff.Status_Priority_Staff.Status_priority_Staff;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class SC_AL_004_Priority_Status_Test extends Base{

	
	@Description("Confirm the ticket is in the “New” status and then change the status to “In Progress.”")
	@Test(priority=1)
	public void TC_001_Verity_Ticket_New_to_Inprogress()

	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		Utilities.sleep(5);
//		sp.SelectStatus("INPROGRESS");
		sp.SelectPriority("MEDIUM");
		Screenshot.captureStepScreenshot(Base.driver);
		sp.ClickTickBtn();
		Screenshot.captureStepScreenshot(Base.driver);
	}
	
	public void Verity_Ticket_New_to_Closed() // INVALID TEST
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
	
		Utilities.sleep(3);
		sp.editBtn();
		sp.SelectStatus("NEW");
//		sp.SelectPriority("MEDIUM");
		Utilities.sleep(2);
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	////////////////////////End of New ////////////////////////////////////////
	@Description("Confirm the ticket is in the “Inprogess” status and then change the status to “In Closed.”")
  //  @Test(priority=2)
	public void Verity_Ticket_Inprogess_to_Closed()
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		Utilities.sleep(5);
//		sp.SelectStatus("CLOSED");
		sp.SelectPriority("MEDIUM");
		Screenshot.captureStepScreenshot(Base.driver);
		sp.ClickTickBtn();
		Utilities.sleep(3);
		Screenshot.captureStepScreenshot(Base.driver);
	}
	
	public void Verity_Ticket_Inprogess_to_New() // INVALID TEST
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		Utilities.sleep(3);
		sp.editBtn();
		sp.SelectStatus("NEW");
//		sp.SelectPriority("MEDIUM");
		Utilities.sleep(2);
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	
	
	public void Verity_Ticket_Inprogess_to_Reject() // INVALID TEST
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		Utilities.sleep(3);
		sp.editBtn();
		sp.SelectStatus("REJECT");
//		sp.SelectPriority("MEDIUM");
		Utilities.sleep(2);
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}

	public void Verity_Ticket_Inprogess_to_Reopen() // INVALID TEST
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		Utilities.sleep(3);
		sp.editBtn();
		sp.SelectStatus("REOPEN");
//		sp.SelectPriority("MEDIUM");
		Utilities.sleep(2);
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}

	///////// End of Inprogress////////////////////////////////////
	
	@Description("Confirm the ticket is in the “Closed” status and then change the status to “Reopened.”")
	//@Test(priority=3)
	public void Verity_Ticket_Closed_to_Reopen()
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		Utilities.sleep(3);
		sp.editBtn();
		sp.SelectStatus("REOPENED");
//		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Screenshot.captureStepScreenshot(Base.driver);
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
		Screenshot.captureStepScreenshot(Base.driver);
	}
	
	public void Verity_Ticket_Closed_to_New() //INVALID TEST
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("NEW");
//		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	
	public void Verity_Ticket_Closed_to_Inprogess() //INVALID TEST
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("INPROGESS");
//		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	public void Verity_Ticket_Closed_to_Reject() //INVALID TEST
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("REJECT");
//		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	////////////////////////End of Closed//////////////////////////////
	
	public void Verity_Ticket_Reject_to_New() // INVALID TEST
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("NEW");
//		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	
	public void Verity_Ticket_Reject_to_Closed() // INVALID TEST
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("CLOSED");
//		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	public void Verity_Ticket_Reject_to_Reopen() // INVALID TEST
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("REOPEN");
//		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	
	public void Verity_Ticket_Reject_to_Inprogess() 
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("INPROGESS");
//		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	/////////////////////// End of Reject /////////////////////////////////////////////////
	
	@Description("Confirm the ticket is in the “Reopend” status and then change the status to “Inprogess”")
//	@Test(priority=4)
	public void Verity_Ticket_Reopen_to_Inprogress()
	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		Utilities.sleep(3);
		sp.editBtn();
		sp.SelectStatus("INPROGRESS");
//		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Screenshot.captureStepScreenshot(Base.driver);
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
		Screenshot.captureStepScreenshot(Base.driver);
	}
	
	public void Verity_Ticket_Reopen_to_New() // INVALID TEST
 	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("NEW");
		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	
	public void Verity_Ticket_Reopen_to_Closed() // INVALID TEST
 	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("ClOSED");
		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	public void Verity_Ticket_Reopen_to_Reject() // INVALID TEST
 	{
		Status_priority_Staff  sp = new Status_priority_Staff();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("REJECT");
		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	
	//////////////////End of Reopen////////////////////////////
}

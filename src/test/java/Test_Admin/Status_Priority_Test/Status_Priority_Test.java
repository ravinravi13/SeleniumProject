package Test_Admin.Status_Priority_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.Status_Priority.Status_Priority_Admin;

public class Status_Priority_Test extends Base{
	
	
	
	public void Verity_Ticket_New_to_Inprogress()
	{
		Status_Priority_Admin  sp = new Status_Priority_Admin();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("INPROGESS");
		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
	}
	
	public void Verity_Ticket_New_to_Closed() // INVALID TEST
	{
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
	
	////////////////////////End of New ////////////////////////////////////////
	
	public void Verity_Ticket_Inprogess_to_Closed()
	{
		Status_Priority_Admin  sp = new Status_Priority_Admin();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("CLOSED");
		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
	}
	
	public void Verity_Ticket_Inprogess_to_New() // INVALID TEST
	{
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
	
	public void Verity_Ticket_Closed_to_Reopen()
	{
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
	
	public void Verity_Ticket_Closed_to_New() //INVALID TEST
	{
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
	
	
	public void Verity_Ticket_Reopen_to_Inprogress()
	{
		Status_Priority_Admin  sp = new Status_Priority_Admin();
		sp.ClickAllrequest();
		sp.ClickTableEdit_btn();
		sp.editBtn();
		sp.SelectStatus("INPROGESS");
		sp.SelectPriority("MEDIUM");
		sp.ClickTickBtn();
		Utilities.sleep(2);
		boolean value = sp.DisplaySucces_msg();
		System.out.println(value);
		Assert.assertEquals(value, true);
	}
	
	public void Verity_Ticket_Reopen_to_New() // INVALID TEST
 	{
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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
		Status_Priority_Admin  sp = new Status_Priority_Admin();
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

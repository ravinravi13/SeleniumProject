package Pages_Alumni_Module;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;

public class SC_AL_003_CreateTicket_Alumni extends Base{
	

	String Description_loc ="ticket-description";


	@Step("Click New Ticket of side nav bar")
	public void ClicknewTicket()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("newTicket_loc")));
		
	}
	
    @Step("Enter the Title of ticket : {0}")	
	public void Title(String title)
	{
		send(Findelement(Locators.id, Base.LocatorsSetup("title_loc")), title);
	}
    @Step("Select the Department of ticket : {0}")	
	public void Department(String text)
	{
	  SelectVisibleText(Findelement(Locators.id, Base.LocatorsSetup("department_loc")), text);
//		SelectIndex(Findelement(Locators.id, Base.LocatorsSetup("department_loc")), 1);
	}
    @Step("Select the Category of ticket : 2")	
	public void Category()
	{
		SelectIndex(Findelement(Locators.id, Base.LocatorsSetup("category_loc")), 2);
	}
	
    @Step("then enter the ticket description of ticket : {0}")	
	public void Description(String msg)
	{
//		send(Findelement(Locators.id, Base.LocatorsSetup("Description_loc")), msg);
		send(Findelement(Locators.id, Description_loc), msg);
	}
	@Step("finally Click the Submit button")
	public void submit()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("submit_loc")));
	}
	@Step("Get the error message of : Error submitting request.")
	public String error_text()
	{
		String error = Findelement(Locators.xpath,Base.LocatorsSetup("error_msg_new_Ticket")).getText();
		return error;
	}
	@Step("Alert is popo up Accpet that alert")
	public void Acceptalert()
	{
		  Alert alert = Base.driver.switchTo().alert();
	        alert.accept();
	}
}

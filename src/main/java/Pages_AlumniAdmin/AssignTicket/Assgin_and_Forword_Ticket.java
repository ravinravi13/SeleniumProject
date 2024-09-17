package Pages_AlumniAdmin.AssignTicket;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;

public class Assgin_and_Forword_Ticket extends Base{


    @Step("click the All Request Side Navigation bar")	
	public void ClickAllrequest()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Allrequest_loc")));
	}
	
    @Step("click edit button last column of table")
	public void ClickEdit_btn()
	{
	WebElement table = Findelement(Locators.id, Base.LocatorsSetup("table_loc"));
	    List<WebElement> allRows = table.findElements(By.cssSelector(Base.LocatorsSetup("table_row_loc")));

	    for (WebElement rowElement : allRows) {
	        List<WebElement> row = rowElement.findElements(By.tagName("td"));
	         WebElement edit = row.get(9);
	         click(edit);
	         break;
	    }
	
	}
	@Step("click forward Request button")
	public void ClickForwardrequest()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("forwardRequest_loc")));
	}
	
	@Step("Select catgeory of ticket as : {0}")
	public void SelectCategorgy(String value)
	{
		SelectVisibleText(Findelement(Locators.xpath, Base.LocatorsSetup("selectCategory")),value);
		
	}
	@Step("Select status of ticket as : {0}")
	public void selectStatus(String value)
	{
		SelectVisibleText(Findelement(Locators.xpath, Base.LocatorsSetup("selectStatus")), value);
//		Selectvalue(Findelement(Locators.xpath, selectStatus), value);
	}
	@Step("Enter comments of ticket as : {0}")
	public void EnterComment(String comment)
	{
		send(Findelement(Locators.xpath, Base.LocatorsSetup("comment_loc")),comment);
	
	}
	@Step("click forward button")
	public void Clickforward()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("forwad_btn")));
	}
	@Step("click cancel button")
	public void Clickcancel()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("cancel_btn")));
	}
	
	public boolean DisplaySucces_msg() {
		boolean element = Findelement(Locators.xpath, Base.LocatorsSetup("Success_msg")).isDisplayed();
		return element;
	}
	
	public boolean forwardidDisplay()
	{
		boolean element = Findelement(Locators.xpath, Base.LocatorsSetup("forwad_btn")).isEnabled();
		return element;
	}
	
	@Step("click checkbox of first column of table")
	public void clickCheckboc()
	{
		WebElement table = Findelement(Locators.id, Base.LocatorsSetup("table_loc"));
	    List<WebElement> allRows = table.findElements(By.cssSelector(Base.LocatorsSetup("table_row_loc")));

	    for (WebElement rowElement : allRows) {
	        List<WebElement> row = rowElement.findElements(By.tagName("td"));
	         WebElement edit = row.get(0);
	         click(edit);
	         break;
	    }
		
	}
	@Step("Click Assgin Staff button")
	public void ClickAssignStaff()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Assign_Staff_loc")));
	}
	@Step("Select the staff from dropdown : {0}")
	public void SelectAssignStaff(String value)
	{
		SelectVisibleText(Findelement(Locators.xpath, Base.LocatorsSetup("drop_select_staff")), value);
	}
	@Step("click submit button")
	public void Clicksumbit()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("submit_loc_dropdown")));
	}
	
	
	
	
	
	
}

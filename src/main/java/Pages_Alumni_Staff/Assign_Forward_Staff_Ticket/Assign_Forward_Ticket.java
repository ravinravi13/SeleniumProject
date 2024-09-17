package Pages_Alumni_Staff.Assign_Forward_Staff_Ticket;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;

public class Assign_Forward_Ticket extends Base{

	
//	String Allrequest_loc ="//h6[text()='All Requests']";
//	String Assign_Ticket_loc = "//button[contains(text(),'Assign Staff')]";
//	String table_loc ="myTickets";
//	String table_allRows = "tbody tr";
//	String table_td ="td";
//	String forwardRequest_loc = "//button[normalize-space(text())='Forward Request']";
//	String selectCategory = "(//div[@class='col-12']//select)[1]";
//	String selectStatus = "(//div[@class='col-12']//select)[2]";
//	String comment_loc = "//textarea[@placeholder='add comment here']";
//	String forwad_btn ="//span[contains(text(),'Forward')]";
//	String cancel_btn ="(//span[@class='text-danger'])[2]";
//	String Success_msg ="//div[@class='overlay-container']//div[1]";  //div[@class='toast-top-right toast-container']
//	String Assign_Staff_loc ="//button[contains(text(),'Assign Staff')]";
//	String drop_select_staff ="//select[contains(@class,'form-select form-select-sm')]";
//	String submit_loc_dropdown ="//button[normalize-space(text())='Submit']";
	
	@Step("Click the All Request link in side nav-bar")
	public void ClickAllrequest()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Allrequest_loc")));
	}
	@Step("Then click Edit button All request table last column")
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
	@Step("click Forward Request button")
	public void ClickForwardrequest()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("forwardRequest_loc")));
	}
	@Step("After click forward Request pop-up show select Categorgy as :{0}")
	public void SelectCategorgy(String value)
	{
		SelectVisibleText(Findelement(Locators.xpath, Base.LocatorsSetup("selectCategory")),value);
	}
	
	@Step("Select Status as :{0}")
	public void selectStatus(String value)
	{
		SelectVisibleText(Findelement(Locators.xpath, Base.LocatorsSetup("selectStatus")), value);
//		Selectvalue(Findelement(Locators.xpath, selectStatus), value);
	}
	@Step("Enter the comment : {0}")
	public void EnterComment(String comment)
	{
		send(Findelement(Locators.xpath, Base.LocatorsSetup("comment_loc")),comment);
	
	}
	@Step("Click Forward button")
	public void Clickforward()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("forwad_btn")));
	}
	
	public void Clickcancel()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("cancel_btn")));
	}
	@Step("After click forward successfully forward pop-up on right corner")
	public boolean DisplaySucces_msg() {
		boolean element = Findelement(Locators.xpath, Base.LocatorsSetup("Success_msg")).isDisplayed();
		return element;
	}
	
	public boolean forwardidDisplay()
	{
		boolean element = Findelement(Locators.xpath, Base.LocatorsSetup("forwad_btn")).isEnabled();
		return element;
	}
	
	@Step("Click checkbox first column of table")
	public void clickCheckboc()
	{
//		WebElement table = Findelement(Locators.id, Base.LocatorsSetup("table_loc"));
//	    List<WebElement> allRows = table.findElements(By.cssSelector(Base.LocatorsSetup("table_row_loc")));
//
//	    for (WebElement rowElement : allRows) {
//	        List<WebElement> row = rowElement.findElements(By.tagName("td"));
//	         WebElement edit = row.get(0);
//	         click(edit);
//	         break;
//	    }
		click(Findelement(Locators.xpath, "//table[@id='myTickets']/tbody[1]/tr[2]/td[1]/mat-checkbox[1]/label[1]/span[1]"));
		
	}
	@Step("After the click the checkbox Click  the AssignStaff button above the table")
	public void ClickAssignStaff()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Assign_Staff_loc")));
	}
	@Step("Select the Staff of : {0}")
	public void SelectAssignStaff(String value)
	{
		SelectVisibleText(Findelement(Locators.xpath, Base.LocatorsSetup("drop_select_staff")), value);
	}
	@Step("Click the Submit button")
	public void Clicksumbit()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("submit_loc_dropdown")));
	}
	
	
	
	
	
	
}

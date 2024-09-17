package Pages_AlumniAdmin.Status_Priority;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.Base;
import Utilities.Locators;

public class Status_Priority_Admin extends Base{

	
//	String AllRequest_loc ="//h6[text()='All Requests']";
//	String edit_loc ="//button[contains(@class,'mat-focus-indicator mat-tooltip-trigger')]";
//	String table_loc = "myTickets";
//	String table_row_loc ="tbody tr";
//	String table_allRows = "tbody tr";
//	String Statusdropdown ="(//select[@id='ticket-status'])[1]";
//	String Prioritydropdown ="ticketPriority";
//	String label_loc = "//input[@formcontrolname='ticketLabels']";
//	String tick_loc = "(//button[@color='accent'])[2]";//"(//button[contains(@class,'mat-focus-indicator mat-tooltip-trigger')])[2]";
//	String Success_msg ="//div[@class='overlay-container']//div[1]";  //div[@class='toast-top-right toast-container']
	
	
	
	public void ClickTableEdit_btn()
	{
		WebElement table = Findelement(Locators.id, Base.LocatorsSetup("table_loc"));
	    List<WebElement> allRows = table.findElements(By.cssSelector(Base.LocatorsSetup("table_row_loc")));

	    for (WebElement rowElement : allRows) {
	        List<WebElement> row = rowElement.findElements(By.tagName("td"));
	        WebElement statusName = row.get(9);
	        click(statusName);
	        break;
	    }
	}
	
	public void ClickAllrequest() {
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Allrequest_loc")));
	}
	
	public void editBtn()
	{
//		click(Findelement(Locators.xpath, edit_loc));
		clickable(Findelement(Locators.xpath, Base.LocatorsSetup("edit_loc")));
	}
	
	public void SelectStatus(String value)
	{
		SelectVisibleText(Findelement(Locators.xpath, Base.LocatorsSetup("Statusdropdown")), value);
	}
	
	public void SelectPriority(String value)
	{
		SelectVisibleText(Findelement(Locators.id, Base.LocatorsSetup("Prioritydropdown")), value);
	}
	
	public void Enterlabel(String value)
	{
		send(Findelement(Locators.xpath, Base.LocatorsSetup("label_loc")), value);
	}
	
	public void ClickTickBtn()
	{
//		click(Findelement(Locators.xpath, tick_loc));
//		clickable(Findelement(Locators.xpath, tick_loc));
		click(Findelement(Locators.xpath, Base.LocatorsSetup("tick_loc")));
	}
	
	public boolean DisplaySucces_msg() {
		boolean element = Findelement(Locators.xpath, Base.LocatorsSetup("Success_msg")).isDisplayed();
		return element;
	}
	
}

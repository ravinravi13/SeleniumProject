package Pages_Alumni_Staff.Status_Priority_Staff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;

public class Status_priority_Staff extends Base{
	
	
	@Step("Click the “Edit” button in the specified column of the table")
	public void ClickTableEdit_btn()
	{
//		WebElement table = Findelement(Locators.id, Base.LocatorsSetup("table_loc"));
//	    List<WebElement> allRows = table.findElements(By.cssSelector(Base.LocatorsSetup("table_row_loc")));
//
//	    for (WebElement rowElement : allRows) {
//	        List<WebElement> row = rowElement.findElements(By.tagName("td"));
//	        WebElement statusName = row.get(9);
//	        click(statusName);
//	        break;
//	    }
		click(Findelement(Locators.xpath, "//table[@id='myTickets']/tbody[1]/tr[3]/td[9]/div[1]/button[1]"));
	}
	
	@Step("Click the “Assignme” link in the side navigation bar")
	public void ClickAllrequest() {
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Assignme_loc")));
	}
	
	
	@Step("After clicking the “Edit” button in the table, locate and click the blue pencil icon at the bottom right side")
	public void editBtn()
	{
//		click(Findelement(Locators.xpath, edit_loc));
		clickable(Findelement(Locators.xpath, Base.LocatorsSetup("edit_loc")));
	}
	
	
	
	
	
	@Step("Select the Status as : {0}")
	public void SelectStatus(String value)
	{
//		click(Findelement(Locators.xpath, Base.LocatorsSetup("Statusdropdown")));
		
//		SelectVisibleText(Findelement(Locators.xpath, Base.LocatorsSetup("Statusdropdown")), value);
		WebElement element = Findelement(Locators.xpath, Base.LocatorsSetup("Statusdropdown"));
				
				 JavascriptExecutor js = (JavascriptExecutor) Base.driver;
        js.executeScript("arguments[0].value='optionValue';", element);

        // Verify the selection
        String selectedValue = element.getAttribute(value);
        if ("optionValue".equals(selectedValue)) {
            System.out.println("Option selected successfully.");
        } else {
            System.out.println("Failed to select the option.");
        }
	}
	
	
	
	@Step("Select the priority as : {0}")
	public void SelectPriority(String value)
	{
//		click(Findelement(Locators.xpath, Base.LocatorsSetup("Prioritydropdown")));
//		SelectVisibleText(Findelement(Locators.id, Base.LocatorsSetup("Prioritydropdown")), value);
		WebElement element = Findelement(Locators.xpath, Base.LocatorsSetup("Prioritydropdown"));
		 JavascriptExecutor js = (JavascriptExecutor) Base.driver;
	        js.executeScript("arguments[0].value='optionValue';", element);

	        // Verify the selection
	        String selectedValue = element.getAttribute(value);
	        if ("optionValue".equals(selectedValue)) {
	            System.out.println("Option selected successfully.");
	        } else {
	            System.out.println("Failed to select the option.");
	        }
		
	}
	
	public void Enterlabel(String value)
	{
		send(Findelement(Locators.xpath, Base.LocatorsSetup("label_loc")), value);
	}
	@Step("Then click green tick button ")
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

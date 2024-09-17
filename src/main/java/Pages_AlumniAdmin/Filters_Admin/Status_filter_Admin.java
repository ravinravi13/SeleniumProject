package Pages_AlumniAdmin.Filters_Admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass.Base;
import Utilities.Locators;
import Utilities.Sleep;
import io.qameta.allure.Step;

public class Status_filter_Admin extends Base{
	
	
	public int count = 0;
	String Allrequest_loc ="//h6[text()='All Requests']";
	String filter_loc = "//i[@class='bi bi-funnel-fill']";
	String apply_fiter_loc ="//button[normalize-space(text())='Apply Filters']";
	String clear_filetr_loc ="//button[normalize-space(text())='Clear Filters']";
	String status_loc = "(//select[contains(@class,'form-select form-select-sm')])[3]";
	String Ticket_nextPage_loc ="//button[@aria-label='Next page']//span[1]";
	String table_loc ="myTickets";
	String table_allRows = "tbody tr";
	String table_td ="td";
	String StatusText ="new";

	@Step("Click the All Request side navigation bar")
	public void ClickMyequest()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Allrequest_loc")));
	}
	@Step("Click funnel symbol of filter")
	public void ClickFiliter()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("filter_loc")));
	}
	@Step("Select Status of filter as :{0}")
	public void SelectStatus(int text)
	{
		SelectIndex(Findelement(Locators.xpath, Base.LocatorsSetup("status_loc")), text);
//		SelectVisibleText(Findelement(Locators.xpath, status_loc),text);
//		Selectvalue(Findelement(Locators.xpath, status_loc), text);
	}
	@Step("Click Apply filter button")
	public void ClickApplyFilter()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("apply_fiter_loc")));
	}
	@Step("Click Clear filter button")
	public void ClickClearFilter()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("clear_filetr_loc")));
	}
	
	public WebElement checkApplyFilter()
	{
		WebElement element = Findelement(Locators.xpath, Base.LocatorsSetup("apply_fiter_loc"));
		return element;
	}
	
	public WebElement checkClearFilter()
	{
		WebElement element = Findelement(Locators.xpath, Base.LocatorsSetup("clear_filetr_loc"));
		return element;
	}
	
	
	
	
	public void verifyPageCheckEnable(String StatusText, int len1) {
		checkStatusOnPage(StatusText, len1);
	    Sleep sleep = new Sleep();
	    sleep.sleep(4);
	    
	    while (count < len1) { 
	        WebElement nextPageIcon = Findelement(Locators.xpath, "(//button[contains(@class,'mat-focus-indicator mat-tooltip-trigger')])[3]");
	        if (nextPageIcon.isEnabled()) {
	            sleep.sleep(4);
	            Actions actions = new Actions(Base.driver);
	            actions.moveToElement(nextPageIcon).click().perform();
	            sleep.sleep(4);
	            verifyPageCheckEnable(StatusText, len1);
	        } else {
	             break;
	        }
	    }
	    
	    if(count == len1)
	    {
	    	System.out.println("Success");
	    	
	    }
	}

	public void checkStatusOnPage(String StatusText, int len1) {
	    WebElement table = Findelement(Locators.id, Base.LocatorsSetup("table_loc"));
	    List<WebElement> allRows = table.findElements(By.cssSelector(Base.LocatorsSetup("table_row_loc")));

	    for (WebElement rowElement : allRows) {
	        List<WebElement> row = rowElement.findElements(By.tagName("td"));
	        WebElement statusName = row.get(7);
	        String statusTxt = statusName.getText().trim().toLowerCase(); 
	        WebElement idName = row.get(1);
	        System.out.println(idName.getText() + " = " + statusTxt);

	        if (statusTxt.equals("new") ){
	            count++;
	            System.out.println(count);
	        }

	       
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

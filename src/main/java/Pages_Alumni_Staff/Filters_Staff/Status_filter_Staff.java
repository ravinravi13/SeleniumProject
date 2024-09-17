package Pages_Alumni_Staff.Filters_Staff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass.Base;
import Utilities.Locators;
import Utilities.Sleep;
import io.qameta.allure.Step;

public class Status_filter_Staff extends Base{

	
	
	public int count = 0;

	String StatusText ="new";

	@Step("Click the “All Request” link in the side navigation bar")  
	public void ClickMyequest()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Allrequest_loc")));
	}
	@Step("Click the filter funnel symbol button")
	public void ClickFiliter()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("filter_loc")));
	}
	@Step("Select the Status as : {0}")
	public void SelectStatus(int text)
	{
		SelectIndex(Findelement(Locators.xpath, Base.LocatorsSetup("status_loc")), text);
//		SelectVisibleText(Findelement(Locators.xpath, status_loc),text);
//		Selectvalue(Findelement(Locators.xpath, status_loc), text);
	}
	@Step("click apply filter button")
	public void ClickApplyFilter()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("apply_fiter_loc")));
	}
	@Step("click clear  button in filter")
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
	        WebElement nextPageIcon = Findelement(Locators.xpath, Base.LocatorsSetup("Ticket_nextPage_loc"));
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

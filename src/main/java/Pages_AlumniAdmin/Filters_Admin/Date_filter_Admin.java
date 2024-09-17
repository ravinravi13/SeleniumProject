package Pages_AlumniAdmin.Filters_Admin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass.Base;
import Utilities.Locators;
import Utilities.Sleep;

public class Date_filter_Admin extends Base{

	public int count=0;
	String Allrequest_loc ="//h6[text()='All Requests']";
	String filter_loc = "//i[@class='bi bi-funnel-fill']";
	String apply_fiter_loc ="//button[normalize-space(text())='Apply Filters']";
	String clear_filetr_loc ="//button[normalize-space(text())='Clear Filters']";
	String Ticket_nextPage_loc ="//button[@aria-label='Next page']//span[1]";
	String table_loc ="myTickets";
	String table_allRows = "tbody tr";
	String table_td ="td";
	
	public void ClickMyequest()
	{
		click(Findelement(Locators.xpath, Allrequest_loc));
	}
	
	public void ClickFiliter()
	{
		click(Findelement(Locators.xpath, filter_loc));
	}
	
	
	public void ClickApplyFilter()
	{
		click(Findelement(Locators.xpath, apply_fiter_loc));
	}
	
	public void ClickClearFilter()
	{
		click(Findelement(Locators.xpath, clear_filetr_loc));
	}
	
	public WebElement checkApplyFilter()
	{
		WebElement element = Findelement(Locators.xpath, apply_fiter_loc);
		return element;
	}
	
	public WebElement checkClearFilter()
	{
		WebElement element = Findelement(Locators.xpath, clear_filetr_loc);
		return element;
	}
	
	public void verifyPageCheckEnable(String categoryText, int len1) {
		checkCategoryOnPage(categoryText, len1);
	    Sleep sleep = new Sleep();
	    sleep.sleep(4);
	    
	    while (count < len1) { 
	        WebElement nextPageIcon = Findelement(Locators.xpath, Ticket_nextPage_loc);
	        if (nextPageIcon.isEnabled()) {
	            sleep.sleep(4);
	            Actions actions = new Actions(Base.driver);
	            actions.moveToElement(nextPageIcon).click().perform();
	            sleep.sleep(4);
	            verifyPageCheckEnable(categoryText, len1);
	        } else {
	            break;
	        }
	    }
	    
	    if(count == len1)
	    {
	    	System.out.println("Success");
	    	
	    }
	}

	public void checkCategoryOnPage(String categoryText, int len1) {
	    WebElement table = Findelement(Locators.id, table_loc);
	    List<WebElement> allRows = table.findElements(By.cssSelector(table_allRows));

	    for (WebElement rowElement : allRows) {
	        List<WebElement> row = rowElement.findElements(By.tagName("td"));
	        WebElement statusName = row.get(5);
	        String statusTxt = statusName.getText().trim().toLowerCase(); 
	        WebElement idName = row.get(1);
	        System.out.println(idName.getText() + " = " + statusTxt);

	        if (statusTxt.equals(categoryText) ){
	            count++;
	            System.out.println(count);
	        }

	       
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

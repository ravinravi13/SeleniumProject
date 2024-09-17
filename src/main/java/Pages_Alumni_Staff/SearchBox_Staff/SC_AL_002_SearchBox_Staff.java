package Pages_Alumni_Staff.SearchBox_Staff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass.Base;
import Utilities.Locators;
import Utilities.Sleep;
import io.qameta.allure.Step;

public class SC_AL_002_SearchBox_Staff extends Base{
	
	
	
	public int c= 0;
	public boolean flag =false;
	
	
//	String Search_box_loc ="//input[@placeholder='Search Requests']";
//	String Ticket_nextPage_loc ="//button[@aria-label='Next page']//span[1]";
//	String table_loc ="search-tickets";
//	String table_allRows = "tbody tr";
//	String table_td ="td";
//	
	@Step("Click the All Request link in side-nabar")
	public void ClickAllReqest()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Allrequest_loc")));
	}
	@Step("Enter the value in Search request filed : {0}")
	 public void EnterSearchBox(String text)
	 {
		// send(Findelement(Locators.xpath, Search_box_loc), text);
		 Enterkeys(Findelement(Locators.xpath, Base.LocatorsSetup("Search_box_loc")), text, Keys.ENTER);
	 }
	 
	 public void verifyPageCheckEnable(String categoryText, int len1) {
			checkCategoryOnPage(categoryText, len1);
		    Sleep sleep = new Sleep();
		    sleep.sleep(4);
		    
		    while (c < len1) { 
		        WebElement nextPageIcon = Findelement(Locators.xpath, Base.LocatorsSetup("Ticket_nextPage_loc"));
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
		    
		    if(c == len1)
		    {
		    	System.out.println("Success");
		    	
		    }
		}

		public void checkCategoryOnPage(String categoryText, int len1) {
		    WebElement table = Findelement(Locators.id, Base.LocatorsSetup("SearchBox_table_loc"));
		    List<WebElement> allRows = table.findElements(By.cssSelector(Base.LocatorsSetup("table_allRows")));

		    for (WebElement rowElement : allRows) {
		        List<WebElement> row = rowElement.findElements(By.tagName("td"));
		        String catName = row.get(4).getText().toLowerCase();
		        if(catName.equals(categoryText))
		        {
		        	c++;
		        	System.out.println(c);
		        }
		       
		    }
		}
		
		
		 @Step("verify the ticket display on table ")
	        public String GetticketId()
	        {
	        	WebElement element = Findelement(Locators.xpath, "(//td[@role='cell'])[1]");
	        	String value = element.getText();
	        	System.out.println(value);
	        	
	        	return value;
	        }
		
		

}

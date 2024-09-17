package Pages_Alumni_Module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass.Base;
import Utilities.Locators;
import Utilities.Sleep;
import io.qameta.allure.Step;

public class SC_AL_005_SearchBox_Alumni extends Base{
	
	public int c=0;
	public boolean flag =false;
	
	
	
	@Step("Click the My Request from side nav-bar")
	public void ClickMyRequest()
	{
		click(Findelement(Locators.xpath, loc.getProperty("myRequest_loc")));
	}
	@Step("Enter the value of Ticket ID : {0} in Search box")
	public void enterSerachBox(String text)
	{
//	    Sleep sleep = new Sleep();
//	    sleep.sleep(2);
//		send(Findelement(Locators.xpath, loc.getProperty("SearchBox_loc")), text);
		
		WebElement element = Findelement(Locators.xpath, loc.getProperty("SearchBox_loc"));
		Enterkeys(element, text, Keys.ENTER);
		
	}
     
	public void clickSearchSymbol()
	{
		click(Findelement(Locators.xpath, loc.getProperty("Serach_loc_Symbol")));
	}
	
	@Step("Page move Dashboard")
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
        @Step("verify the ticket display on table : {1} ")
		public void checkCategoryOnPage(String categoryText, int len1) {
		    WebElement table = Findelement(Locators.xpath, "//table[@id='search-tickets']");
		    List<WebElement> allRows = table.findElements(By.cssSelector(Base.LocatorsSetup("table_allRows")));

		    for (WebElement rowElement : allRows) {
		        List<WebElement> row = rowElement.findElements(By.tagName("td"));
		        String idName = row.get(0).getText();
		        System.out.println(idName.getClass().getSimpleName());
		        System.out.println(categoryText.getClass().getSimpleName());
		        if ((idName.equals(categoryText))){
		             flag= true;
		        }
		        
		        if (!flag){
		             c++;
		            System.out.println(c);
		        }
		       
		    }
		}
        
        @Step("verify the ticket display on table : {0} ")
        public String GetticketId()
        {
        	WebElement element = Findelement(Locators.xpath, "(//td[@role='cell'])[1]");
        	String value = element.getText();
        	System.out.println(value);
        	
        	return value;
        }
	
	
}

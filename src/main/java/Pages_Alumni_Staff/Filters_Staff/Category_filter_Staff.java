package Pages_Alumni_Staff.Filters_Staff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass.Base;
import Utilities.Locators;
import Utilities.Screenshot;
import Utilities.Sleep;
import io.qameta.allure.Step;

public class Category_filter_Staff extends Base{
	
	
	public int count=0;
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
	@Step("Select the category as : {0}")
	public void SelectCategory(String text)
	{
		SelectVisibleText(Findelement(Locators.id, Base.LocatorsSetup("Filter_category_loc")), text);
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
	
	
	
	@Step("Iterate the each row and validate the catorgory column compare with {0} and lengt {1)")
	public void verifyPageCheckEnable(String categoryText, int len1) {
		checkCategoryOnPage(categoryText, len1);
	    Sleep sleep = new Sleep();
	    sleep.sleep(4);
	    
	    while (count < len1) { 
	        WebElement nextPageIcon = Findelement(Locators.xpath, "(//button[contains(@class,'mat-focus-indicator mat-tooltip-trigger')])[3]");
	        if (nextPageIcon.isEnabled()) {
	            sleep.sleep(4);
	            Actions actions = new Actions(Base.driver);
	            actions.moveToElement(nextPageIcon).click().perform();
	            Screenshot.captureStepScreenshot(Base.driver);
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
	    WebElement table = Findelement(Locators.id, Base.LocatorsSetup("table_loc"));
	    List<WebElement> allRows = table.findElements(By.cssSelector(Base.LocatorsSetup("table_row_loc")));

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

package Pages_Alumni_Staff.Filters_Staff;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass.Base;
import Utilities.Locators;
import Utilities.Sleep;
import io.qameta.allure.Step;

public class Department_filter_Staff extends Base{
	
	
	int count=0;	
	String table_td ="td";
	String StatusText ="new";
	public  String [] array;
	public static List<String> deptList = new  ArrayList<String>();
	
	@Step("Click the “All Request” link in the side navigation bar")
	public void ClickAllequest()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Allrequest_loc")));
	}
	@Step("Click the filter funnel symbol button")
	public void ClickFiliter()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("filter_loc")));
	}
	@Step("Select the Department as : {0}")
	public void SelectDpartment(String text)
	{
		SelectVisibleText(Findelement(Locators.xpath, Base.LocatorsSetup("Filter_department_loc")), text);
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
	
	public void SelectDropdown(int text)
	{
		SelectIndex(Findelement(Locators.id, Base.LocatorsSetup("department_loc")), text);
	}
   
	public void verifyPageCheckEnable(int len1) {
		checkStatusOnPage(len1);
	    Sleep sleep = new Sleep();
	    sleep.sleep(4);
	    
	    while (count < len1) { 
	        WebElement nextPageIcon = Findelement(Locators.xpath, "(//button[contains(@class,'mat-focus-indicator mat-tooltip-trigger')])[3]");
	        if (nextPageIcon.isEnabled()) {
	            sleep.sleep(4);
	            Actions actions = new Actions(Base.driver);
	            actions.moveToElement(nextPageIcon).click().perform();
	            sleep.sleep(4);
	            verifyPageCheckEnable(len1);
	        } else {
	             break;
	        }
	    }
	    
	    if(count == len1)
	    {
	    	System.out.println("Success");
	    	
	    }
	}

	public void checkStatusOnPage(int len1) {
//		List<String> dept = new ArrayList<>();
//		 array[] 
	    WebElement table = Findelement(Locators.id, Base.LocatorsSetup("table_loc"));
	    List<WebElement> allRows = table.findElements(By.cssSelector(Base.LocatorsSetup("table_row_loc")));	
	    for (WebElement rowElement : allRows) {
	        List<WebElement> row = rowElement.findElements(By.tagName("td"));
	        WebElement statusName = row.get(5);
	        String statusTxt = statusName.getText().trim().toLowerCase();
	        deptList.add(statusTxt);
//	        array[count++] = statusTxt;
	        System.out.println(count+ "="+ statusTxt);
	        count++;
	    }
	}
	
	

}

package Pages_AlumniAdmin.ManageAlumni;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;

public class Manage_Alumni extends Base{

	
	
//	String manage_alumni_loc ="//h6[normalize-space(text())='Manage Alumni']";
//	String search_alumni_loc = "//input[@placeholder='Search Alumni']";
//	String table_loc = "//table[contains(@class,'mat-table cdk-table')]";
//	String table_row_loc ="tbody tr";
	
	
	
	
	
	

	
	@Step("Click Manage Alumni side navigation bar")
	public void ClickManageAlumni()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("manage_alumni_loc")));
	}
	@Step("Enter the Alumni name in text box as :{0}")
	public void EnterSearchAlumni(String text)
	{
		send(Findelement(Locators.xpath, Base.LocatorsSetup("search_alumni_loc")), text);
	}
	@Step("Result display on table after searched verify Name column")
	public String GetName()
	{
		String value = null;
//		WebElement table = Findelement(Locators.xpath, Base.LocatorsSetup("table_loc"));
//		List<WebElement> allRows = table.findElements(By.cssSelector("tbody tr"));
//
//	    for (WebElement rowElement : allRows) {
//	        List<WebElement> row = rowElement.findElements(By.tagName("td"));
//	        WebElement statusName = row.get(2);
//	        value = statusName.getText();
//	        break;
//	    }
		value= getText(Locators.xpath, "//table[contains(@class,'mat-table cdk-table')]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/span[1]");
		 System.out.println(value);
	    return value;
       
	    
	}
	
	@Step("Result display on table after searched verify Gamil column")
	public String Getgmail()
	{
		String value = null;
//		WebElement table = Findelement(Locators.xpath, Base.LocatorsSetup("table_loc"));
//		List<WebElement> allRows = table.findElements(By.cssSelector("tbody tr"));
//
//	    for (WebElement rowElement : allRows) {
//	        List<WebElement> row = rowElement.findElements(By.tagName("td"));
//	        WebElement statusName = row.get(3);
//	        value = statusName.getText();
//	        System.out.println(value);
//	        break;
//	    }
		value = getText(Locators.xpath, "(//td[@role='cell']/following-sibling::td)[3]");
	    return value;
       
	    
	}
	@Step("Result display on table after searched verify Name column")
	
	public String GetEMPl()
	{
		String value = null;
//		WebElement table = Findelement(Locators.xpath, Base.LocatorsSetup("table_loc"));
//		List<WebElement> allRows = table.findElements(By.cssSelector("tbody tr"));
//
//	    for (WebElement rowElement : allRows) {
//	        List<WebElement> row = rowElement.findElements(By.tagName("td"));
//	        WebElement statusName = row.get(3);
//	        value = statusName.getText();
//	        break;
//	    }
		value = getText(Locators.xpath, "(//p[@class='fw-normal'])[2]");
		 System.out.println(value);
	    return value;
       
	    
	}
	
	
	
	
}

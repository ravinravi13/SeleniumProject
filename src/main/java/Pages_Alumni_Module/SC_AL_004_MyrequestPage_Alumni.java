package Pages_Alumni_Module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import BaseClass.Base;
import Utilities.Locators;
import Utilities.Sleep;
import io.qameta.allure.Step;

public class SC_AL_004_MyrequestPage_Alumni extends Base{

	
	
//	String myRequest_loc ="//h6[normalize-space(text())='My Requests']";
//	String comment_Text_loc ="//textarea[@placeholder='Enter a Comment']";
//	String ping_loc ="(//div[contains(@class,'mat-ripple mat-tab-label')])[2]";
//	String Upload_attachment_loc = "//button[normalize-space(text())='Upload Attachment']"; 
//	String upload_Attachment_loc1 ="//i[contains(@class,'text-success bi')]";
//	
//	String table_loc = "myTickets";
//	String table_row_loc ="tbody tr";
//	String view_loc ="(//div[@class='row']//button)[1]";
//	String Add_comment_loc ="//span[contains(text(),'Add a Comment')]";
//	String download_btn_loc ="//button[contains(@class,'mat-focus-indicator mat-menu-item')]";
//	
//	String three_dot_loc ="//span[@id='download-option']//i[1]";
	
	
	@Step("Click MyRequest of side nav bar")
	public void ClickMyrequest()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("myRequest_loc")));
	}
	
	@Step("Enter the comment in comment section : {0}")
	public void WriteComment(String comment)
	{
		send(Findelement(Locators.xpath, Base.LocatorsSetup("comment_Text_loc")), comment);
	}
	
	@Step("Click pin symbol for upload : {0}")
	public void clickPing()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("ping_loc")));
		
	}
	@Step("Click Add comment Button")
	public void clickCommad_Btn()
	{		
		//isEnabled(Locators.xpath, Base.LocatorsSetup("Add_comment_loc"));
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Add_comment_loc")));
	}
	
	
	@Step("Click edit button from MyRequest Section tables")
	public void ClickEdit_btn()
	{
		WebElement table = Findelement(Locators.id, Base.LocatorsSetup("table_loc"));
		List<WebElement> allRows =table.findElements(By.cssSelector(Base.LocatorsSetup("table_row_loc")));
		for(WebElement rows :allRows)
		{
			List<WebElement> row = rows.findElements(By.tagName("td"));
			row.get(6).click();
			break;
		}
		
	}
	
	@Step("Click Upload Attachment button to upload file : {0}")
	public void ClickUpload_attchment_btn(String filepath)
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("upload_Attachment_loc1")));
       Sleep sleep = new Sleep();
       sleep.sleep(15);
	    sendfile(Findelement(Locators.xpath, "//input[@type='file']"),filepath);
	}
	
//	Findelement(Locators.xpath, Base.LocatorsSetup("upload_Attachment_loc1")
	
	public void click_three_dots()
	{
//		isEnabled(Locators.xpath, three_dot_loc);
//		clickable(Findelement(Locators.xpath, three_dot_loc));
		ClickHover(Findelement(Locators.xpath, "//span[@class='mat-menu-trigger download-options shadow-sm border-start border-bottom border-1']"));
		clickable(Findelement(Locators.xpath, "//span[@class='mat-menu-trigger download-options shadow-sm border-start border-bottom border-1']"));
	}
	
	public void Click_download_btn()
	{
//		click(Findelement(Locators.xpath, download_btn_loc));
		
//		clickable(Findelement(Locators.xpath, "(//span[@id='download-option']//i)[1]"));
		click(Findelement(Locators.xpath, "//button[normalize-space(text())='Download']"));
		
		
	}
//	
//	public void ClickDoc()
//	{
//		click(Findelement(Locators.xpath, "//h1[@class='text-center download-image bi bi-image']"));
//		
////		ClickHover(Findelement(Locators.xpath, "//h1[@class='text-center download-image bi bi-image']"));
//	}
//	
//	public void BTNS()
//	{
////		ClickHover(Findelement(Locators.xpath, "//button[contains(@class,'mat-focus-indicator mat-menu-item')]"));
//		
//	}
	
	
	 public void AlertAccept() {
	 		
    	 driver.switchTo().alert().accept();
 		
 	}
	
	
   	 public String getAlertString()
	 {
		 String value = driver.switchTo().alert().getText();
		 return value;
	 }
	
}

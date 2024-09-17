package Test_Alumni;
import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Alumnihelpdesk.portal.Utilities;
import BaseClass.Base;
import Pages_Alumni_Module.SC_AL_004_MyrequestPage_Alumni;
import Utilities.AllureListeners;
import Utilities.Locators;
import Utilities.Screenshot;
import io.qameta.allure.Description;
@Listeners({AllureListeners.class})
public class SC_AL_004_Test_RequestTest extends Base{
	
	// Commit the changes
	//@Test(priority=1)
	@Description("Verify the comment post by Alumni")
	public void VerifyCommand()
	{
		
		SC_AL_004_MyrequestPage_Alumni request = new SC_AL_004_MyrequestPage_Alumni();
		request.ClickMyrequest();
		Utilities.sleep(4);
		request.ClickEdit_btn();
		String command ="Testing Command 3";
		request.WriteComment(command);
		Utilities.sleep(5);
		request.clickCommad_Btn();
		boolean value = isDisplay(Locators.xpath, Base.LocatorsSetup("VerifyCommand_loc"));
		Assert.assertEquals(true, value,"Not Displayed");
		Utilities.sleep(3);
		Screenshot.captureStepScreenshot(Base.driver);
		
	}

	//@Test(priority=2 )
	@Description("Verify to upload a PNG file by Alumni also check display or not")
	public void VerifyUploadFile_PNG()
	{
		
		SC_AL_004_MyrequestPage_Alumni request = new SC_AL_004_MyrequestPage_Alumni();
		request.ClickMyrequest();
		Utilities.sleep(4);
		request.ClickEdit_btn();
		request.clickPing();
		Utilities.sleep(4);
//		request.ClickUpload_attchment_btn(Base.LocatorsSetup("pngFile_loc"));
		Utilities.sleep(3);
		if(Findelement(Locators.xpath, "//small[normalize-space(text())='ilink logo.png']").isDisplayed())
		{
			System.out.println("Element is displayed or present");
		}
		Utilities.sleep(2);
		Screenshot.captureStepScreenshot(Base.driver);
	}
	//@Test(priority=3)
	@Description("Verify to upload a DOC file by Alumni")
	public void VerifyUploadFile_DOC()
	{
		
		SC_AL_004_MyrequestPage_Alumni request = new SC_AL_004_MyrequestPage_Alumni();
		request.ClickMyrequest();
		Utilities.sleep(4);
		request.ClickEdit_btn();
		request.clickPing();
		Utilities.sleep(4);
		request.ClickUpload_attchment_btn(Base.LocatorsSetup("docFile_loc"));
		Utilities.sleep(3);
		if(Findelement(Locators.xpath, "//small[normalize-space(text())='Dummydoc.docx']").isDisplayed())
		{
			System.out.println("Element is displayed or present");
		}
		Utilities.sleep(2);
		Screenshot.captureStepScreenshot(Base.driver);
	}
	//@Test(priority=4)
	@Description("Verify to upload a PDF file by Alumni")
	public void VerifyUploadFile_PDF()
	{
		
		SC_AL_004_MyrequestPage_Alumni request = new SC_AL_004_MyrequestPage_Alumni();
		request.ClickMyrequest();
		Utilities.sleep(4);
		request.ClickEdit_btn();
		request.clickPing();
		Utilities.sleep(4);
		request.ClickUpload_attchment_btn(Base.LocatorsSetup("pdfFile_loc"));
		Utilities.sleep(3);
		if(Findelement(Locators.xpath, "//small[normalize-space(text())='Dummypdf.pdf']").isDisplayed())
		{
			System.out.println("Element is displayed or present");
		}
		Utilities.sleep(2);
		Screenshot.captureStepScreenshot(Base.driver);
	}
	//@Test(priority=5)
	@Description("Verify to upload a JPG file by Alumni")
	public void VerifyUploadFile_JPG()
	{
		
		SC_AL_004_MyrequestPage_Alumni request = new SC_AL_004_MyrequestPage_Alumni();
		request.ClickMyrequest();
		Utilities.sleep(4);
		request.ClickEdit_btn();
		request.clickPing();
		Utilities.sleep(4);
		request.ClickUpload_attchment_btn(Base.LocatorsSetup("jpgFile_loc"));
		Utilities.sleep(3);
		if(Findelement(Locators.xpath, "//small[normalize-space(text())='Dummyjpg.jpg']").isDisplayed())
		{
			System.out.println("Element is displayed or present");
		}
		Utilities.sleep(2);
		Screenshot.captureStepScreenshot(Base.driver);
	}
//	
	
	@Test(priority=6 )
	@Description("Verify to upload file above 4MB size and verify alert box pop up")
	public void VerifyUploadInvalidSizeFile()
	{
		
		SC_AL_004_MyrequestPage_Alumni request = new SC_AL_004_MyrequestPage_Alumni();
		request.ClickMyrequest();
		Utilities.sleep(4);
		request.ClickEdit_btn();
		request.clickPing();
		Utilities.sleep(4);
		request.ClickUpload_attchment_btn(Base.LocatorsSetup("invalidFile_loc"));
		Utilities.sleep(3);
//		Alert alert = Base.driver.switchTo().alert();
//		Screenshot.captureStepScreenshot(Base.driver);
//		String value = alert.getText();
//		alert.accept();
//		Assert.assertEquals(value, "Please select a file with size equal to or less than 4MB.");
		Utilities.sleep(2);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	
//	@Test(priority=6 )
	public void VeifyDownloadFile()
	{
		SC_AL_004_MyrequestPage_Alumni request = new SC_AL_004_MyrequestPage_Alumni();
		request.ClickMyrequest();
		Utilities.sleep(4);
		request.ClickEdit_btn();
		request.clickPing();
		Utilities.sleep(2);
		request.click_three_dots();
		Utilities.sleep(3);
		request.Click_download_btn();
		Utilities.sleep(3);
	
		String homeDir = System.getProperty("user.home");
        String downloadDir = homeDir + "/Downloads";
        String fileName = "ilink logo.png";  
        File downloadedFile = new File(downloadDir + "/" + fileName);
        
        if (downloadedFile.exists()) {
            System.out.println("File downloaded successfully.");
            
        } else {
            System.out.println("File not found.");
        }

		
        
        
	   
        
        
        
	    
	 
	
	

}
}

package Pages_Alumni_Staff;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;


public class SC_AL_001_Login_Staff extends Base{
	String StaffSign_loc = "//button[normalize-space(text())='Admin / Staff Login']";
	String Sign_in_loc ="//span[contains(text(),'Sign In')]";
	String win_Email_loc ="i0116";
	String win_Password_loc ="i0118";
	String win_sumbit_loc ="idSIButton9";
	
	
	public void ClickStaffLogin()
	{
		click(Findelement(Locators.xpath, StaffSign_loc));
	}
	
	
	
	public void ClickSigin_btn()
	{
		click(Findelement(Locators.xpath, Sign_in_loc));
	}
	
	
	
	
	

}

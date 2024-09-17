package Pages_AlumniAdmin;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;

public class LoginPage_Admin extends Base{

	
//	String AdminSign_loc = "//button[normalize-space(text())='Alumni Sign In']";
//	String Email_loc ="//input[@placeholder='example@gmail.com']";
//	String password_loc = "//input[@type='password']";
//	String login_btn_loc = "//button[@type='submit']";
//	String incorrect_pass_msg = "//small[normalize-space(text())='Incorrect password !']";
//	String incorrect_user_msg = "//small[normalize-space(text())='User not found']";
//	String Admin_profile_loc ="//button[@routerlink='/settings']//div[1]";
//	String username_loc ="//input[@placeholder='Your Username']";
	
	@Step("click alumni login")
	public void ClickAlumni_button()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Alumni_Sign_loc")));
	}
	@Step("Enter the email as :{0}")
	public void EnterEmail(String Email)
	{
		send(Findelement(Locators.xpath, Base.LocatorsSetup("Email_loc")), Email);
		
	}
	@Step("Enter the password as :{0}")
	public void EnterPassword(String password)
	{
		send(Findelement(Locators.xpath, Base.LocatorsSetup("password_loc")), password);
	}
	@Step("click login button")
	public void ClickLogin()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("login_btn_loc")));
	}
	
	@Step("after login click profile button")
	public void ClickProfile()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("profic_logo_loc")));
	}
//	
	
    public String getUsername()
    {
    	String value = Findelement(Locators.xpath, Base.LocatorsSetup("profic_firstname_loc")).getText();
    	return value;
    }
//	
	
	
	
	
}

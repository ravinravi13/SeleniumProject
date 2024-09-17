package Pages_Alumni_Module;
import java.io.FileNotFoundException;


import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;


// one
public class SC_AL_001_LoginPage_Alumni extends Base {
	
	@Step("Click Alumni Sign-in button")
	public void ClickAlumni_button() 
	{
		click(Findelement(Locators.xpath ,Base.LocatorsSetup("Alumni_Sign_loc")));
	}
	
	@Step("Enter email of Alumni : {0} ")
	public void EnterEmail(String Email)
	{
		send(Findelement(Locators.xpath, Base.LocatorsSetup("Email_loc")), Email);
		
	}
	
	@Step("Enter password of Alumni: {0} ")
	public void EnterPassword(String password)
	{
		send(Findelement(Locators.xpath, Base.LocatorsSetup("password_loc")), password);
	}
	@Step("Click Login Button")
	public void ClickLogin()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("login_btn_loc")));
	}
	
	
}

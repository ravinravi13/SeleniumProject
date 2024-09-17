package Pages_Alumni_Module;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;

public class SC_AL_002_ForgetPassword_Alumni extends Base{
	
	
	
		
	
	@Step("Click Alumni sign in button")
	public void ClickAlumni_button() 
	{
		click(Findelement(Locators.xpath ,Base.LocatorsSetup("Alumni_Sign_loc")));
	}
	@Step("Click Forget Password in Alumni Login")
	public void ClickForgetPass()
	{
	     click(Findelement(Locators.xpath, Base.LocatorsSetup("Forget_passWord_loc")));
	}
	@Step("Enter the Email : {0}")
    public void EnterEmail(String text)
    {
//      click(Findelement(Locators.xpath, "//p[normalize-space(text())='Reset password link will be sent to your email id which will be valid for next 24 hours.']"));
    	send(Findelement(Locators.id, Base.LocatorsSetup("Forget_Pass_email_loc")), text);
    }
	@Step("Click reset button ")
    public void ClickRestPassButton()
    {
    	click(Findelement(Locators.xpath, Base.LocatorsSetup("reset_password_button")));
    }
    
    
}

package Pages_AlumniAdmin.Logout;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;

public class Logout_Admin extends Base{
	
	
	@Step("click logout button in the right corner and Accpet the Alert")
	public void ClickLogout()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Logout_loc")));
	}
	
	public void clickEnter()
	{
		
	}
	
	

}

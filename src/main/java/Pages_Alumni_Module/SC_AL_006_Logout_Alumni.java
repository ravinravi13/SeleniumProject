package Pages_Alumni_Module;

import org.openqa.selenium.Alert;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;

public class SC_AL_006_Logout_Alumni extends Base{

	Alert alert;
	
	@Step("click logout button in the right corner and Accpet the Alert")
	public void ClickLogout()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Logout_loc")));
	}
	
	public void clickEnter()
	{
		
	}
}


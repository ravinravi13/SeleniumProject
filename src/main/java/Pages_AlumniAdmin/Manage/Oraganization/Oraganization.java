package Pages_AlumniAdmin.Manage.Oraganization;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;

public class Oraganization extends Base{
	
	
//	String Manage_loc ="//h6[normalize-space(text())='Manage']";
//	String Organization_loc ="//a[contains(text(),'Organization')]";
//	String Department_name_loc ="category"; // Same vertical textbox and Location
//	String Organization_dropdown_loc ="organization"; // Same vertical textbox and Location
//	String Description_loc ="email-category"; // Sama as Location
//	String Addbtn = "//button[normalize-space(text())='Add +']";
//	String Vertical_loc ="//a[normalize-space(text())='Vertical']";
//	
//	String Location_loc ="//a[normalize-space(text())='Location']";
	
	@Step("Click the Location text left corner")
	public void clickLocation()
	{
		click(Findelement(Locators.xpath, "//a[contains(@class,'nav-link text-danger')]"));
	}
	
	@Step("Click Vertical link on left corner")
	public void ClickVertical()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Vertical_loc")));
	}
	public void ClickLocation()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Location_loc")));
	}
	
	@Step("Click the Mange link side navigation bar")
	public void ClickManage()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Manage_loc")));
	}
	
	@Step("Click Organization link when click manage link")
	public void ClickOranization()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Organization_loc")));
	}
   
	@Step("Enter the Department in textbox : {0}")
	public void EnterDepartment(String text)
	{
		send(Findelement(Locators.xpath, "(//label[text()='Name of Department']/following::input)[1]"), text);
	}
	@Step("Select Organization dropdown as : {0}")
	public void SelectOrganization(String text)
	{
		SelectVisibleText(Findelement(Locators.id, "organization"), text);
	}
	
	@Step("Enter Description in textbox : {0} and click Add button")
	public void EnterDescription(String text)
	{
		send(Findelement(Locators.id, "email-category"), text);
	}
	
	
	public void ClickAdd_btn()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Addbtn")));
	}
	
	@Step("Enter the Location in textbox as :{0}")
	public void EnterLocation(String text)
	{
		send(Findelement(Locators.xpath, "(//label[text()='Name of Location']/following::input)[1]"), text);
	}
	public void Entervertical(String text)
	{
		send(Findelement(Locators.xpath, "//label[text()='Name of Vertical']/following::input"), text);
	}
	
}

package Pages_AlumniAdmin.Manage.SLA;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;

public class SLA extends Base{

	
	String SLA_loc ="//a[@routerlink='/support/sla']";
	String newrule_loc ="//h6[normalize-space(text())='+Add New Rule']";
	String SLA_Name_loc = "sla-name";
	String SLA_description_loc ="sla-description";
	String SLA_organization_dropdown_loc ="sla-organization";
	String SLA_Reference_date_dropdown_loc = "sla-refernce-date";
    String SLA_Status_Select_loc ="sla-to-status";
    String  SLA_level_1_loc ="level-one";
    String SLA_level_2_loc ="level-two";
    String SLA_level_3_loc ="level-three";
    String SLA_Submit_loc ="//button[contains(text(),'Submit')]";
    String SLA_toggle_loc ="sla-status-check";
    
    

    @Step("Click Mange link side navigation bar")
    public void Click_Manage()
    {
 	   click(Findelement(Locators.xpath, Base.LocatorsSetup("Manage_loc")));
    }
	
    @Step("CLick SLA section")
    public void Click_SLA()
    {
 	   click(Findelement(Locators.xpath, Base.LocatorsSetup("SLA_loc")));
    }
    @Step("Click add new rule button left side")
    public void Click_AddNewRule()
    {
 	   click(Findelement(Locators.xpath, Base.LocatorsSetup("newrule_loc")));
    }
	@Step("Enter the SLA rule name as : {0}")
    public void EnterSLA_RuleName(String text)
    {
 	   send(Findelement(Locators.id, Base.LocatorsSetup("SLA_Name_loc")), text);
    }
    @Step("Enter SLA description as : {0}")
    public void EnterSLA_Description(String text)
    {
 	   send(Findelement(Locators.id, Base.LocatorsSetup("SLA_description_loc")), text);
    }
    @Step("Select Organization as :{0}")
    public void SelectSLAOragnization(String text) {
		SelectVisibleText(Findelement(Locators.id, Base.LocatorsSetup("SLA_organization_dropdown_loc")), text);
		
	}
    @Step("Select SLA reference as : {0}")
    public void SelectSLAReferencedate(String text) {
		SelectVisibleText(Findelement(Locators.id, Base.LocatorsSetup("SLA_Reference_date_dropdown_loc")), text);
		
	}
    @Step("Turn on toggle on form")
    public void Click_SLA_ToggleCase()
    {
 	   click(Findelement(Locators.id, Base.LocatorsSetup("SLA_toggle_loc")));
    }
    @Step("Select SLA Status as : {0}")
    public void SelectSLAStatus(String text) {
		SelectVisibleText(Findelement(Locators.id, Base.LocatorsSetup("SLA_Status_Select_loc")), text);
		
	}
    @Step("Select SLA level 1 as : {0}")
    public void EnterSLA_Level_1(String text)
    {
 	   send(Findelement(Locators.xpath, Base.LocatorsSetup("SLA_level_1_loc")), text);
    }
    @Step("Select SLA level 2 as : {0}")
    public void EnterSLA_Level_2(String text)
    {
 	   send(Findelement(Locators.xpath, Base.LocatorsSetup("SLA_level_2_loc")), text);
    }
    @Step("Select SLA level 3 as : {0}")
    public void EnterSLA_Level_3(String text)
    {
 	   send(Findelement(Locators.xpath, Base.LocatorsSetup("SLA_level_3_loc")), text);
    }
    
    public void ClickSLASumbit()
    {
    	 click(Findelement(Locators.xpath, Base.LocatorsSetup("SLA_Submit_loc")));
    }
    
}

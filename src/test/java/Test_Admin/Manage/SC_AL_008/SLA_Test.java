package Test_Admin.Manage.SC_AL_008;

import org.testng.annotations.Test;

import BaseClass.Base;
import Pages_AlumniAdmin.Manage.SLA.SLA;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class SLA_Test extends Base{

	
	@Description("Verify able create new SLA rule")
	@Test
	public void VerifyCreateNewSLA()
	{
		SLA sla = new SLA();
		sla.Click_Manage();
		sla.Click_SLA();
		sla.Click_AddNewRule();
		sla.EnterSLA_RuleName("Dummy rule");
		sla.EnterSLA_Description("Dummy Description");
		sla.SelectSLAOragnization("iLink Alumni");
		sla.SelectSLAReferencedate("CREATION");
		sla.Click_SLA_ToggleCase();
		sla.SelectSLAStatus("NEW");
		sla.SelectSLAStatus("CLOSED");
		sla.EnterSLA_Level_1("1");
		sla.EnterSLA_Level_2("2");
		sla.EnterSLA_Level_3("3");
		Screenshot.captureStepScreenshot(Base.driver);
	}
}

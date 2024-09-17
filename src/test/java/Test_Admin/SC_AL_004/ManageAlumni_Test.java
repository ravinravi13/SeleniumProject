package Test_Admin.SC_AL_004;

import org.testng.annotations.Test;

import BaseClass.Base;
import Pages_AlumniAdmin.ManageAlumni.Manage_Alumni;
import Utilities.Screenshot;
import io.qameta.allure.Description;

public class ManageAlumni_Test extends Base{
	
	
	@Description("Mange Section verify the searching funcationality by passing the alumni name")
	//@Test(priority=1)
	public void TC_001_VerifySearch_Name()
	{
		String text = null;
		Manage_Alumni manage = new Manage_Alumni();
		manage.ClickManageAlumni();
		text ="samadhan katkar";
		manage.EnterSearchAlumni(text);
		String value = manage.GetName().toLowerCase();
		System.out.println(value);
		
		if(text.contains(value))
		{
			System.out.println("Search is matched");
			Screenshot.captureStepScreenshot(Base.driver);
		}
		else {
			System.out.println("Search not  matched");
		}
	}

	@Description("Mange Section verify the searching funcationality by passing the Emplyoee id")
	@Test(priority=2)
	public void TC_002_VerifySearch_EMPId()
	{
		String text = null;
		Manage_Alumni manage = new Manage_Alumni();
		manage.ClickManageAlumni();
		text ="C1947";
		manage.EnterSearchAlumni(text);
		String value = manage.GetEMPl();
		System.out.println(value);
		
		if(value.contains(value))
		{
			System.out.println("Search is matched");
			Screenshot.captureStepScreenshot(Base.driver);
		}
		else {
			System.out.println("Search not  matched");
		}
	}

	@Description("Mange Section verify the searching funcationality by passing the Gmail")
	@Test(priority=3)
	public void TC_003_VerifySearch_Gmail()
	{
		String text = null;
		Manage_Alumni manage = new Manage_Alumni();
//		manage.ClickManageAlumni();
		text ="katkarsamadhan5@gmail.com";
		manage.EnterSearchAlumni(text);
		String value = manage.Getgmail();
		System.out.println(value);
		
		if(text.contains(value))
		{
			System.out.println("Search is matched");
			Screenshot.captureStepScreenshot(Base.driver);
		}
		else {
			System.out.println("Search not  matched");
		}
	}

}

package Test_Alumni;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Alumnihelpdesk.portal.Utilities;
import BaseClass.Base;
import Pages_Alumni_Module.SC_AL_003_CreateTicket_Alumni;
import Utilities.AllureListeners;
import Utilities.Screenshot;
import io.qameta.allure.Description;
@Listeners({AllureListeners.class})
public class SC_AL_003_Test_AlumniTicket_Test extends Base {
	
	SC_AL_003_CreateTicket_Alumni alumni_home = new SC_AL_003_CreateTicket_Alumni();
	SC_AL_005_Test_SearchBox search = new SC_AL_005_Test_SearchBox();
	
	
//	@Test(priority =1,groups="SC_AL_003")
	@Description("Verify the create new of Alumni and verify with success message of 'Successfully submitting request'")
	public void TC_001_VerifyCreateNewTicket()
	{
		
		alumni_home.ClicknewTicket();
		alumni_home.Title("Testing 3");
		alumni_home.Department("HR");
		Utilities.sleep(2);
		alumni_home.Category();
		alumni_home.Description("testing description 3");
		Utilities.sleep(3);
		alumni_home.submit();
		Screenshot.captureStepScreenshot(Base.driver);
		Utilities.sleep(3);
		
	}
	
	@Description("Verify the create new of Alumni with fill only title, description alone Verify the relavent error message of 'Error submitting request.' and alert ")
	@Test(priority =2, groups="SC_AL_003")
	public void TC_002_VerifyAlert() // Invalid test
	{
		
		Utilities.sleep(4);
		alumni_home.ClicknewTicket();
		alumni_home.Title("Testing 3");
		alumni_home.Description("testing description");
		alumni_home.submit();
		Screenshot.captureStepScreenshot(Base.driver);
	}
	
	

}

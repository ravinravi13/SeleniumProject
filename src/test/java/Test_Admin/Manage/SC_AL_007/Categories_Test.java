package Test_Admin.Manage.SC_AL_007;

import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import BaseClass.Base;
import Pages_AlumniAdmin.Manage.Categories.Categories;
import io.qameta.allure.Description;

public class Categories_Test extends Base{
	
	
	@Description("Verify respective department of categories display")
	@Test
	public void TC_001_VerifyCategoryName()
	{
		Categories cat = new Categories();
		cat.Click_Manage();
		cat.Click_Categories();
		cat.SelectDepartment("IT");
		Utilities.sleep(2);
		cat.GetCategoriesName();
	}
	@Description("Verify able to create new category")
//	@Test
	public void TC_002_VeriyCreateNewCategory()
	{
		Categories cat = new Categories();
		cat.Click_Manage();
		cat.Click_Categories();
		cat.ClickAddnewCategory();
		cat.EnterCategoryName("Dummmy");
		cat.EnterDescription("Dummy");
		cat.SelectOrganization("iLink Alumni");
		cat.Selectdepartment_Category("IT");
		cat.SelectStaff("Rajesh Dixit");
		Utilities.sleep(2);
		cat.SelectStaff("Raveendran Manickam");
	}
	
	
   
}

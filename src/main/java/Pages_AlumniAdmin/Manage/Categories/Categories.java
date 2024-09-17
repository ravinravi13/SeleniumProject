package Pages_AlumniAdmin.Manage.Categories;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseClass.Base;
import Utilities.Locators;
import io.qameta.allure.Step;

public class Categories extends Base{
	
	
	String Manage_loc ="//h6[normalize-space(text())='Manage']";
	String categories_loc ="//a[contains(text(),'Categories')]";
	String dept_Dropdown_loc = "//span[text()='Categories Added']/following-sibling::select";
	String categories_value_loc ="//p[contains(@class, 'text-start') and contains(@class, 'my-4') and contains(@class, 'ps-2') and contains(@class, 'fw-se')]/span";
	String Add_New_Category = "//button[@routerlink='new-category']";	
	String Category_name = "category";
	String description_loc ="category-description";
	String organization_loc ="//select[@formcontrolname='organization']";
	String department_loc_cat = "department";
	String Select_staff_cat = "staffs";
	String AddCat_btn_loc ="//button[normalize-space(text())='Add +']";
	
	@Step("Select Department as  : {0}")
	public void SelectDepartment(String text) {
		SelectVisibleText(Findelement(Locators.xpath, Base.LocatorsSetup("dept_Dropdown_loc")), text);
		
		
	}
	@Step("Get categories names from UI")
	public void GetCategoriesName()
	{
		List<WebElement>  lists =Findelements(Locators.xpath, Base.LocatorsSetup("categories_value_loc"));
		
		for(WebElement list : lists)
		{
			System.out.println(list.getText());
		}
	}
	
   @Step("Click Mange link side navigation bar")
   public void Click_Manage()
   {
	   click(Findelement(Locators.xpath, Base.LocatorsSetup("Manage_loc")));
   }
   @Step("Click Categories Section")
   public void Click_Categories()
   {
	   click(Findelement(Locators.xpath, Base.LocatorsSetup("categories_loc")));
   }
   
   @Step("click add new category button")
   public void ClickAddnewCategory()
   {
	   click(Findelement(Locators.xpath, Base.LocatorsSetup("Add_New_Category")));
   }
   @Step("Enter Category name as : {0}")
   public void EnterCategoryName(String text)
   {
	   send(Findelement(Locators.id, Base.LocatorsSetup("Category_name")), text);
   }
   @Step("Enter category description as : {0}")
   public void EnterDescription(String text)
   {
	   send(Findelement(Locators.id, Base.LocatorsSetup("description_loc")), text);
   }
   @Step("Select orgzation as : {0}")
   public void SelectOrganization(String text) {
	   
	   SelectVisibleText(Findelement(Locators.xpath, Base.LocatorsSetup("organization_loc")), text);
   }
   @Step("Select Department as : {0}")
   public void Selectdepartment_Category(String text)
   {
	   SelectVisibleText(Findelement(Locators.id, Base.LocatorsSetup("department_loc_cat")), text);
   }
   @Step("Select Staff as : {0}")
   public void SelectStaff(String text)
   {
	   SelectVisibleText(Findelement(Locators.id, Base.LocatorsSetup("Select_staff_cat")), text);
   }
   
   public void Click_ADD_Cat()
   {
	   click(Findelement(Locators.xpath, Base.LocatorsSetup("AddCat_btn_loc")));
   }
}

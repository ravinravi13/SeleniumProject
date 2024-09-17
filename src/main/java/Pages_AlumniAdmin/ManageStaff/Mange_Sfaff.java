package Pages_AlumniAdmin.ManageStaff;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import BaseClass.Base;
import Utilities.Locators;
import Utilities.Sleep;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Mange_Sfaff extends Base{
//	
//	String ManageStaff_loc  = "//h6[normalize-space(text())='Manage Staff']";
//	String staff_dopdown_loc ="staff-loader";
//	String textfiled_loc ="//input[@placeholder='Enter Name']";
//	String no_staff_loc = "//p[@class='text-center ng-star-inserted']";
//	String staffs_des_loc ="(//div[@class='col-3']//p)";
//	String cancel_loc ="//i[contains(@class,'bi bi-x-lg')]";
//	String  pencil_loc = "(//p[contains(@class,'text-center bi')])";
//	String Search_loc ="(//button[@cdk-describedby-host='0']//i)[2]";
	
	
	
	@Step("Click Manage Staff side navigation bar")
	public void ClickMangeStaff()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("ManageStaff_loc")));
	}
	
    @Step("Select department as : {0}")
	public void SelectDepartment(String text)
	{
		SelectVisibleText(Findelement(Locators.xpath, "//select[contains(@class,'form-select text-danger')]"), text);
	}
	@Step("Enter the name in textbox : {0}")
	public void EnterText(String text)
	{
	
//		clickable(Findelement(Locators.xpath, textfiled_loc), text);
//		Sleep sleep = new Sleep();
//		sleep.sleep(3);
		
//		EnterKeys(Findelement(Locators.xpath, textfiled_loc), text);
//		clickable(Findelement(Locators.xpath, textfiled_loc));
		send(Findelement(Locators.xpath, Base.LocatorsSetup("textfiled_loc")), text);
		Sleep sleep = new Sleep();
		sleep.sleep(3);
		
	}
	@Step("Click the search  icon")
	public void clickSearch()
	{
		click(Findelement(Locators.xpath, Base.LocatorsSetup("Search_loc")));
	}

   @Step("Get staff name from UI")
	public List<Map<String, String>>  GetStaffName()
	{		
		List<WebElement> employeeRows = Findelements(Locators.xpath, "//div[@class='row my-2 ng-star-inserted']");
         
		 List<Map<String, String>> uiData = new ArrayList<>();
		 
        for (WebElement row : employeeRows) {
            String employeeName = row.findElement(By.xpath("./div[1]")).getText();
            String department = row.findElement(By.xpath("./div[4]")).getText();
            String escalationLevel = row.findElement(By.xpath("./div[3]")).getText();
            
            
            
            uiData.add(Map.of(
                    "name", employeeName,
                    "department", department,
                    "escalationLevel", escalationLevel
            ));
	
	}
        System.out.println("UI Result "+uiData);
        
        return uiData;
        
}
	@Step("Get staff name from Api response")
	 public  List<Map<String, String>> GetSatffNameApi() {
	     
	        Response response = given()
	                .header("Authorization", "Bearer " + prop.getProperty("Bearer_token"))
	                .pathParam("id", "5")
	                .contentType(ContentType.JSON)
	                .accept(ContentType.JSON)
	                .when()
	                .get(prop.getProperty("dept_staff_endpoints"))
	                .then()
	                .statusCode(200)
	                .extract().response();

	     
	        List<Map<String, String>> apiDataList = new ArrayList<>();

	       
	        List<Map<String, Object>> responseList = response.jsonPath().getList("result");

	      
	        for (Map<String, Object> item : responseList) {
	           
	            String firstName = (String) item.get("firstName");
	            String lastName = (String) item.get("lastName");
	            String fullName = firstName + " " + lastName;

	           
	            String department = (String) ((Map<String, Object>) item.get("department")).get("description");
	            String escalationLevel = String.valueOf(item.get("escalationLevel"));

	            
	            Map<String, String> record = Map.of(
	                    "name", fullName,
	                    "department", department,
	                    "escalationLevel", escalationLevel
	            );
	            apiDataList.add(record);
	        }

	     
	        System.out.println("API result: " + apiDataList);

	        return apiDataList;
	    }
	    
	 
	 
	
	public String GetStaffSearch()
	{
		String employeeName = null;
		List<WebElement> employeeRows = Findelements(Locators.xpath, "//div[@class='row my-2 ng-star-inserted']");
		 for (WebElement row : employeeRows) {
	             employeeName = row.findElement(By.xpath("./div[1]")).getText();
		 }
		 
		 return employeeName;

	}
	
	
	public boolean Nostafferror()
	{
		boolean value = isDisplay(Locators.xpath, Base.LocatorsSetup("no_staff_loc"));
		
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	}

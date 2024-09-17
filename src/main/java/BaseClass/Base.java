package BaseClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.google.common.collect.ImmutableMap;
import Pages_Alumni_Module.SC_AL_001_LoginPage_Alumni;
import Pages_Alumni_Staff.SC_AL_001_Login_Staff;
import Utilities.Locators;
import Utilities.Screenshot;
import Utilities.Sleep;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

public class Base implements SeleniumBase{
	long timeOuts =20;
	static long maxWaitTime = 20;
	
	
     public static RemoteWebDriver driver;  //=new ChromeDriver();;
	 public  static WebDriverWait wait ;   //= new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));;
	 public static Properties prop;
	 public static Properties loc;
	 public  String hr[] = new String[7];
	 public  String it[] = new String[4];
	 public String talent[] = new String[3];
	 public String admin[] = new String[3];
	 
	 
// function
	 @Step("lanch the Browser : {0}")
 	 public void  Browerlaunch(String browser) {		 
//		 driver.get(baseURL);
//		 driver.manage().window().maximize();
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOuts));
//         wait = new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));
//         System.out.println("Driver initialized and URL loaded: " + baseURL); 
         
		 System.out.println("Launching browser: " + browser); 
	        switch (browser.toLowerCase()) {
	            case "chrome":
	                driver = new ChromeDriver();   
	                break;
	            case "edge":
	                driver = new EdgeDriver();
	                break;
	            case "firefox":
	                driver = new FirefoxDriver();
	                break;
	            default:
	                System.err.println("Driver not Found");
	              
	               
	        }
	        if (driver != null) {
	        	prop = new Properties();
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOuts));
	            driver.get(Base.PropertiesSetup("baseurl"));
	            wait = new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));
	            System.out.println("Driver initialized and URL loaded: "); 
	        } else {
	            System.err.println("Driver initialization failed.");
	        }
	       

			
	}
	
	public void close() {
		
		driver.close();
	}

	
	public void quite() {
		
		driver.quit();
	}

	
	public WebElement Findelement(Locators type, String value) {
		
		if (driver == null) {
            System.err.println("Driver is null in FindElement");
            return null;
        }
		
		switch(type)
		{
		case id:
			return driver.findElement(By.id(value));
			
		case name:
			return driver.findElement(By.name(value));
			
		case xpath:
			return driver.findElement(By.xpath(value));
			
		case link:
			return driver.findElement(By.linkText(value));
			
		case className:
			return driver.findElement(By.className(value));
			
			default:
				break;
				
		 }
		
		return null;
	}

//	 @BeforeGroups("Staff")
	//@BeforeClass
	public void StaffLogin() {
		Browerlaunch("chrome");
		SC_AL_001_Login_Staff staff = new SC_AL_001_Login_Staff();
		staff.ClickStaffLogin();
		staff.ClickSigin_btn();
		String parentHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		 for(String handle : handles)
		 {
			if(!handle.equals(parentHandle))
			{
				driver.switchTo().window(handle);
				WebElement emailField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("i0116")));
				 send(emailField, Base.PropertiesSetup("Staff_email"));
				click(Findelement(Locators.id, "idSIButton9"));      //driver.findElement(By.id("idSIButton9")).click();
				Sleep sleep = new Sleep();
				 sleep.sleep(3);
				WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("i0118")));
				 send(passwordField, Base.PropertiesSetup("Staff_password"));                       //passwordField.sendKeys(Password);
				 click(Findelement(Locators.id, "idSIButton9"));       //driver.findElement(By.id("idSIButton9")).click();
				
				
			}
		 }
		 
		 driver.switchTo().window(parentHandle);
	}

	
	public void Selectvalue(WebElement ele, String value) {
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		new Select(element).selectByValue(value);
	}

	
	public void SelectVisibleText(WebElement ele, String value) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		new Select(element).selectByVisibleText(value);
		
	}

	
	public void SelectIndex(WebElement ele, int index) {
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		new Select(element).selectByIndex(index);
		
	}

	
	public void click(WebElement ele) {
		WebElement element =wait.until(ExpectedConditions.elementToBeClickable(ele));
		element.click();
		
	}
	
	public void visibilityClick(WebElement ele)
	{
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		element.click();
	}
	

	public void send(WebElement ele, String TestData) {
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		element.clear();
		element.sendKeys(TestData);
		
	}
	
     public void Enterkeys(WebElement ele, String TestData, Keys keys) {
		
    	 WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
 		element.clear();
 		element.sendKeys(TestData,keys);
	}
     
     
     
     public void AlertAccept() {
 		
    	 driver.switchTo().alert().accept();
 		
 	}

	
	public void clear(WebElement ele) {
		
		
	}

	
	public String getTitle() {
		
		return null;
	}

	
	public String getURL() {
		
		return null;
	}

	
	public boolean isDisplay(Locators type , String value) {
		
		WebElement element = Findelement(type,value);
		if(element.isDisplayed())
		{
			return true;
		}
		else {
			return false;
		}
		
		
	}

  public void isEnabled(Locators type, String value) {
		
		boolean element = driver.findElement(By.xpath(value)).isEnabled();
		if(element)
		{
			driver.findElement(By.xpath(value)).click();
		}
		
		
	}

	

	
	public String getText(Locators type,String value) {
		
		String text;
		if (driver == null) {
            System.err.println("Driver is null in FindElement");
            return null;
        }
		
		switch(type)
		{
		case id:
			
			 text = driver.findElement(By.id(value)).getText();
			 System.out.println(text);
			 return text;
		
			
		case name:
			
			text= driver.findElement(By.name(value)).getText();
			 System.out.println(text);
			 return text;
			
		case xpath:
			
			return text= driver.findElement(By.xpath(value)).getText();
			
		case link:
			
			return  text = driver.findElement(By.linkText(value)).getText();
			
		case className:
			
			return  text = driver.findElement(By.className(value)).getText();
			
			default:
				return null;
				
		 }
		
		
	}
	
	
	
    @BeforeClass
	public void Setup()
	{
		
		Browerlaunch("chrome");
		SC_AL_001_LoginPage_Alumni login = new SC_AL_001_LoginPage_Alumni();
		login.ClickAlumni_button();
		login.EnterEmail(Base.PropertiesSetup("Alumni_Email"));
		login.EnterPassword(Base.PropertiesSetup("Alumni_Password"));
		login.ClickLogin();
		System.out.println("Login Successfully");
//	   Assert.assertEquals(Findelement(Locators.xpath, "//h4[contains(.,'Welcome to Alumni Helpdesk')]").getText(), "Welcome to Alumni Helpdesk");	
	}
   
  @AfterClass
   public void TearDown()
   {
	   driver.quit();
   }
   
   
   
  @AfterMethod
   public void Screen(ITestResult result) {
       if (ITestResult.FAILURE == result.getStatus()) {
           String screenshotPath = Screenshot.captureScreenshot(driver, result.getName());
           attachScreenshotToAllure(screenshotPath);
       }
       
   }
   
   @Attachment(value = "Screenshot on Failure", type = "image/png")
   public byte[] attachScreenshotToAllure(String path) {
       try {
           return FileUtils.readFileToByteArray(new File(path));
       } catch (IOException e) {
           e.printStackTrace();
           return new byte[0];
       }
   }
   
   
 
   public void Quite()
   {
	   driver.quit();
   }

	
	public void clickable(WebElement ele, String value) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		  element.sendKeys(value);
	        element.sendKeys(Keys.ENTER);
		
	}
	
    
	public void sendfile(WebElement ele,String value) {
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
//		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//		  Actions actions = new Actions(driver);
//          actions.moveToElement(element).click().sendKeys(value).perform();
          
		WebElement uploadElement = ele;
		((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", uploadElement);
		((JavascriptExecutor) driver).executeScript("arguments[0].disabled=false;", uploadElement);
		uploadElement.sendKeys(value);

          
//          WebElement uploadElement = ele;
//          ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", uploadElement);
//          uploadElement.sendKeys(value);

	}
	
	public void EnterKeys(WebElement ele, String value)
	{
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		  element.sendKeys(value);
	        element.sendKeys(Keys.ENTER);
	}
	
	
	public void clickable(WebElement ele) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//		  element.click();
//	        element.sendKeys(Keys.ENTER);
		  Actions actions = new Actions(driver);
          actions.moveToElement(element).click().perform();
	}
	
	public void ClickHover(WebElement ele)
	{
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		  Actions actions = new Actions(driver);
		  actions.moveToElement(ele).click().perform();
		  
	}
	
	public static String  PropertiesSetup(String key)  
	{
		prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\hi\\eclipse-workspace\\Alumni-portal\\src\\main\\resources\\application.properties");
			prop.load(ip);			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}
	
	
	public static String LocatorsSetup(String key) 
	{
		
		loc = new  Properties();
		try {
			FileInputStream fi = new FileInputStream("C:\\Users\\hi\\eclipse-workspace\\Alumni-portal\\src\\main\\resources\\Locators.properties");
			loc.load(fi);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return loc.getProperty(key);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	public List<WebElement> Findelements(Locators type, String value) {
	     
		if (driver == null) {
            System.err.println("Driver is null in FindElement");
            return null;
        }
		
		switch(type)
		{
		case id:
			return driver.findElements(By.id(value));
			
		case name:
			return driver.findElements(By.name(value));
			
		case xpath:
			return driver.findElements(By.xpath(value));
			
		case link:
			return driver.findElements(By.linkText(value));
			
		case className:
			return driver.findElements(By.className(value));
			
			default:
				throw new IllegalArgumentException("Invalid locator type: " + type);
				
		 }
		
	}

	
  public String[] Hrdepartment()
  {
	  hr[0]="pf related";
	  hr[1] = "payslip";
	  hr[2] = "experience letter";
	  hr[3] = "form 16";
	  hr[4] = "full & final settlement";
	  hr[5] = "leave related";
	  hr[6] = "gratuity";
	  
	  return hr;
  }
  
  public String[] ITdepartment()
  {
	  it[0]="laptop submission";
	  it[1] = "access";
	  it[2] = "testing 2";
	  it[3] = "it accessories submission"; 
	  return it;
  }
  
  public String[] TalentAcqisitionDepartment()
  {
	  talent[0]="current job openings";
	  talent[1] = "referral program";
	  talent[2] = "test category";
	  
	  return talent;
  }

  public String[] AdminDepartment()
  {
	  admin[0]="laptop dispersement";
	  admin[1] = "travel reimbursement";
	  admin[2] = "cipher plus gift store";
	  
	  return admin;
  }
  
  

  @BeforeSuite
  public void setAllureEnvironment() {
	  allureEnvironmentWriter(
              ImmutableMap.<String, String>builder().put("Browser", "Chrome").put("Browser.Version", "127.0.6533.122").put("OS Name","Windows 11")
                      .put("URL", "https://alumniuitest.azurewebsites.net/#/").build(),
              System.getProperty("user.dir") + "/allure-results/");
  }





	


	





	
}


	
	


	
	
	
	 
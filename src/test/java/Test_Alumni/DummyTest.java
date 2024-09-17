package Test_Alumni;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Alumnihelpdesk.portal.Utilities;

import Utilities.Locators;

public class DummyTest {
	
	ChromeDriver driver = new ChromeDriver();
	public static WebDriverWait wait;
	
	@Test
	public void Dummy()
	{
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://alumniuitest.azurewebsites.net/#/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//button[normalize-space(text())='Alumni Sign In']")).click();
        driver.findElement(By.xpath("//input[@placeholder='example@gmail.com']")).sendKeys("demouser2002@yopmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qazqazqaz");
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        driver.findElement(By.xpath("//h6[normalize-space(text())='My Requests']")).click();
        
        
        WebElement table = driver.findElement(By.id("myTickets"));
        Utilities.sleep(3);
        List<WebElement> allRows = table.findElements(By.cssSelector("tbody tr"));
        for(WebElement rows :allRows)
        {
        	List<WebElement> row = rows.findElements(By.tagName("td"));
        	row.get(6).click();
        	break;
        }
        
        driver.findElement(By.xpath("(//div[contains(@class,'mat-ripple mat-tab-label')])[2]")).click();
        driver.findElement(By.xpath("//i[contains(@class,'bi bi-three-dots')]")).click();
        driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-item')]")).click();
        
        File filelocation = new File("C:\\Users\\hi\\Downloads");
		File[]  files = filelocation.listFiles();
		
		for(File file :files)
		{
			if(file.getName().equals("MicrosoftTeams-image.png"))
			{
				System.out.println("File Downloaded");
				break;
			}
		}

      WebElement element = driver.findElement(By.xpath("//i[contains(@class,'text-success bi')]"));
        element.sendKeys("C:\\Users\\hi\\eclipse-workspace\\Alumni-portal\\File\\MicrosoftTeams-image.png");
       
		driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://alumniuitest.azurewebsites.net/#/");
      wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      
      driver.findElement(By.xpath("//button[normalize-space(text())='Alumni Sign In']")).click();
      driver.findElement(By.xpath("//input[@placeholder='example@gmail.com']")).sendKeys("alumniadmin@ilink-systems.com");
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ilink123");
      
      driver.findElement(By.xpath("//button[@type='submit']")).click();
     
     driver.findElement(By.xpath("//button[@routerlink='/settings']//div[1]")).click();
     WebElement name = driver.findElement(By.xpath("//input[@formcontrolname='firstName']"));
     name.click();
    // System.out.println(text);
     driver.quit();
        
	}

}

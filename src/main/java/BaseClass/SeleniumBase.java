package BaseClass;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.browsingcontext.Locator;
import org.openqa.selenium.remote.RemoteWebDriver;

import Utilities.Locators;

public interface SeleniumBase {
	
	/***
	 * This function is used to launch the browser 
	 * @param BrowserName
	 * @param URL
	 */
	void Browerlaunch(String browser);
	
		
	/*
	 * This is used to close the Browser 
	 */
	void close();
	
	/*
	 * This function is used  to quite the Browser
	 */
	void quite();
	
	
	/***
	 * This method is used to find the web element with in the page
	 * @param type - type be id, name or link text
	 * @param value
	 * @return
	 */
	WebElement Findelement(Locators type ,String value);
	
	
	
	
	/**
	 * This method is used to handle the windows String index 
	 * @param i 
	 */
	void StaffLogin();
	
	
	/**
	 * This method is used to select the window String index
	 * @param ele
	 * @param value
	 */
	void Selectvalue(WebElement ele, String value);
	
	/**
	 * This is  method is used to Select the dropdowm String text
	 * @param ele
	 * @param value
	 */
	void SelectVisibleText(WebElement ele, String value);
	
	
	
	/***
	 * This method is used for the dropdowm value String index or position
	 * @param ele
	 * @param value
	 */
	void SelectIndex(WebElement ele, int index);
	
	/**
	 * This method is used to click the Webelement wait until the element is clickable
	 * @param ele
	 */
	void click(WebElement ele);
	
	
	/**
	 * This method is used to Clear the Webelement 
	 * @param ele
	 */
	void clear(WebElement ele);
	
	
	/***
	 * This method is used send the testdata to filed until wait the visible of element is visible 
	 * @param ele
	 * @param TestData
	 */
	void send(WebElement ele, String TestData);
	
	
	/***
	 * This method is used to click the webelement String keys until the element is visible 
	 * @param ele
	 * @param TestData
	 * @param keys
	 */
	void Enterkeys(WebElement ele, String TestData, Keys keys);
	
	
	
	/***
	 * This method is used to Accept the Alert in webpage
	 */
	void AlertAccept();
	
	
	
	List<WebElement> Findelements(Locators type,String value);
	
	
	
	
	
	
	
	String getTitle();
	
	
	
	String getURL();
	
	
	boolean isDisplay(Locators type,String value);
	
	
	void isEnabled(Locators type, String value);
	
	
	String getText(Locators type,String value);
	
	
	void clickable(WebElement ele,String value);
	
	
	
	
	
	
	

}

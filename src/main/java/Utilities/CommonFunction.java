package Utilities;

import BaseClass.Base;
import io.qameta.allure.Step;

public class CommonFunction extends Base{

  
	String totalTicket_loc = "//div[@class='mat-paginator-range-actions']//div[1]";
	@Step("Get the total ticket of it will reflect on pagination of ticket bottom right corner")
	public int  getTotalNumberTicket()
	{
	    
		String str = getText(Locators.xpath, totalTicket_loc);
        String[] totalLength = str.split("of");
        String len = totalLength[totalLength.length - 1].trim();
        int len1 = Integer.parseInt(len);
        System.out.println("Total length: " + len1);	        
        return len1;
	}
	
	
	
	
}

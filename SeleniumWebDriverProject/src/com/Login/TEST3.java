package com.Login;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class TEST3 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.icicibank.com/");
		driver.findElementByXPath("//div[@id='push-modal-content']/div[2]/div/p[2]/a").click();
		
		Set<String> winids=driver.getWindowHandles();
		
		       Iterator<String> setit= winids.iterator();
		       
		      String First_browseridfrompage1=setit.next();
		//System.out.println(First_browserid);
		
		driver.findElementByXPath("html/body/div[1]/header/div/ul/li[4]/a").click();
		
		
		 winids=driver.getWindowHandles();
		
	       setit= winids.iterator();
	       
	      String First_browserid=setit.next();
	System.out.println(First_browserid);
	
    String Second_browserid=setit.next();
	System.out.println(Second_browserid);
		
	
	driver.switchTo().window(Second_browserid);
	
	driver.findElementByXPath(".//*[@id='Search']").sendKeys("Chicago");
	
	driver.switchTo().window(First_browserid);
	
	driver.findElementByXPath("html/body/div[1]/header/div/ul/li[5]/a").click();
	
	

	}

}

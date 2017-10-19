package com.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		driver.findElementByXPath(".//a[text()='Selectable']").click();
		
		WebElement a=driver.findElementByXPath(".//*[@id='content']/iframe");
		
		//switch from page to frame 
		driver.switchTo().frame(a);

		driver.findElementByXPath(".//*[@id='selectable']/li[1]").click();
		//switch from frame to page
		driver.switchTo().defaultContent();
		
		driver.findElementByXPath(".//*[@id='sidebar']/aside[1]/ul/li[5]/a").click();
	}

}

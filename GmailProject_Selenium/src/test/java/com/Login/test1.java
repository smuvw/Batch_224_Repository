package com.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		//driver.get("https://jqueryui.com/resources/demos/slider/default.html");

		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		Actions action= new Actions(driver);
		
		//WebElement a=driver.findElementByXPath(".//*[@id='slider']/span");
		
		WebElement b=driver.findElementByXPath(".//*[@id='resizable']/div[3]");
		
		//action.dragAndDropBy(a, 400, 0).perform();
		
		action.dragAndDropBy(b, 400, 300).perform();

	}

}

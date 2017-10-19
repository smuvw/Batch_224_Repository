package com.Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/spinner/");
		
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		
		WebElement a=driver.findElementByXPath(".//*[@id='content1']/iframe");
		
		driver.switchTo().frame(a);
		
		driver.findElementByXPath(".//*[@id='spinner']").sendKeys("1");
		
		driver.findElementByXPath(".//*[@id='getvalue']").click();
		
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

	}

}

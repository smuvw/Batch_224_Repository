package com.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookAccount {
	
	
	FirefoxDriver driver;
	
	public void openBrowser(){
		
		//driver= new ChromeDriver();
		
		driver= new FirefoxDriver();
		
		driver.get("http://www.facebook.com/");
		
		
		//driver.findElementByXPath("//input[@id='u_0_a']").sendKeys("sam");
		//driver.findElementByName("firstname").sendKeys("Srini");
		//driver.findElementById("u_0_c").sendKeys("MUVVA");
		driver.findElementByXPath("//a[text()='Log In']").click();
	}

	public static void main(String[] args) {
		
		FacebookAccount fa= new FacebookAccount();
		fa.openBrowser();

	}

}

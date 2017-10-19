package com.Login;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	ChromeDriver driver;
	
	public void openBrowser(){
		
	 driver=new ChromeDriver();
	}
	
	public void FLogin(){
		driver.get("https://www.facebook.com/");
		String	title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	

	public static void main(String[] args) {
		
		FacebookLogin fb= new FacebookLogin();
		fb.openBrowser();
		fb.FLogin();

	}

}

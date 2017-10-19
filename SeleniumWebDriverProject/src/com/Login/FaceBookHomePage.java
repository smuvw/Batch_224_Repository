package com.Login;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookHomePage {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		/*WebElement a=driver.findElementById("u_0_9");
		a.sendKeys("srini");
		Thread.sleep(9000);
		a.clear();
		driver.quit();*/
		
		WebElement s=driver.findElementById("month");
		Select dropdown= new Select(s);
		
		//dropdown.selectByIndex(5);
		//dropdown.selectByValue("2");
		
		//dropdown.selectByVisibleText("Jun");
		
		List<WebElement> options=dropdown.getOptions();
		
		for(int i=0;i<options.size();i++){
			
			System.out.println(options.get(i).getText());
		}
		
		
		

	}

}

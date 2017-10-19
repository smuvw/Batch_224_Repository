package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test2 {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		WebDriverWait wait= new WebDriverWait(driver,20L);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='sidebar']/aside[1]/ul/li[6]/a")));
		
		

	}

}

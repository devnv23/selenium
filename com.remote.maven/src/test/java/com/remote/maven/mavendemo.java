package com.remote.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class mavendemo {

	@Test
	public void search()
	{
		WebDriver driver =new FirefoxDriver();	
		driver.get("http://www.ebay.in");
		driver.findElement(By.id("gh-ac")).sendKeys("Sony");
		driver.findElement(By.id("gh-btn")).click();
		
	}

}

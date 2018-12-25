package com.remote.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class remotecontrolpaging {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.remotecontrols.com/");
		driver.findElement(By.id("search")).sendKeys("Remote");
		driver.findElement(By.xpath(".//*[@id='JS_SFNT']/header[2]/div/div/div[2]/div/div[1]/form/button")).click();
		
		List<WebElement> Pagination =driver.findElements(By.xpath
				(".//*[@id='site-container']/div[5]/div[2]/div/div/div[2]/div[4]/div"));
		
	    int ps= Pagination.size();
		System.out.println("Main Pagination Size: " +ps);
		
		// click on pagination link
	    for(int i=1; i<184; i++)
	    { 	
	    	driver.findElement(By.xpath(".//*[@id='site-container']/div[5]/div[2]/div/div/div[2]/div[4]/div/div/a["+i+"]")).click() ;
	    	Thread.sleep(5000); 
	    	System.out.println("Loop "+i);
	    	usingheaderh5.grabdata();
	    	
	    }
		List<WebElement> Brands= driver.findElements(By.xpath(".//*[@id='site-container']/div[5]/div[2]/div/div/div[1]"));
		//System.out.println("Brands" + Brands.size());
		//System.out.println("Brand:"+Brands.get(0).getText());
		Thread.sleep(1000);
//		for(int i=2;i<=94;i++)
//		{
//			WebElement Brand = driver.findElement(By.xpath(".//*[@id='nav']/li["+ i + "]/a"));
//			Thread.sleep(2000);
//			String Brandname=Brand.getText();
//			Brand.click();
//			
//			
//			
//			if(ps>0)
//			{
//				
//				
//			}
//			else
//			{
//				System.out.println(Brandname +"  No Pagination");
//				for(int j=0;j<s-5;j++)
//				{
//					System.out.println(Brandname + "	"+ details.get(j).getText());
//				
//				}
//			}
//			
//		}
				System.out.println("Data Successfully retrieved");
				driver.close();
	}		
	
	
}

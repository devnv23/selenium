package com.remote.maven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class remotes {

	public static void main(String[] args) throws Exception{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.remotes.com/Default.asp");
		driver.findElement(By.xpath(".//*[@id='search']")).sendKeys("Remote");
		driver.findElement(By.xpath("html/body/header/div[1]/form/input")).click();
		List<WebElement> pages=driver.findElements(By.xpath
				(".//*[@id='content_area']/table[2]/tbody/tr/td/table[3]/tbody/tr[2]/td[2]/div/span"));
		String pagesize= driver.findElement(By.xpath
				(".//*[@id='content_area']/table[2]/tbody/tr/td/table[3]/tbody/tr[2]/td[2]/div/a")).getText();
		int totalpages= Integer.parseInt(pagesize);
		int ps=pages.size();
		System.out.println("Pages Size:" +ps +" Total Pages : "+totalpages);
		if(ps>0)
		{
			
			for(int i=1;i<=36;i++)
			{
				WebElement details= driver.findElement(By.xpath
						(".//*[@id='content_area']/table[2]/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div/div["+i+"]/a"));
						  
				System.out.print("Page 1"+"	"+details.getText());
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				try {
					WebElement models= driver.findElement(By.xpath
							(".//*[@id='content_area']/table[2]/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div/div["+ i +"]/div[2]/p[2]"));
					System.out.println("*"+"	"+ models.getText());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("	");
				}
			}
			for(int j=2;j<totalpages;j++)
			{
				if((j<=4)&&(j<=ps))
				{
					driver.findElement(By.xpath(".//*[@id='content_area']/table[2]/tbody/tr/td/table[3]/tbody/tr[2]/td[2]/div/span["+j+"]/a")).click();
					for(int i=1;i<=36;i++)
					{
						WebElement details= driver.findElement(By.xpath
								(".//*[@id='content_area']/table[2]/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div/div["+i+"]/a"));
							 
						System.out.print("Page "+j+"	"+details.getText());
						try {
							WebElement models= driver.findElement(By.xpath
									(".//*[@id='content_area']/table[2]/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div/div["+ i +"]/div[2]/p[2]"));
							System.out.println("	*"+ models.getText());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
							System.out.println("	");
						}
					}
				}
				else if((ps<totalpages)&&(j<totalpages-1))
				{
					driver.findElement(By.xpath(".//*[@id='content_area']/table[2]/tbody/tr/td/table[3]/tbody/tr[2]/td[2]/div/span[5]/a")).click();
					for(int i=1;i<=36;i++)
					{
						WebElement details= driver.findElement(By.xpath
								(".//*[@id='content_area']/table[2]/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div/div["+i+"]/a"));
							 
						System.out.print("Page "+j+"	"+details.getText());
						try {
							WebElement models= driver.findElement(By.xpath
									(".//*[@id='content_area']/table[2]/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/div/div/div/div/div["+ i +"]/div[2]/p[2]"));
							System.out.println("	*"+ models.getText());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
							System.out.println("	");
						}
	
					}
				}
			}	
		}
		
		
		
		// 
	}

}

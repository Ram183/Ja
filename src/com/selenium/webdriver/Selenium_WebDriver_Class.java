package com.selenium.webdriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_WebDriver_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
/*		WebDriver Methods
		
		1.  get()
		2.  getTitle()
		3.  getCurrentUrl()
		4.  getPageSource()
		5.  getWindowHandle()
		6.  getWindowHandles()
		7.  findElement()
		8.  findElements()
		9.  manage()
		10. navigate()
		11. switchTo()
		12. close()
		13. quit()                         */

		System.setProperty("webdriver.edge.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.get("https://www.guru99.com/upload-download-file-selenium-webdriver.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		Thread.sleep(4000);
		
		String title = driver.getTitle();
		
		System.out.println("Title of the Webpage: " + title);
		
		Thread.sleep(4000);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("CurrentUrl of the Webpage: " + currentUrl);
		
		Thread.sleep(4000);
		
		String windowHandle = driver.getWindowHandle();
		
		System.out.println("Parent Window ID: " + windowHandle);
		
		Thread.sleep(4000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println("Child Window Id's:  " + windowHandles);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@class='kb-table-of-contents-icon-trigger kb-table-of-contents-toggle']")).click();
		
		Thread.sleep(4000);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//*[@id=\"post-1148\"]/div/div/div[5]/ul"));
		
		for (WebElement x : allLinks) {
			
				System.out.println(x.getText());
			
		}
		
		Thread.sleep(4000);
		
/*		System.out.println("***************************************");
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
		
		System.out.println("***************************************");*/
		
		Thread.sleep(4000);
		
		driver.close();
		
		driver.quit();
	}

}

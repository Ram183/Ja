package com.selenium.actionclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class_Drag_Drop {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://leafground.com/drag.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement dragTarget = driver.findElement(By.id("form:drag_content"));
		
		WebElement dropTarget = driver.findElement(By.id("form:drop_content"));
		
		Actions ac = new Actions(driver);
		
		//Method 1 Drag and Drop
		
		ac.moveToElement(dragTarget);
		
		Thread.sleep(4000);
		
		ac.clickAndHold().moveToElement(dropTarget).release(dropTarget).build().perform();
		
		Thread.sleep(4000);
	
		//Method 2 Drag and Drop
		
//		Thread.sleep(4000);
//		
//		ac.dragAndDrop(dragTarget, dropTarget).build().perform();
//		
//		Thread.sleep(4000);
		
		driver.quit();
		
	}

}

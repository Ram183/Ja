package com.selenium.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Xpath_Axis_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) {

/*		The Different Types of Axis
		
		1. Child
		2. parent
		3. Descendant
		4. Ancestor
		5. following-Sibling
		6. preceding-sibling        */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/button.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		// 1. Child Axis

		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/child::span")).click();
		
		// 2. Parent Axis
		
		driver.findElement(By.xpath("//*[@class='ui-button-text ui-c']/parent::button[@id='j_idt88:j_idt94']")).click();
		
		// 3. Ancestor Axis
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']/ancestor::div/button")).click();
		
		// 4. Descendant Axis
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']/descendant::span[2]")).click();
		
		// 5. following-Sibling
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']/following-sibling::*")).click();
		
		//6. preceding-sibling 
		
		driver.findElement(By.xpath("")).click();
		
	}

}

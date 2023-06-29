package com.selenium.webelement;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium_WebElement_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
/*		WebElement (Interface) contains Methods are
		
		1.  sendKeys()                                      	
		2.  clear()                   							
		3.  click()                                    			
		4.  findElement()									 	
		5.  findElements()										
		6.	getCssValue()
		7.  getText()
		8.  getAttribute()
		9.  getTagName()
		10. getLocation()
		11. getSize()
		12. isDisplayed()
		13. isSelected()
		14. isEnabled()
		15. submit()                                    */
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement userName = driver.findElement(By.id("username")); 
		
		userName.sendKeys("ramammu18");
		
		Thread.sleep(4000);
		
		userName.clear();
		
		Thread.sleep(4000);
		
		userName.sendKeys("ramammu18");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("ram@123a");
		
		driver.findElement(By.id("login")).click();	
		
		WebElement getAttributeValue = driver.findElement(By.id("username_show"));
		
		String attribute = getAttributeValue.getAttribute("value");
		
		System.out.println(attribute);
		
		WebElement welcomeNote = driver.findElement(By.xpath("//*[contains(text(),'Welcome to Adactin')]"));
		
		String text = welcomeNote.getText();
		
		System.out.println(text);
		
		List<WebElement> links = driver.findElements(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]"));
		
		System.out.println(links.size());
			
		driver.quit();
	}

}

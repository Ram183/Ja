package com.selenium.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Locator_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("ramammu18");
		
		driver.findElement(By.name("password")).sendKeys("ram@123a");
		
		driver.findElement(By.className("login_button")).click();
		
		String text = driver.findElement(By.tagName("a")).getText();
			
		System.out.println(text);
		
		String attribute = driver.findElement(By.cssSelector("input#username_show")).getAttribute("background-color");
		
		System.out.println(attribute);
		
		String text2 = driver.findElement(By.linkText("DOWNLOAD")).getText();
		
		System.out.println(text2);
		
		String text3 = driver.findElement(By.partialLinkText("adactin")).getText();
		
		System.out.println(text3);
		
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		
		logout.click();
		
		driver.quit();
		
	}

}

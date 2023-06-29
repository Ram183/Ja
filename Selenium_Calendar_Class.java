package com.calendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Calendar_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://leafground.com/calendar.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement nextButton = driver.findElement(By.xpath("//button[text()='Next']"));
		
		nextButton.click();
		
		Thread.sleep(4000);
		
		WebElement selectDate = driver.findElement(By.xpath("//td[@data-date='2023-05-06']"));
		
		selectDate.click();
		
		Thread.sleep(4000);
		
		WebElement titleDate = driver.findElement(By.xpath("//input[@id='j_idt87:title'][@name='j_idt87:title']"));
		
		titleDate.sendKeys("Daily Task for the day");
		
		Thread.sleep(4000);
		
		WebElement saveButton = driver.findElement(By.xpath("//span[text()='Save']"));
		
		saveButton.click();
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}

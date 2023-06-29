package com.selenium.dropdownclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Dropdown_Button {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("ramammu18");
		
		driver.findElement(By.id("password")).sendKeys("ram@123a");
		
		driver.findElement(By.id("login")).click();
		
		WebElement location = driver.findElement(By.id("location"));
		
		Select s = new Select(location);
		
		s.selectByIndex(3);
		
		WebElement hotels  = driver.findElement(By.id("hotels"));
		
		Select s1 = new Select(hotels);
		
		s1.selectByVisibleText("Hotel Hervey");
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		
		Select s2 = new Select(roomType);
		
		s2.selectByValue("Deluxe");
		
		driver.quit();
	}

}

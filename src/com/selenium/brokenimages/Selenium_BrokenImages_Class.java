package com.selenium.brokenimages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_BrokenImages_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/broken");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement brokenImage = driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']//child::div[2]/img[2]"));
		
		//"naturalWidth"=0;
		
		if (brokenImage.getAttribute("naturalWidth").equals("0")) {
			
			System.out.println("It's Broken Image");
			
			
		} else {

			System.out.println("It's not Broken Image");
			
		}	
		
		driver.quit();
		
	}

}

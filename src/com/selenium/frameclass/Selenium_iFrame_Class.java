package com.selenium.frameclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_iFrame_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		int size = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(size);
		
		Thread.sleep(4000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(4000);
		
		WebElement frame1 = driver.findElement(By.id("Click"));
		
		frame1.click();
		
		Thread.sleep(4000);
		
		String text = frame1.getText();
		
		System.out.println(text);
		
		driver.close();
	
		
	}

}

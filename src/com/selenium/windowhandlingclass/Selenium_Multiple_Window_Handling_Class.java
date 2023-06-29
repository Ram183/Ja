package com.selenium.windowhandlingclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Multiple_Window_Handling_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement clickingButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']/span"));
		
		clickingButton.click();
		
		Thread.sleep(4000);
				
		String windowHandle = driver.getWindowHandle();
		
		System.out.println("Parent Window ID: " + windowHandle );
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println("Child Winod Id: " + windowHandles );
		
		Thread.sleep(4000);
		
		int count = 0;
		
		for (String x : windowHandles) {
			
				count++;
			
			if (count==2) {
				
				driver.switchTo().window(x);	
				
			} 
			
		}
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("menuform:m_radio")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().window(windowHandle);
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}

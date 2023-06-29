package com.selenium.windowhandlingclass;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Multiple_Window_Handling_Class3 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement clickingButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']/span[2]"));
		
		clickingButton.click();
		
		Thread.sleep(4000);
				
		String parentWindow = driver.getWindowHandle();
		
		System.out.println(parentWindow);
		
		Set<String> childWindows = driver.getWindowHandles();
		
		System.out.println(childWindows);
		
		int count = 0;
		
		for (String x : childWindows) {
			
				count++;
			
			if (count==4) {
				
				driver.switchTo().window(x);
				
			}
		}
			
			Thread.sleep(4000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(4000);
			
			System.out.println(driver.getWindowHandle());
			
			Thread.sleep(4000);
			
			List<String> li = new LinkedList<String>();
			
			li.addAll(childWindows);
			
			driver.switchTo().window(li.get(1));
			
			Thread.sleep(4000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(4000);
			
			driver.switchTo().window(parentWindow);
			
			Thread.sleep(4000);
			
			driver.close();
			
			Thread.sleep(4000);
			
			driver.quit();
			
	}

}

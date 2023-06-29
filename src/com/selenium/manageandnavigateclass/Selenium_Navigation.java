package com.selenium.manageandnavigateclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Navigation {

	public static void main(String[] args) throws InterruptedException {
		
/*      Navigation (Interface) Contains 4 Methods
		
		navigate().to()
		navigate().refresh()
		navigate().forward()
		navigate().back()                 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.navigate().to("https://leafground.com/button.xhtml");
		
		driver.manage().window().maximize();

		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}

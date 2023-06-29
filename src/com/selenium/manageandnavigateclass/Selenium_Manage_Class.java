package com.selenium.manageandnavigateclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Manage_Class {

	public static void main(String[] args) {
		
/*		Options Interface contains Method like
		
		manage()              */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.quit();
	}

}

package com.selenium.manageandnavigateclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Manage_Navigate_Classes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/button.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//	String pageSource = driver.getPageSource();
//	
//	System.out.println(pageSource);

		driver.manage().deleteAllCookies();

		Thread.sleep(4000);

		driver.navigate().to("https://adactinhotelapp.com/");

		Thread.sleep(4000);

		driver.navigate().back();

		Thread.sleep(4000);

		driver.navigate().forward();

		Thread.sleep(4000);

		driver.navigate().refresh();

		driver.quit();

	}
}
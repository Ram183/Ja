package com.selenium.javascriptexecutor.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor_ScrollDown_Bottom_Of_The_Page {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Scrolldown the page using JavaScriptExecutor

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("ramammu18");

		driver.findElement(By.id("password")).sendKeys("ram@123a");

		driver.findElement(By.id("login")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(4000);

		// To scroll down the webpage by Bottom Of The Page.
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		driver.quit();

	}

}

package com.selenium.javascriptexecutor.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Clicking_Button {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

//		Click a button to login using JavaScriptExecutor.

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("ramammu18");

		driver.findElement(By.id("password")).sendKeys("ram@123a");

		WebElement loginButton = driver.findElement(By.id("login"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Clicking the login Button using JavascriptExecutor

		js.executeScript("arguments[0].click();", loginButton);

		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		driver.quit();

	}

}

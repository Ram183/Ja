package com.selenium.javascriptexecutor.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Clicking_Sendkey_Values {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

//		Entire the value to username, password and clicking using JavaScriptExecutor.

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Enter the value using JavascriptExecutor

//		driver.findElement(By.id("username")).sendKeys("ramammu18");
		
		WebElement userName = driver.findElement(By.id("username"));
		
		js.executeScript("arguments[0].setAttribute('value', 'ramammu18');", userName );

//		driver.findElement(By.id("password")).sendKeys("ram@123a");
		
		WebElement password = driver.findElement(By.id("password"));
		
		js.executeScript("arguments[0].setAttribute('value','ram@123a');", password);

		WebElement loginButton = driver.findElement(By.id("login"));

		// Clicking the login Button using JavascriptExecutor

		js.executeScript("arguments[0].click();", loginButton);

		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		driver.quit();

	}

}

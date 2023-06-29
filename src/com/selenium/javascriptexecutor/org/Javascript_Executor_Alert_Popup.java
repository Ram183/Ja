package com.selenium.javascriptexecutor.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor_Alert_Popup {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//Generate Alert window using JavaScriptExecutor

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("ramammu18");

		driver.findElement(By.id("password")).sendKeys("ram@123a");

		driver.findElement(By.id("login")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Alert window using JavascriptExecutor

//		js.executeScript("alert('Valid User and Welcome to Adactin Hotel')");
		
		js.executeScript("alert('Hey Its me Ram!  I using this Alert popup for Testing Purpose')");
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}

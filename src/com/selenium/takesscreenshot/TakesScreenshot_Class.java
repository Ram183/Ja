package com.selenium.takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshot_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement userName = driver.findElement(By.id("username"));

		js.executeScript("arguments[0].setAttribute('value', 'ramammu18');", userName);

		WebElement password = driver.findElement(By.id("password"));

		js.executeScript("arguments[0].setAttribute('value','ram@123a');", password);

		WebElement loginButton = driver.findElement(By.id("login"));

		js.executeScript("arguments[0].click();", loginButton);

		Thread.sleep(4000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Screenshots\\image.png");

		FileHandler.copy(source, destination);

		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		driver.quit();

	}

}

package com.selenium.actionclass;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class_DoubleClick_ContextClick {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {

		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement username = driver.findElement(By.id("username"));
		
		WebElement password = driver.findElement(By.id("password"));
	
		WebElement loginButton = driver.findElement(By.id("login"));
		
		Actions ac = new Actions(driver);
		
		ac.doubleClick(username).perform();
		
		ac.sendKeys("ramammu18").build().perform();
		
		ac.click(password).build().perform();
		
		ac.sendKeys("ram@123a").build().perform();
		
		ac.click(loginButton).build().perform();
		
		WebElement logOut = driver.findElement(By.xpath("//a[text()='Logout']"));
		
		Thread.sleep(4000);
		
		ac.contextClick(logOut).build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}

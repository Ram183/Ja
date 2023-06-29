package com.demopractiseclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Practise_Frame_Class {

	public static WebDriver driver;

	public static WebDriverWait w;

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://leafground.com/dashboard.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		w = new WebDriverWait(driver, 60);

		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		
		driver.findElement(By.id("menuform:m_frame")).click();
		
		driver.switchTo().frame(0);
		
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/button[text()='Click Me']")));

		driver.findElement(By.xpath("/html/body/button[text()='Click Me']")).click();
		
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Hurray! You Clicked Me.']")));
		
		String text = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
		
		System.out.println(text);
		
//		driver.switchTo().frame(0);

		List<WebElement> countFrame = driver.findElements(By.xpath("//button[text()='Count Frames']"));
			
			int size = countFrame.size();
			
			System.out.println(size);

		driver.quit();

	}

}

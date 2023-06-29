package com.selenium.waitclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Explicit_Wait_Class {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/waits.xhtml");

		driver.manage().window().maximize();

		WebDriverWait w = new WebDriverWait(driver, 15);
		
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='j_idt87:j_idt89']/span")));

		WebElement waitForVisibility = driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']/span"));

		waitForVisibility.click();
		

	}

}

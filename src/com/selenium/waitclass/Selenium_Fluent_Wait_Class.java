package com.selenium.waitclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Fluent_Wait_Class {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/waits.xhtml");

		driver.manage().window().maximize();

		Wait w = new FluentWait(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.MILLISECONDS).ignoring(Exception.class);

		WebElement waitForVisibility = driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']/span"));

		waitForVisibility.click();
		

	}

}

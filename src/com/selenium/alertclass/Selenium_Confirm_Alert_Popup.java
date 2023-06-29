package com.selenium.alertclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Confirm_Alert_Popup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://leafground.com/alert.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement alertConfirm = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']//span[2]"));

		alertConfirm.click();

		Thread.sleep(4000);

		driver.switchTo().alert().accept();

		Thread.sleep(4000);

		alertConfirm.click();

		Thread.sleep(4000);

		driver.switchTo().alert().dismiss();

		Thread.sleep(4000);

		driver.quit();

	}

}

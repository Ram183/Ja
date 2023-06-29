package com.selenium.radiobuttonclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_RadioButton_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://leafground.com/radio.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[text()='Safari'][@for='j_idt87:console1:2']")).click();
		
		driver.findElement(By.xpath("//*[text()='Bengaluru']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[text()='Bengaluru']")).click();
			
		List<WebElement> deflectRadioButton = driver.findElements(By.xpath("//div[@class='grid formgrid']/child::div/table[@id='j_idt87:console2']"));
		
		int size = deflectRadioButton.size();
		
		System.out.println(size);
		
		for (WebElement x : deflectRadioButton) {
			
			if (x.isSelected()) {
				
				System.out.println("Value is Selected: " + x.getText() );
				
			}
			
		}
		
		driver.quit();
	}
}
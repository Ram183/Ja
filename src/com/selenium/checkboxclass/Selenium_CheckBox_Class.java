package com.selenium.checkboxclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_CheckBox_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://leafground.com/checkbox.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@class='ui-chkbox-label'][text()='Basic']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@class='ui-chkbox-label'][text()='Ajax']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		Thread.sleep(4000);
		
		WebElement checkDisableOrNot = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		
		System.out.println("CheckBox is Disabled: "  + checkDisableOrNot.isEnabled());
		
		List<WebElement> favLang = driver.findElements(By.xpath("//*[@id='j_idt87']/div/div[1]/div[3]/div/div"));
		
		int size = favLang.size();
		
		System.out.println(size);
		
		for (WebElement x : favLang) {
			
			x.click();
		}
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}

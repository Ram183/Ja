package com.selenium.textbox;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_TextBox_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://leafground.com/input.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement name = driver.findElement(By.id("j_idt88:name"));
		
		name.sendKeys("Ram A");
		
		System.out.println(name.getAttribute("value"));
		
		Thread.sleep(4000);
		
		WebElement appendName = driver.findElement(By.id("j_idt88:j_idt91"));
		
		appendName.sendKeys(", " + "Tamil Nadu");
		
		System.out.println(name.getAttribute("value"));
		
		WebElement verifyDisable = driver.findElement(By.id("j_idt88:j_idt93"));
		
		boolean enabled = verifyDisable.isEnabled();
		
		System.out.println("TextBox Field is Diabled: " + enabled);
		
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		
		Thread.sleep(4000);
		
		WebElement retrValue = driver.findElement(By.id("j_idt88:j_idt97"));
		
		System.out.println(retrValue.getAttribute("value"));
		
		Thread.sleep(4000);
		
		WebElement pressEnter = driver.findElement(By.id("j_idt106:thisform:age"));
		
		pressEnter.click();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);
		
		WebElement errorMessgae = driver.findElement(By.xpath("//div[@id='j_idt106:thisform:j_idt110']"));
		
		System.out.println(errorMessgae.getText());
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}

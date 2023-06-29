package com.selenium.fileuploadclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_FileUpload_Class {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://leafground.com/file.xhtml");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt89']")).click();
		
		Thread.sleep(4000);
		
		String path = "C:\\Users\\ramku\\Downloads\\TestLeaf Logo.png";
		
		StringSelection selection = new StringSelection(path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}

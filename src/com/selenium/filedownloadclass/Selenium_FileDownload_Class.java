package com.selenium.filedownloadclass;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_FileDownload_Class {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://leafground.com/file.xhtml");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[text()='Download']")).click();
		
		Thread.sleep(4000);
		
		File fileDownloadLocation = new File("C:\\Users\\ramku\\Downloads");
		
		File[] listOfFile = fileDownloadLocation.listFiles();
		
		Thread.sleep(4000);
		
		for (File files : listOfFile) {
			
		if (files.getName().equals("TestLeaf Logo.png")) {
			
			System.out.println("File present in the webpage");
			break;
			
		} else {
			
			System.out.println("File not present in the webpage");
			break;
		}
			
		}
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}

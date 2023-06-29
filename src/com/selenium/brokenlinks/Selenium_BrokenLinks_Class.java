package com.selenium.brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_BrokenLinks_Class {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://leafground.com/link.xhtml");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		List<WebElement> brokenLink = driver.findElements(By.xpath("//div[@class='grid ui-fluid']//div/a"));
		
		int size = brokenLink.size();
		
		System.out.println(size);
		
		for (WebElement x : brokenLink) {
			
		String attribute = x.getAttribute("href");
		
		System.out.println(attribute);
		
		URL	url = new URL(attribute);
		
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		
		int responseCode = con.getResponseCode();
		
		if (responseCode==200) {
			
			System.out.println(responseCode);
			System.out.println("Link is not Broken");
			
			
		}else {
			System.out.println("Link is broken");
			System.out.println(con.getResponseMessage());
			
		}
		
		}
		
		driver.quit();
	}

}

package com.selenium.brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_LinksAndBrokenLinks_Class {
	
	public static WebDriver driver;
	
	public static URL url;
	
	public static HttpURLConnection con;
	
	public static int responseCode;
	
	public static String responseMessage;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://demoqa.com/broken");
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement brokenLink = driver.findElement(By.partialLinkText("Broken Link"));
		
		String attribute = brokenLink.getAttribute("href");
		
		System.out.println(attribute);
		
		brokenLink.click();
		
		url = new URL(attribute);
		
		con=(HttpURLConnection)url.openConnection();
		
		responseCode = con.getResponseCode();
		
		System.out.println(responseCode);
		
		responseMessage = con.getResponseMessage();
		
		System.out.println(responseMessage);
		
		driver.quit();
	}

}

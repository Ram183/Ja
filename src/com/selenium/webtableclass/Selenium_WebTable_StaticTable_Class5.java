package com.selenium.webtableclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_WebTable_StaticTable_Class5 {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://leafground.com/table.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement table = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']"));
		
//		System.out.println(table.getText());

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 0; i < rows.size(); i++) {

			WebElement row = rows.get(i);
			
			System.out.println(row.getText());
			
	  }
	}
	
}

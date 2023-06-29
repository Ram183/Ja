package com.selenium.xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Xpath_Class_ {

	public static void main(String[] args) {

		/*
		 * Identification Strategies: Locating with respect to Elements and Attributes
		 * 
		 * 1. Locating Elements with known Attribute
		 * 
		 * Syntax: //*[@attibuteName="Value"];
		 * 
		 * 2. Locating Elements with known Element and Attributes
		 * 
		 * Syntax: //Element[@attibuteName="Value"];
		 * 
		 * 3. Locating Elements with known visible Text (exact Match)
		 * 
		 * Syntax: //Element[text()='Value'];
		 * 
		 * 4. Locating Elements with when part of the visible text is known (partial
		 * match)
		 * 
		 * Syntax: //Element[contains(text(),'Value')];
		 * 
		 * 5. Locating Elements with Multiple Attributes
		 * 
		 * Syntax:
		 * //Element[@attibuteName1="Value"][@attibuteName2="Value"][@attibuteName3=
		 * "Value"];
		 * 
		 * 6. Locating Elements when Starting visible text is known
		 * 
		 * Syntax: //Element[starts-with(text(),'Value')];
		 * 
		 * 7. Locating Elements with Dynamic Attribute Value
		 * 
		 * Syntax: //Element[contains(text(),'Value')];
		 * 
		 * (OR)
		 * 
		 * Syntax: //Element[starts-with(text(),'Value')];
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/index.php");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("ramammu18");

		driver.findElement(By.id("password")).sendKeys("ram@123a");

		driver.findElement(By.id("login")).click();

//		1. Locating Elements with known Attribute 
//		
//		Syntax: //*[@attibuteName="Value"];

		String attribute = driver.findElement(By.xpath("//*[@id='username_show']")).getAttribute("value");

		System.out.println(attribute);

//		2. Locating Elements with known Element and Attributes
//		
//		Syntax: //Element[@attibuteName="Value"];

		WebElement locationDropDown = driver.findElement(By.xpath("//select[@id='location']"));

		Select s = new Select(locationDropDown);

		s.selectByIndex(5);

		String attribute2 = locationDropDown.getAttribute("value");

		System.out.println(attribute2);

//		3. Locating Elements with known visible Text (exact Match)
//		
//		Syntax: //Element[text()='Value'];

		WebElement welcomeNote = driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']"));

		String text = welcomeNote.getText();

		System.out.println(text);

//		4. Locating Elements with when part of the visible text is known (partial match)
//		
//		Syntax: //Element[contains(text(),'Value')];

		WebElement textValue1 = driver.findElement(By.xpath("//a[contains(text(),'adactin')]"));

		System.out.println(textValue1.getText());

//		5. Locating Elements with Multiple Attributes
//		
//		Syntax: //Element[@attibuteName1="Value"][@attibuteName2="Value"][@attibuteName3="Value"];

		driver.findElement(By.xpath("//input[@class='reg_button'][@name='Submit'][@id='Submit']")).click();

		driver.navigate().back();

//		6. Locating Elements when Starting visible text is known
//		
//		Syntax: //Element[starts-with(text(),'Value')];

		WebElement hotels = driver.findElement(By.xpath("//*[starts-with(text(),'Access')]"));

		System.out.println(hotels.getText());

//	7. Locating Elements with Dynamic Attribute Value   
//	
//        Syntax: //Element[contains(text(),'Value')];
//        
//                         (OR)
//        
//	     Syntax: //Element[starts-with(text(),'Value')];     

		WebElement os = driver.findElement(By.xpath("//*[starts-with(text(),'Access')]"));

		System.out.println(os.getText());

//							(OR)

		WebElement os1 = driver.findElement(By.xpath("//*[contains(text(),'Access')]"));

		System.out.println(os1.getText());

		driver.quit();

	}

}

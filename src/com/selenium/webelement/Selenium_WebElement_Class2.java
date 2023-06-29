package com.selenium.webelement;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium_WebElement_Class2 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
/*		WebElement (Interface) contains Methods are
		
		1.  sendKeys()                                      	
		2.  clear()                   							
		3.  click()                                    			
		4.  findElement()									 	
		5.  findElements()										
		6.	getCssValue()
		7.  getText()
		8.  getAttribute()
		9.  getTagName()
		10. getLocation()
		11. getSize()
		12. isDisplayed()
		13. isSelected()
		14. isEnabled()
		15. submit()                                    */
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		driver.findElement(By.id("j_idt88:j_idt94")).submit();
		
		WebElement button1 = driver.findElement(By.id("j_idt88:j_idt92"));
		
		if (button1.isEnabled()) {
			
			System.out.println("Button is Enabled");
			
		}else {
			
			System.out.println("Button is Not Enabled");
		}
		
		WebElement button2 = driver.findElement(By.id("j_idt88:j_idt90"));
		
		if (button2.isDisplayed()) {
			
			System.out.println("Button is Displayed");
			
		} else {
			
			System.out.println("Button is Not Displayed");

		}
		
		WebElement button3 = driver.findElement(By.id("j_idt88:j_idt100"));
		
		String cssValue = button3.getCssValue("background-color");
		
		System.out.println(cssValue);
		
		//rgb(104, 159, 56); #689F38; #d56cae;
		
		WebElement button4 = driver.findElement(By.id("j_idt88:j_idt98"));
		
		Dimension size = button4.getSize();
		
		System.out.println("Size of Button: " + size);
		
		int height = size.getHeight();
		
		System.out.println("Height of Button: " + height);
		
		int width = size.getWidth();
		
		System.out.println("Width of Button: " + width);
		
		WebElement button5 = driver.findElement(By.id("j_idt88:j_idt96"));
		
		Point location = button5.getLocation();
		
		System.out.println("Location of the button: " + location);
		
		int x = location.getX();
		
		System.out.println("X axis of button: " + x);
		
		int y = location.getY();
		
		System.out.println("y axis of button: " + y);
		
		List<WebElement> getNumberOfCount = driver.findElements(By.xpath("//*[@id=\"j_idt88\"]/div/div[2]/div[4]"));
		
		int getCountValue = getNumberOfCount.size();
		
		System.out.println("Count of Button: " + getCountValue);
		
		WebElement tagImageName = driver.findElement(By.id("j_idt88:j_idt102:imageBtn"));
		
		String tagName = tagImageName.getTagName();
		
		System.out.println(tagName);
		
		driver.quit();
	}

}

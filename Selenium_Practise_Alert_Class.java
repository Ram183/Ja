package com.demopractiseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Practise_Alert_Class {

	public static WebDriver driver;

	public static WebDriverWait w;

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramku\\eclipse-workspace\\Selenium_Practise_Class\\Browser\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://leafground.com/dashboard.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();

		driver.findElement(By.id("menuform:m_overlay")).click();

		driver.findElement(By.id("j_idt88:j_idt91")).click();

		w = new WebDriverWait(driver, 60);

		w.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();

		w.until(ExpectedConditions.elementToBeClickable(By.id("simple_result")));

		WebElement simpleAlertMessage = driver.findElement(By.id("simple_result"));

		String text = simpleAlertMessage.getText();

		System.out.println(text);

		driver.findElement(By.id("j_idt88:j_idt93")).click();

		w.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();

		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='result']")));

		WebElement confirmAlertMessage = driver.findElement(By.xpath("//span[@id='result']"));

		String text2 = confirmAlertMessage.getText();

		System.out.println(text2);

		driver.navigate().refresh();

		driver.findElement(By.id("j_idt88:j_idt93")).click();

		w.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().dismiss();

		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='result']")));

		WebElement confirmAlertMessage1 = driver.findElement(By.xpath("//span[@id='result']"));

		String text3 = confirmAlertMessage1.getText();

		System.out.println(text3);

		driver.findElement(By.id("j_idt88:j_idt104")).click();

		w.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().sendKeys("Hi Ram! Here is the Alert Box");

		driver.switchTo().alert().accept();

		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='confirm_result']")));

		WebElement promtAlertMessage = driver.findElement(By.xpath("//span[@id='confirm_result']"));

		String text4 = promtAlertMessage.getText();

		System.out.println(text4);

		driver.navigate().refresh();

		driver.findElement(By.id("j_idt88:j_idt104")).click();

		w.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().sendKeys("Hi Ram! Here is the Alert Box");

		driver.switchTo().alert().dismiss();

		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='confirm_result']")));

		WebElement promtAlertMessage1 = driver.findElement(By.xpath("//span[@id='confirm_result']"));

		String text5 = promtAlertMessage1.getText();

		System.out.println(text5);

		driver.quit();

	}

}

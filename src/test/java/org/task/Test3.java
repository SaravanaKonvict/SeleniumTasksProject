package org.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) throws AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
driver.get("https://netbanking.hdfcbank.com/netbanking/");

//WebElement login = driver.findElement(By.name("login_page"));
//driver.switchTo().frame(login);

List<WebElement> findElements = driver.findElements(By.tagName("frame"));
System.out.println(findElements.size());

//WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
//
//user.sendKeys("saravana");


//WebElement cus = driver.findElement(By.name("cusid"));
//cus.sendKeys("59320");
//
//WebElement submit = driver.findElement(By.name("submit"));
//submit.click();
//
//Alert a = driver.switchTo().alert();
//String text = a.getText();
//System.out.println(text);
//a.accept();
//
////		Actions a = new Actions(driver);
////		WebElement games = driver.findElement(By.xpath("//a[@title='Check out Facebook games.']"));
////a.moveToElement(games).perform();
////a.keyDown(Keys.CONTROL).perform();
////Robot r = new Robot();
////r.keyPress(KeyEvent.VK_A);
////games.click();
////r.keyRelease(KeyEvent.VK_CONTROL);
////a.keyUp(Keys.CONTROL).perform();
//		
//		
//		//		
////		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
////WebElement loc = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
////
////a.dragAndDrop(bank, loc).perform();
////		
//		//		a.moveToElement(courses).perform();
////		
//		
////	String title = driver.getTitle();
////	System.out.println(title);
////	String currentUrl = driver.getCurrentUrl();
////	System.out.println(currentUrl);
////	WebElement user = driver.findElement(By.id("email"));
////	user.sendKeys("saravana");
////	String attribute = user.getAttribute("value");
////	System.out.println(attribute);
////	WebElement fblogo = driver.findElement(By.xpath("//h2[@class='_8eso']"));
////	String text = fblogo.getText();
////	System.out.println(text);
////	WebElement pswd = driver.findElement(By.id("pass"));
////	pswd.sendKeys("saravana");
////	WebElement login = driver.findElement(By.name("login"));
////	login.click();
////	
//	
////WebDriverManager.firefoxdriver().setup();
////WebDriver driver1 = new FirefoxDriver();
////driver1.get("https://www.facebook.com/");
////
////WebDriverManager.iedriver().setup();
////WebDriver driver2 = new InternetExplorerDriver();
////driver2.get("https://www.facebook.com/");


	}

}

package org.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTask {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/index.en-gb.html?label=gen173nr-1BCAEoggI46AdIM1gEaGyIAQGYAQm4AQjIAQzYAQHoAQGIAgGoAgO4AqPc350GwAIB0gIkOTkyZjA0NGMtMjc2My00MGU1LTg3MzQtZjk4Zjc3NTZjY2Nj2AIF4AIB&sid=3da846850f914b91b32710529e62d031&keep_landing=1&sb_price_type=total&");
	
		WebElement signin = driver.findElement(By.xpath("(//span[@class='bui-button__text'])[5]"));
	signin.click();
	
	
	
	}

}

package org.temp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDecember {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.flipkart.com/");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("start-maximized");
		driver=new ChromeDriver(c);

	}

}
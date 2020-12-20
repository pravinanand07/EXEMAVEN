package org.temp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndMan {

	static WebDriver driver;
	
	public static void base() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
	public static void Login(String username, String password) {
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	public static void main(String[] args) throws IOException {
		
		base();
		File f = new File(".\\sample\\man.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet sheet = w.getSheet("sheet1");
		int r = sheet.getLastRowNum();
		for (int i = 1; i <= r; i++) {
			System.out.println("Username :" + sheet.getRow(i).getCell(0).getStringCellValue());
			System.out.println("Password :" + sheet.getRow(i).getCell(1).getStringCellValue());
			String username=sheet.getRow(i).getCell(0).getStringCellValue();
			String password=sheet.getRow(i).getCell(1).getStringCellValue();
			Login(username, password);
		}
	}
}

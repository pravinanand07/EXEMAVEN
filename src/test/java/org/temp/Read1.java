package org.temp;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read1 {
	
	static WebDriver driver;
	
	public static void base() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		
	}
	
	public static void adactin(String user,String pass ) {
		
		driver.get("https://www.adactinhotelapp.com//");
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
	}

	public static void main(String[] args) throws Exception {
		
		base();
		FileInputStream f2 = new FileInputStream("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\read2.xlsx");
        Workbook w = new XSSFWorkbook(f2);
        Sheet sheet = w.getSheet("sheet1");
        for (int i = 1; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String scv1 = cell.getStringCellValue();
			System.out.println("UserName : " +scv1);
			Cell cell2 = row.getCell(1);
			String scv2 = cell2.getStringCellValue();
			System.out.println("Password : " +scv2);
			String user=scv1;
			String pass = scv2;
			adactin(user,pass);
				
			}
        }
	}

package org.temp;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTask {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.name("q")).sendKeys("redmi mobiles" + Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		File f = new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\ExcelWrite.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet cs = w.createSheet("sheet1");
		for (int i = 0; i <ele.size(); i++) {
			WebElement ele1 = ele.get(i);
			String text = ele1.getText();
			Row row = cs.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
		}
		FileOutputStream f1 = new FileOutputStream(f);
		w.write(f1);
	}

}

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

public class FlipkartTask1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.name("q")).sendKeys("redmi mobiles" + Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		File fl = new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\Exe1.xlsx");
		Workbook w1 = new XSSFWorkbook();
		Sheet cr = w1.createSheet("sheet2");
		for (int i = 0; i < ele.size(); i++) {
			WebElement el = ele.get(i);
			String text = el.getText();
			Row row = cr.createRow(i);
			Cell Cell = row.createCell(0);
			Cell.setCellValue(text);
		}
		FileOutputStream f2 = new FileOutputStream(fl);
		w1.write(f2);
	}

}

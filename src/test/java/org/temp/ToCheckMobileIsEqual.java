package org.temp;

import java.io.File;
import java.io.FileInputStream;
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

public class ToCheckMobileIsEqual {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.name("q")).sendKeys("redmi mobiles" + Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		File f = new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\ExcelWrite1.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet cs = w.createSheet("sheet1");
		for (int i = 0; i <ele.size(); i++) {
			WebElement ele1 = ele.get(i);
			String text = ele1.getText();
			Row row = cs.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
		}
		WebElement ele2 = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[3]"));
		String text2 = ele2.getText();
		System.out.println(text2);
		FileOutputStream f1 = new FileOutputStream(f);
		w.write(f1);
		File f3 = new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\ExcelWrite1.xlsx");
		FileInputStream f4 = new FileInputStream(f3);
		Workbook w1 = new XSSFWorkbook(f4);
		Sheet sh = w1.getSheet("Sheet1");
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row row1 = sh.getRow(i);
			for (int j = 0; j <row1.getPhysicalNumberOfCells(); j++) {
				Cell cell1 = row1.getCell(j);
				int ct = cell1.getCellType();
				if (ct==1) {
					String stc = cell1.getStringCellValue();
					if (stc.valueOf(2).equals(text2.valueOf(2))) {
						System.out.println("true");
					}else {
						System.out.println("false");
					}
				} 
				
			}
		}
		
	}

}

package org.temp;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ERead {

	public static void main(String[] args) throws IOException {
		String name = null;
		FileInputStream f = new FileInputStream(".//target//Book1.xlsx");
		Workbook w = new XSSFWorkbook(f);
		Sheet sheet = w.getSheet("sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int ct = cell.getCellType();
				if (ct==1) {
					name = cell.getStringCellValue();
					System.out.println(name);
				}
				else {
					double ncv = cell.getNumericCellValue();
					long l = (long)ncv;
					String value = String.valueOf(l);
					System.out.println(value);
				} 
			}
		}
		

	}

}

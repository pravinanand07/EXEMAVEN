package org.temp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example {

	public static void main(String[] args) throws IOException  {
		File f = new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\Inter.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet sheet = w.getSheet("sheet1");
		Cell cell = sheet.getRow(0).getCell(0);
		int cellType = cell.getCellType();
		if (cellType==1) {
			String scv = cell.getStringCellValue();
			System.out.println(scv);
		} else {
			double ncv = cell.getNumericCellValue();
			long lg = (long)ncv;
			String valueOf = String.valueOf(lg);
			System.out.println(valueOf);
		}
	}
}

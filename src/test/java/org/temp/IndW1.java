package org.temp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IndW1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\sample\\IndW.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w =new XSSFWorkbook(f1);
		Sheet sheet = w.getSheet("sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		int ct = cell.getCellType();
				if (ct==1) {
					String sc = cell.getStringCellValue();
					System.out.println(sc);
					if (sc.equals("Praveen")) {
						cell.setCellValue("Kumar");
						FileOutputStream f2 = new FileOutputStream(f);
						w.write(f2);
					}
				}
	}
}

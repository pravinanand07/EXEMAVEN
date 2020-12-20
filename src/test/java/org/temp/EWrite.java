package org.temp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EWrite {

	public static void main(String[] args) throws IOException {
		File f = new File(".//target//eWrite.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sh = w.createSheet("sheet1");
		Row row = sh.createRow(0);
		Cell cell = row.createCell(0);
		Cell cell1 = row.createCell(1);
		cell.setCellValue("Praveen");
		cell1.setCellValue("Kumar");
		FileOutputStream f1 = new FileOutputStream(f);
		w.write(f1);
		
	}

}

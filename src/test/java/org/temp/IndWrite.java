package org.temp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IndWrite {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\sample\\IndW.xlsx");
		Workbook w= new XSSFWorkbook();
		Sheet cs = w.createSheet();
		Row cr = cs.createRow(0);
		Cell cc = cr.createCell(0);
		cc.setCellValue("Praveen");
		FileOutputStream f1 = new FileOutputStream(f);
		w.write(f1);
	}
	
}

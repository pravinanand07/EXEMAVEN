package org.temp;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream f1 =new FileInputStream("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\read.xlsx");
		Workbook w1 = new XSSFWorkbook(f1);
		Sheet s1 = w1.getSheet("sheet1");
		int r1 = s1.getLastRowNum();
		for (int i = 1; i <=r1 ; i++) {
			String s2 = s1.getRow(i).getCell(0).getStringCellValue();
			String s3 = s1.getRow(i).getCell(1).getStringCellValue();
			String s4 = s1.getRow(i).getCell(2).getStringCellValue();
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
		}
	}

}

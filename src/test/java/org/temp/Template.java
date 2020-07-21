package org.temp;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Template {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        File l = new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\Book1.xlsx");
        FileInputStream l1= new  FileInputStream(l);
        Workbook w1 = new XSSFWorkbook(l1);
        Sheet s1 = w1.getSheet("sheet1");
        for (int i = 0; i < s1.getPhysicalNumberOfRows(); i++) {
			Row r1 = s1.getRow(i);
			for (int j = 0; j < r1.getPhysicalNumberOfCells(); j++) {
				Cell c1 = r1.getCell(j);
				int ct = c1.getCellType();
				if (ct==1) {
					String val = c1.getStringCellValue();
					System.out.println(val);
				}
				 else {
					double d1 = c1.getNumericCellValue();
					long g1 = (long)d1;
					String val = String.valueOf(g1);
					System.out.println(val);
				}
			}
		}
        
	}

}

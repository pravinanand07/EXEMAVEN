package org.temp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class B3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        File file = new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\Book3.xlsx");
        FileInputStream Is = new FileInputStream(file);
        Workbook wb = new XSSFWorkbook(Is);
        Sheet sheet = wb.getSheet("sheet1");
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row irow = sheet.getRow(i);
			for (int j = 0; j <irow.getPhysicalNumberOfCells(); j++) {
				Cell icell = irow.getCell(j);
				int iclt = icell.getCellType();
				if (iclt==1) {
					String stringCellValue = icell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				else {
					double n = icell.getNumericCellValue();
					long g = (long)n;
					String valueOf = String.valueOf(g);
					System.out.println();
				}
			}
		}
	}

}

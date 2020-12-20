package org.temp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ind {
 
	public static void main(String[] args) {
		
		File f= new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\sample\\Ind.xlsx");
		try {
			FileInputStream f1 = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(f1);
			Sheet st = w.getSheet("sheet1");
			for (int i = 1; i < st.getPhysicalNumberOfRows(); i++) {
				Row row = st.getRow(i);
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
					Cell cell = row.getCell(j);
					int ct = cell.getCellType();
					if (ct==1) {
						String sc = cell.getStringCellValue();
						System.out.println(sc);
					}
					else {
						double nc = cell.getNumericCellValue();
						long l = (long)nc;
						String text = String.valueOf(l);
						System.out.println(text);
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

package org.temp;

import java.io.File;
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

public class B4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        File f1 = new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\Book3.xlsx");
        FileInputStream f2 = new FileInputStream(f1);
        Workbook f3 = new XSSFWorkbook(f2);
        Sheet f4 = f3.getSheet("sheet1");
        for (int i = 0; i <f4.getPhysicalNumberOfRows(); i++) {
			Row f5 = f4.getRow(i);
			for (int j = 0; j <f5.getPhysicalNumberOfCells(); j++) {
				Cell f6 = f5.getCell(j);
				int f7 = f6.getCellType();
				if (f7==1) {
					String f8 = f6.getStringCellValue();
					System.out.println(f8);
				}
				else if (f7==0) {
					if (DateUtil.isCellDateFormatted(f6)) {
						Date f10 = f6.getDateCellValue();
						SimpleDateFormat f9 = new SimpleDateFormat("dd/MM/yyyy");
						String f11 = f9.format(f10);
						System.out.println(f11);
					}
					else {
						double f12 = f6.getNumericCellValue();
						long f13 = (long)f12;
						String f14 = String.valueOf(f13);
						System.out.println(f14);

					}
				}
			}
			
		}
	}

}

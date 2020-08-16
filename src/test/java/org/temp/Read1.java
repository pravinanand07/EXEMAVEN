package org.temp;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream f2 = new FileInputStream("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\read2.xlsx");
        Workbook w = new XSSFWorkbook(f2);
        Sheet sheet = w.getSheet("sheet1");
        for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int ct = cell.getCellType();
				if (ct==1) {
					String cv = cell.getStringCellValue();
					System.out.println(cv);
				}
				else if (ct==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date d = cell.getDateCellValue();
						SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
						String format = sd.format(d);
						System.out.println(format);
					}
					else {
						double ncv = cell.getNumericCellValue();
						long l=(long)ncv;
						String value= String.valueOf(l);
						System.out.println(value);
					}
					
				}
			}
		}
	}

}

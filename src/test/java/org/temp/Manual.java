package org.temp;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Manual {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      File l = new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\EXEMAVEN\\target\\book2.xlsx");
      FileInputStream p = new FileInputStream(l);
      Workbook b = new XSSFWorkbook(p);
      Sheet e = b.getSheet("sheet1");
      for (int i = 0; i < e.getPhysicalNumberOfRows(); i++) {
		Row rowAll = e.getRow(i);
		for (int j = 0; j < rowAll.getPhysicalNumberOfCells(); j++) {
			Cell cellAll = rowAll.getCell(j);
			int clt = cellAll.getCellType();
			if (clt==1) {
				String scv = cellAll.getStringCellValue();
				System.out.println(scv);
			}else {
				double ncv = cellAll.getNumericCellValue();
				long lo = (long)ncv;
				String vo = String.valueOf(lo);
				System.out.println(vo);
			}
			
		}
	}
		
	}
}

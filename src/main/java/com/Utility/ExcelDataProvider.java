package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider extends BaseClass {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider() throws Exception {
		
		String path = "F:\\Software testing\\Automation testing\\Day 3\\program\\Laksh_Framework\\TestData\\Data.xlsx";
		FileInputStream file = new FileInputStream(path);
		 wb = new XSSFWorkbook(file);
		}

	public String getStringData_Excel(String sheetName, int row, int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
}

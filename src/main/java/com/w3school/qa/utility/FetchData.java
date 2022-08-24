package com.w3school.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchData {

	public static void data1() throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src///test//resources//testData//testcasedata.xlsx");
		// workbook reading
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		// sheet is selected based on name
		Sheet sh = wb.getSheet("Sheet1");
		// to run through rows
		Iterator<Row> rw = sh.iterator();
		// we enterd in 1st row
		Row firstRow = rw.next();
		// to run through cells
		Iterator<Cell> ce = firstRow.cellIterator();
		// print 1st cell in 1st row
		System.out.println(ce.next().toString());// TC

	}

	public static void main(String[] args) throws IOException {
		data4("Sheet3","TC_name","c");
	}



	public static void data4(String sheetsname,String colname,String Value) throws IOException {

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "//src///test//resources//testData//testcasedata.xlsx");
		// workbook reading
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		int sheetno=wb.getNumberOfSheets();
		for(int i=0;i<sheetno;i++) {
			String sheetname=wb.getSheetName(i);
			// we are able to enter sheet 2
			if(sheetname.equalsIgnoreCase(sheetsname)) {
				Sheet sh=wb.getSheetAt(i);
				Iterator<Row> row=sh.iterator();
			Row	firstrow=row.next();
			Iterator<Cell> ce=firstrow.cellIterator();
			int col=0;
			int k=0;
			while(ce.hasNext()) {
				Cell firstcell=ce.next();
				
				if(firstcell.getStringCellValue().equalsIgnoreCase(colname)) {
					col=k;
				}
				k++;
			}
			
			while(row.hasNext()) {
			Row	rw=row.next();
			if(rw.getCell(col).toString().equalsIgnoreCase(Value)) {
				Iterator<Cell> c=rw.cellIterator();
				while(c.hasNext()) {
				System.out.println(c.next().toString());
				}
			}
			}
				
			}
		}
		
	}
	
}
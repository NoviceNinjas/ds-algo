package com.qa.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetHandler {
	
	public static void writeExcelSheet() throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet worksheet = workbook.createSheet("Sheet 1");
		
		int rowNum = 0;
		
		for (int i=1;i<=10; i++) {
			
			Row row = worksheet.createRow(rowNum++);
			int colNum=0;
			
			for(int j=1;j<=10;j++) {
				Cell cell =row.createCell(colNum++);
				cell.setCellValue("Row "+ i + " Column "+j);
			}
		}
		
		String path = System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
		File Excelfile = new File(path);
		FileOutputStream Fos=null;
		
		try {
			 Fos = new FileOutputStream(Excelfile);
			 workbook.write(Fos);
			 workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			Fos.close();
		}
	}
	
	public Map<String,List<String>>  getCodeMap(String moduleName) throws IOException {
		
		String path = "C:/Users/14255/OneDrive/Desktop/School/ds algo/NoviceNinjas/test_input/PythonPrograms.xlsx";//System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
		File Excelfile = new File(path);
		
		FileInputStream Fis = new FileInputStream(Excelfile);
		XSSFWorkbook workbook = new XSSFWorkbook(Fis);
		XSSFSheet sheet = workbook.getSheet(moduleName);
		
		Map<String,List<String>> codeMap=new HashMap<String,List<String>>();
		
		int firstRow = sheet.getFirstRowNum();
		int lastRow = sheet.getLastRowNum();
		for (int index = firstRow + 1; index <= lastRow; index++) {
		    Row row = sheet.getRow(index);
		    List<String> codeList=new ArrayList<String>();
		    for (int cellIndex = row.getFirstCellNum(); cellIndex < row.getLastCellNum(); cellIndex++) {
		        Cell cell = row.getCell(cellIndex, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
		        String cellValue=getCellValue(cell);
		        codeList.add(cellValue);
		    }
		    codeMap.put(String.valueOf(index), codeList);
		}
		
		
		return codeMap;
		
		
	}
	public static String getCellValue(Cell cell) {
	    CellType cellType = cell.getCellType().equals(CellType.FORMULA)
	      ? cell.getCachedFormulaResultType() : cell.getCellType();
	    String cellVal = new String();
	    if (cellType.equals(CellType.STRING)) {
	       // System.out.print(cell.getStringCellValue() + " | ");
	        cellVal=String.valueOf(cell.getStringCellValue());
	    }
	    if (cellType.equals(CellType.NUMERIC)) {
	        if (DateUtil.isCellDateFormatted(cell)) {
	          //  System.out.print(cell.getDateCellValue() + " | ");
	            cellVal=String.valueOf(cell.getDateCellValue());
	        } else {
	            //System.out.print(cell.getNumericCellValue() + " | ");
	            cellVal=String.valueOf(cell.getNumericCellValue());
	        }
	    }
	    if (cellType.equals(CellType.BOOLEAN)) {
	       // System.out.print(cell.getBooleanCellValue() + " | ");
	    }
	    return cellVal;
	}
	
	

}

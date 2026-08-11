package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		String filelocation = "./test asdata/Login.data.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(filelocation);
		XSSFSheet sheet =  wbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		for(int i=0; i<2; i++) {
			
		
		XSSFCell cell = row.getCell(i);
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		}
		

	}

}

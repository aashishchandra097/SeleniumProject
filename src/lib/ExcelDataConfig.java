package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	public ExcelDataConfig(String excelPath) throws Exception{
		try {
			File src = new File("E:\\Excel data\\ExcelData.xlsx");
			FileInputStream fis = new FileInputStream(src); //loaded excel sheet in the form of byte
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet1 = wb.getSheetAt(0);
			System.out.println("update");
		} catch (Exception e) {
			System.out.println(e.getMessage());	
		}
	}
	
	

}

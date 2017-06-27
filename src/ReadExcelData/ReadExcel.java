package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String args[]) throws Exception{
		File src = new File("E:\\Excel data\\ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel is: "+data0);
		String data1 = sheet1.getRow(4).getCell(1).getStringCellValue();
		System.out.println("Data from excel is: "+data1);
		
		wb.close(); //close the resource due to memory leakage
		
		//System.out.println("hello");
	}

}

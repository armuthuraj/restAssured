package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public ExcelUtils(String path, String sheetName) {
	
		try {
			workbook = new XSSFWorkbook(path);
			 sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}
	

	
	
	public static void getRowCount() {
		
	
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("rowCount : " +rowCount);
		
	}
	
	
	public static void getCellData(int rNum, int cNum) {
	
			/*String path = System.getProperty("user.dir");
			System.out.println(path);*/
		//String excelPath ="./testData/Book1.xlsx";
		
			
		DataFormatter formatter = new DataFormatter();
		Object value = formatter.formatCellValue(sheet.getRow(rNum).getCell(cNum));
		System.out.println(value);
		
	}
	
	

}

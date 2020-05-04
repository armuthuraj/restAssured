package utils;

public class ExcelUtilsTest {
	public static void main(String[] args) {
		ExcelUtils excel = new ExcelUtils("./testData/Book1.xlsx", "Sheet1");
		excel.getCellData(1,0);
		excel.getCellData(1,1);
		excel.getCellData(1,2);
		excel.getRowCount();
	}

}

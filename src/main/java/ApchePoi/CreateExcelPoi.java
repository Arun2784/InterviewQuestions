package ApchePoi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelPoi {

	public static void main(String[] args) throws Exception {
//		HSSFWorkbook workbook = new HSSFWorkbook();
//		HSSFSheet sheet = workbook.createSheet();
//		sheet.createRow(0);
//		sheet.getRow(0).createCell(0).setCellValue("Hello");
//		sheet.getRow(0).createCell(1).setCellValue("World");
//		sheet.createRow(1);
//		sheet.getRow(1).createCell(0).setCellValue("Automation");
//		sheet.getRow(1).createCell(1).setCellValue("Learning");
//		
//		sheet.createRow(2);
//		sheet.getRow(2).createCell(0).setCellValue("test");
//		sheet.getRow(2).createCell(1).setCellValue("test2");
//		File file = new File("C:\\Users\\A9687\\Desktop\\automation\\Automation Pratcice\\Test.xls");
//		workbook.write(file);
//		workbook.close();
		
		
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Testsheet");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("World");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Automation");
		sheet.getRow(1).createCell(1).setCellValue("Learning");
		
		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue("test");
		sheet.getRow(2).createCell(1).setCellValue("test2");
		File file = new File("C:\\Users\\A9687\\Desktop\\automation\\Automation Pratcice\\Test2.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
	}

}

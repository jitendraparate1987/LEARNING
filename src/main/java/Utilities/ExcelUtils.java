package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;


public class ExcelUtils {
	
public static void main(String arg[]) {
	
	String FilePath = "C://Users//JitendraPara_rqdxkn//Downloads//1_FeeImportingFormat_Legal _KERALASCHOOL_updated_for Sijo.xlsx";
	FileInputStream FIS;
	Workbook workbook = null;
	try {
		FIS = new FileInputStream(new File(FilePath));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
	
	try {
		workbook = new XSSFWorkbook(FilePath);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Sheet sheet = workbook.getSheetAt(0);
	
	System.out.println(sheet.getRow(0).getCell(0));
	
	
}	

}

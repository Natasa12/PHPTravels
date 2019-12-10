package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Glavna {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("Username.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String korisnik = sheet.getRow(1).getCell(0).getStringCellValue();
		String lozinka = sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(korisnik);
		
		wb.close();
	}

}

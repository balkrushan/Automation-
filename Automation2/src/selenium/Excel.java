package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class Excel {

	public static String TestDataByExcel(int a ,int b) throws EncryptedDocumentException, IOException
	{
	String path = "C:\\Users\\DELL\\Documents\\kpp\\Book1.xlsx";
	
	FileInputStream file = new FileInputStream(path);
	
	WorkbookFactory.create(file).getSheet("Sheet1").getRow(a).getCell(b).getStringCellValue();
	return path;
	
//	String value = WorkbookFactory.create(file).getSheet("Data").getRow(a).getCell(b).getStringCellValue();
//	return value;
//	public static void main(String[] args) 
//	{
//		String userName = Execelsheet.TestDataByExcel(1,0);
//		System.out.println();
//	}
	}
}

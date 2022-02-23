package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {
	public static  String excel(int a,int b) throws EncryptedDocumentException, IOException {
	String	path  ="C:\\Users\\DELL\\Documents\\kpp\\Book1.xlsx";
		FileInputStream fil = new FileInputStream(path);
		
		String path1=WorkbookFactory.create(fil).getSheet("Sheet1").getRow(a).getCell(b).getStringCellValue();
		return path1; 
		
	}

}

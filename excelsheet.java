package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet {

	public static  String ExcelsheetData ( int a, int b) throws EncryptedDocumentException, IOException {
		   String path="C:\\Users\\DELL\\Documents\\Excelsheet\\Book.xlsx";
		   FileInputStream file =new FileInputStream(path);
		 String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(a).getCell(b).getStringCellValue();
			return value;
			
                        
	}

} 

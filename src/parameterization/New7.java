package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class New7 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new 
				FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\New XLSX Worksheet.xlsx");

		
		 Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		 System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		 System.out.println(sheet.getRow(0).getCell(1).getBooleanCellValue());
		 System.out.println(sheet.getRow(0).getCell(2).getNumericCellValue());
		
	}
	
	
}

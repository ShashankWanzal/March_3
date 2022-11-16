package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class New1 
{

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	

		FileInputStream file=new 
	FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\New XLSX Worksheet.xlsx");

		
		String data = WorkbookFactory.create(file).getSheet("Hi").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
	}
	
	
}

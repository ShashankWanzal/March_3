package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class New2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		FileInputStream file=new 
				FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\New XLSX Worksheet.xlsx");

     double value = WorkbookFactory.create(file).getSheet("Hi").getRow(0).getCell(1).getNumericCellValue();
		
     System.out.println(value);
     
	}
	
	
}

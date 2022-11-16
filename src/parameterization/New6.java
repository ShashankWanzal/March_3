package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class New6 
{

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		FileInputStream file=new 
				FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\New XLSX Worksheet.xlsx");

		
		Cell info = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0);
		
		CellType ct = info.getCellType();
		
		if(ct==CellType.STRING)
		{
			System.out.println(info.getStringCellValue());
		}
		else if(ct==CellType.NUMERIC)
		{
			System.out.println(info.getNumericCellValue());
		}
		else if(ct==CellType.BOOLEAN)
		{
			System.out.println(info.getBooleanCellValue());
		}
		
		
		
		
	}
	
	
	
}

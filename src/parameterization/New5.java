package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class New5 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	
		FileInputStream file=new 
				FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\New XLSX Worksheet.xlsx");

	   
		//cell Data type?
		
		Cell cellinfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0);
		
		CellType ct = cellinfo.getCellType();
		
		if(ct==CellType.STRING)
		{
			
			System.out.println(cellinfo.getStringCellValue());
			System.out.println("get String value");
		}
		else if(ct==CellType.NUMERIC)
		{
			System.out.println(cellinfo.getNumericCellValue());
			System.out.println("get numeric value");
		}
		
		else if(ct==CellType.BOOLEAN)
		{
			System.out.println(cellinfo.getBooleanCellValue());
			System.out.println("get boolean value");
		}
		
		
		
		
	}
	
	
	
}

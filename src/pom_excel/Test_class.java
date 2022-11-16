package pom_excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new 
				FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\New XLSX Worksheet.xlsx");

   Sheet sheet = WorkbookFactory.create(file).getSheet("kite");
		

		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Kite_Loginpage1 login=new Kite_Loginpage1(driver);
		
		login.EnterUN(sheet.getRow(0).getCell(0).getStringCellValue());
		
		login.EnterPass(sheet.getRow(1).getCell(0).getStringCellValue());
		
		login.click();
		
		
		Kite_logine2page login2=new Kite_logine2page(driver);
		
		login2.enterpin(sheet.getRow(2).getCell(0).getStringCellValue());
		login2.clickonbtn();
		
		
		
		Verify_profilename profile_name=new Verify_profilename(driver);
		
		profile_name.Vprofile(sheet.getRow(0).getCell(0).getStringCellValue());
		
		
		
		
		
		
	
		
		
	}
	
	
}

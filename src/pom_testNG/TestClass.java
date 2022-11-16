package pom_testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass
{
	 WebDriver driver;
	 Sheet sheet;
	 Kite_Loginpage1 login;
	 Kite_logine2page pinpage;
	 Verify_profilename profile;
	
	
	@BeforeClass
	public void startbrowser() throws EncryptedDocumentException, IOException
	{
				
		FileInputStream file=new FileInputStream("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\AprilBatch.xlsx");
		
		sheet=WorkbookFactory.create(file).getSheet("Kite");
		
		//chrome 
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("---disable-notifications");

		 driver=new ChromeDriver(options);
		 
		  login=new  Kite_Loginpage1(driver);
		  pinpage=new Kite_logine2page(driver);
		  profile=new Verify_profilename(driver);
		  
		  driver.get("https://kite.zerodha.com/");
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void loginpage() throws InterruptedException
	{
		String UN = sheet.getRow(0).getCell(0).getStringCellValue();
		String Pass =sheet.getRow(0).getCell(1).getStringCellValue();
		String Pin = sheet.getRow(0).getCell(2).getStringCellValue();
		
		login.EnterUN(UN);
		login.EnterPass(Pass);
		login.click();
		
		//Thread.sleep(2000);
		
		pinpage.enterpin(Pin);
		pinpage.clickonbtn();
		
	}
	
	@Test
	public void verify_test()
	{
		String profilename = sheet.getRow(0).getCell(0).getStringCellValue();
		
		profile.Vprofile(profilename);
		
	}
	
	@AfterMethod
	public void refresh()
	{
		
		driver.navigate().refresh();
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		
		//driver.close();
		
	}
	
}

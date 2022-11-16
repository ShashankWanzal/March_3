package pom_testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Property_file
{
	@Test
	public void test() throws IOException
	{
		
		Properties file=new Properties();
		
		FileInputStream path=new FileInputStream("C:\\Users\\shash\\eclipse-workspace\\March_Batch_3\\property_file\\basic.properties");
		
		file.load(path);
		
		String value = file.getProperty("URL");
		
		//System.out.println(value);
		
		Reporter.log(value,true);
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");

		 WebDriver driver=new ChromeDriver();
		 
		 driver.get(value);
		
		
		
	}
	
	
}

package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Kite_login loginpage=new Kite_login(driver);
		
		loginpage.enterUN();
		Thread.sleep(1000);
		
		loginpage.enterPass();
		Thread.sleep(1000);
		loginpage.click();
		
		Kite_logine2page loginpage2=new Kite_logine2page(driver);
		
		loginpage2.enterpin();
		loginpage2.clickonbtn();
		
		Verify_profilename Profile_name_verify=new Verify_profilename(driver);
		
		Profile_name_verify.Vprofile("DF4359");
		
		
		
		
	}
	
	
}

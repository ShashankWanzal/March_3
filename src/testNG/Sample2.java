package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2
{
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	
	}
	
	@BeforeMethod
	public void openwebpage()
	{
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@Test
	public void Testforgotbutton()
	{
		WebElement click = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		boolean result = click.isEnabled();   //false
		
		Assert.assertFalse(result,"Forgotten password? button is not working ");
		
		click.click();
		
	}
	
	@AfterMethod
	public void refreshwebpage()
	{
		driver.navigate().refresh();
	}
	
	@AfterClass
	public void closebrowser()
	{
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
}

package multibrowsertesting;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Sample1 
{
	WebDriver driver;
	
	@Parameters({"browsername"})
	@Test
	public void TC01(String browsername) throws InterruptedException
	{
		
		//WebDriver driver;
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			
		driver=new ChromeDriver();
			
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\shash\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			

			 driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dishaa");
		
		//WebElement text = driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Institute");
		
		WebElement text = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		boolean result = text.isEnabled();
		
		SoftAssert soft =new SoftAssert();
		
		soft.assertTrue(result);
		
		soft.assertAll();
		
		text.sendKeys("institute");
		
		Thread.sleep(2000);
		Reporter.log("working as expected",true);
		driver.close();
		
		
	}
	
	
	
	
	
}

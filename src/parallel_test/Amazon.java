package parallel_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon
{
	@Test
	public void TC01() throws InterruptedException
	{
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
//		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\shash\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		Reporter.log(title,true);
		
		
		Thread.sleep(4000);
		
		driver.close();
		
		
		
		
	}
	
	
}

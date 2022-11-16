package parallel_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Facebook 
{
   
	@Test
	public void TC01() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.Facebook.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		Reporter.log(title,true);
		
		Thread.sleep(5000);
		
		driver.close();
	}
	
	
}

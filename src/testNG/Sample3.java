package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 
{

	
	// annotations 
	//n test cases 
	//to verify scenario
	
	//Scenario=>What to test //diff ways to test that fn  
	//Test case =>how to test //Steps to test that functionality
	
	
	
	//@test annotaion=>to verify particular test case 
	
	
	@Test
	public void verifybtn() throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement btn=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		System.out.println(btn.isEnabled());
		
		Reporter.log("result of test case =>"+btn.isEnabled(),true);
		
		btn.click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
	
	
	
	
}

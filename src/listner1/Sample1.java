package listner1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Sample1 
{
	@Test
	public  void main1()
	{
	
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable--notification");
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\eclipse-workspace\\March_001\\Browser\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://kite.zerodha.com/dashboard");
		
		Assert.fail();
		
		
		
		
	}
}

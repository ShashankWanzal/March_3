package multiple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion 
{

	
	public static void main(String[] args) throws InterruptedException
	{
	
		String exp="oneplus 9 pro";
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("oneplus");
		
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		for(WebElement op:options)
		{
			
			String act=op.getText();
			
			if(act.equals(exp))
			{
				op.click();
				break;
			}
			
			
		}
		
		
		//search for top 10 IT company & select any one 
		
		
		
	}
	
}

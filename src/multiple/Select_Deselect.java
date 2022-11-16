package multiple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Deselect
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("D:\\Dishaa\\batches\\March Batch\\HTML\\swdev\\checkbox.html");
		
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		for(int i=0;i<=checkbox.size()-1;i++)
		{
			checkbox.get(i).click();
			
			Thread.sleep(1000);
			
		}
		
		for(int i=0;i<=checkbox.size()-1;i++)
		{
			checkbox.get(i).click();
			
			Thread.sleep(1000);
			
		}
		
//		for(WebElement box:checkbox)
//		{
//			box.click();
//			Thread.sleep(1000);
//		}
		
		
//		for(int i=checkbox.size()-1;i>=0;i--)
//		{
//			checkbox.get(i).click();
//			
//			Thread.sleep(1000);
//		}
		
		
		
		
		
		
	}
	
	
}

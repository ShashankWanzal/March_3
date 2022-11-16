package multiple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reverse_click_checkbox
{

	
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("D:\\Dishaa\\batches\\March Batch\\HTML\\swdev\\checkbox.html");
		
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=checkbox.size()-1;i>=0;i--)   //5-1=4-1=3-1=2-1=1-1=0
		{
			checkbox.get(i).click();    //get(0).click
			Thread.sleep(1000);
		}
		
		
		
		
	}
	
	
	
	
}

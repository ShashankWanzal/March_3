package multiple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("D:\\Dishaa\\batches\\March Batch\\HTML\\swdev\\checkbox.html");
		
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int count = checkbox.size();
		
		System.out.println(count);
		
		checkbox.get(1).click();
		
//		for(WebElement box:checkbox)
//		{
//			box.click();
//			
//			Thread.sleep(2000);
//		}
		
	}
	
	
	
}

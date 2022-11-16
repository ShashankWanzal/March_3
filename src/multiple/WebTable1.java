package multiple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("D:\\Dishaa\\batches\\March Batch\\HTML\\swdev\\tables.html");
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='abc123']/tbody/tr"));
		
		System.out.println(table.size());
		
		
		for(WebElement op:table)
		{
			System.out.println(op.getText());
		}
		
		
		
	}
}

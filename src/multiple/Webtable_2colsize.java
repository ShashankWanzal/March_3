package multiple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_2colsize
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("D:\\Dishaa\\batches\\March Batch\\HTML\\swdev\\tables.html");
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='abc123']/tbody/tr[1]/th"));
		
		System.out.println(col.size());
		
		for(WebElement op:col)
		{
			System.out.println(op.getText());
		}
		
		
	}
}

package parameterization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("D:\\Dishaa\\batches\\March Batch\\HTML\\swdev\\tables.html");
		
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='abc123']/tbody/tr"));
		
		System.out.println(table.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='abc123']/tbody/tr[2]/th"));
		
		System.out.println(col.size());

		List<WebElement> col2 = driver.findElements(By.xpath("//table[@id='abc123']/tbody/tr[2]/td"));
		
		System.out.println(col2.size());
		
		System.out.println("=======================");
		for(WebElement table1:table)
		{
			System.out.println(table1.getText());
		}
			
		System.out.println("===========================");
			
		
		for(WebElement col1:col)
		{
			System.out.println(col1.getText());
		}
		
		
		
			
			
			
		
	}
	
	
	
}

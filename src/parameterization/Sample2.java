package parameterization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		//url get 
		
		driver.get("D:\\Dishaa\\batches\\March Batch\\HTML\\swdev\\checkbox.html");
		
		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		
		System.out.println(check.size());
		
		for(WebElement box:check)
		{
			box.click();
			Thread.sleep(1000);
			
		}
		
		
	}
	
}

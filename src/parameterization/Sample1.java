package parameterization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		//url get 
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		
		System.out.println(link.size());
		
		
		for(WebElement op:link)
		{
			System.out.println(op.getText());
		}
		
		
		
		
		
		
		driver.quit();
	}
}

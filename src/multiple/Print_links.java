package multiple;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_links 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.manage().window().maximize();  
		Thread.sleep(2000);
		
		
		//findelement=> 1 element    =>WebElement 
		//findelements =>multiple elements locate =>list<WebElements>
		
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		int count = links.size();
		
		System.out.println(count);
		
		
		//for foreach
		
		//System.out.println(links.get(5));
		
		for(WebElement link:links)
		{
			System.out.println(link.getText());	
		}
		System.out.println("===============");
		
		
//		for (int i=0;i<=links.size()-1;i++)
//		{
//			System.out.println(links.get(i));
//		}
//		
		
		
		
		
	}
	
	
}

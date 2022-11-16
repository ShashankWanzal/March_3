package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2
{

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.paytm.com/");
		
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		List<WebElement> activelink=new ArrayList<WebElement>();
		
		
		for(int i=0;i<=links.size()-1;i++)
		{
			//System.out.println(links.get(i).getAttribute("href"));
			
			if(links.get(i).getAttribute("href") !=null && (! links.get(i).getAttribute("href").contains("javascript")) )
			{
				activelink.add(links.get(i));
			}
		
	
		}
		

		System.out.println(activelink.size());
		
		//HttpURLConnection
		
		for(int i=0;i<=activelink.size()-1;i++)
		{
			
			
			HttpURLConnection	connection=  (HttpURLConnection) new URL(activelink.get(i).getAttribute("href")).openConnection();
			
			connection.connect();
			String Response = connection.getResponseMessage();
			int statusCode = connection.getResponseCode();
			connection.disconnect();
			
			System.out.println(activelink.get(i).getAttribute("href")+"==>"+Response+"==>"+statusCode);
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}

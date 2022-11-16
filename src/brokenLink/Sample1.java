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

public class Sample1
{

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException 
	{
	
		//200=>ok
		//201=>create
		//404=>not found
		//400=>bad request
		//401=>unauthorized 
		//202=>accepted
		//500=>internal server error
		//504=>get way timeout
		//403=>Forbidden =>server permission 
		//502=>badgateway 
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		System.out.println(links.size());
	
		//www.google2.com
		
		
		//href='www.google.com'
		
		
		
		ArrayList<WebElement> activelink=new ArrayList<WebElement>();
		
		for(int i=0;i<=links.size()-1;i++)
		{
		
			if(links.get(i).getAttribute("href") !=null )
			{
				activelink.add(links.get(i));
			}
			
		}
		
		System.out.println(activelink.size());
		
		
		
		//HttpURLConnection 
		
		
		for(int j=0;j<=activelink.size()-1;j++)
		{
			
			
		HttpURLConnection  connection=(HttpURLConnection) new URL(activelink.get(j).getAttribute("href")).openConnection();
			
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			
			
			System.out.println(activelink.get(j).getAttribute("href")+"="+response);
			
			
			
			
		}
		
		
		
		
		
		//driver.close();
		
		
		
		
		
		
		
		
		
	}
	
	
}

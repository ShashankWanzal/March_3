package parameterization;

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

public class Link 
{
public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException
{

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	
	//DF4359
	
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DF4359");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shine@5407");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("446646");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();

	
	Thread.sleep(2000);
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	links.addAll(driver.findElements(By.tagName("img")));
	
	System.out.println(links.size());
	
	List<WebElement> activelink=new ArrayList<WebElement>();
	
	for(int i=0;i<=links.size()-1;i++)
	{
		//System.out.println(links.get(i).getAttribute("href"));
		
		if(links.get(i).getAttribute("href") !=null && ( ! links.get(i).getAttribute("href").contains("javascript")))
		{
			activelink.add(links.get(i));
		}
	}
	
	System.out.println(activelink.size());
	
	
	
	for(int j=0;j<=activelink.size()-1;j++)
	{
		
	   HttpURLConnection connection=(HttpURLConnection)	new URL(activelink.get(j).getAttribute("href")).openConnection();
	  
	   connection.connect();
	   String response = connection.getResponseMessage();
		
	   connection.disconnect();
	   
	   System.out.println(activelink.get(j).getAttribute("href")+"="+response);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}

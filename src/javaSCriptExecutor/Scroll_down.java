package javaSCriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.dishaaedtech.com/");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Instagram']"));
		WebElement enq = driver.findElement(By.xpath("//a[@class='navbar-brand']"));
		
		Thread.sleep(2000);
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//			
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
		
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", enq);
		
	}
	
	
}

package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACtions_drag_droup2
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, dest).perform();
		
		
	}
	
	
}

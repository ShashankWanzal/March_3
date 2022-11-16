package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_double_click
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		//http://demo.guru99.com/test/simple_context_menu.html
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Dclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To ')]"));
		
		
		Actions act=new Actions(driver);
		
		//act.moveToElement(Dclick).doubleClick().build().perform();
		
		act.doubleClick(Dclick).perform();
		
		
	}
	
	
	
}

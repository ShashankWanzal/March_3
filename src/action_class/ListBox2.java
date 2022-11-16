package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ListBox2 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		//step 1 =find list box
		
		WebElement list = driver.findElement(By.xpath("//select[@id='month']"));
		
		Thread.sleep(2000);
		
		//Step 2= create object of action class
		
		Actions act=new Actions(driver);
		
		
		//Step 3
		
		act.moveToElement(list).click().build().perform();
		
		
		for(int i=1;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		
		for(int i=1;i<=12;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
	}
	
	
	
}

package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_left_click
{

	
	
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement forgotpass = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		
		
		Actions act=new Actions(driver);
		
		act.moveToElement(forgotpass).click().build().perform();
		
		//act => object name of action class
		//moveToElement=>use to locate our cursor to that particular location 
		//Click=>Use to perform left click operation 
		//build=>use to combine diff methods
		//perform=>use to excecute the action 
		
		
	}
	
}

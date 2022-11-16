package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_right_click 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Un = driver.findElement(By.xpath("//input[contains(@class,'_2IX_2- VJZ')]"));
		
		Un.sendKeys("abc");
		
		WebElement button = driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd _3')]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(button).contextClick().build().perform();
		
		
		//act => object name of action class
		//moveToElement=>use to locate our cursor to that particular location 
		//contextClick=>Use to perform right click operation 
		//build=>use to combine diff methods
		//perform=>use to excecute the action 
		
		
		
		
		

	}

}

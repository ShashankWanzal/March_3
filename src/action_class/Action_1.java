package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_1
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		//driver.manage().window().maximize();   DF4359
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[2]/input")).sendKeys("DF4359");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[3]/input")).sendKeys("Shine@5407");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[4]/button")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[2]/div/input")).sendKeys("446646");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[3]/button")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/p")).getText();
		
		//String text = n1.getText();
	
		System.out.println(text);
	}
}

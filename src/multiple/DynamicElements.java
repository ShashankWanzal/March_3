package multiple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElements
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mi note 10 pro");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(6000);
		WebElement rating = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[4]"));
		
		System.out.println(rating.getText());
		Thread.sleep(4000);
		WebElement review = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[6]"));
		
		System.out.println(review.getText());
		
	}
	
	
	
}

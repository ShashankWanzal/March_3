package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait
{

	public static void main(String[] args)
	{
	
		// connect
		// ssh//Username   to connect any sever // terminal 
		//  Pass=======>absvc   
		
		//cd c://project   folder 
		//git clone "git" ----------------- 
		//Username    
		//Pass    
		//pwd =>project
		//cd April_11               c://project//march_11
		//git pull 

		//----------Master------------
		//git branch firstBranch   
		//git checkout firstbranch 
		//git switch to branch firstBranch  India@123  pin-> 123456
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  
	 
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
	//	long sec = Duration.ofSeconds(10);
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("hi");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Hi");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastname']"))).sendKeys("bye");
		
		
		
	}
	
	
}

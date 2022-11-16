package javaSCriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterKey 
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.Facebook.com/");
		
		//WebElement input = driver.findElement(By.xpath("//input[@id='email']"));
		
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		
		
		//1. input.sendKeys("abc");
	
		
		//Alternate Ways to pass values 
		
		//2. Java Script Executor 
		//3. action class 
		//4. robot class ->mouse related 
		
		
		
//		Robot rb=new Robot();
//	
//		
//		rb.keyPress(KeyEvent.VK_M);
//		rb.keyRelease(KeyEvent.VK_M);
//		Thread.sleep(1000);
//		rb.keyPress(KeyEvent.VK_A);
//		rb.keyRelease(KeyEvent.VK_A);
//		Thread.sleep(1000);
//		rb.keyPress(KeyEvent.VK_R);
//		rb.keyRelease(KeyEvent.VK_R);
//		Thread.sleep(1000);
//		rb.keyPress(KeyEvent.VK_C);
//		rb.keyRelease(KeyEvent.VK_C);
//		Thread.sleep(1000);
//		rb.keyPress(KeyEvent.VK_H);
//		rb.keyRelease(KeyEvent.VK_H);
	
		
		
		
//		Actions act=new Actions(driver);
//		
//		//act.sendKeys(input,"March_Batch").perform();
//		
//		act.sendKeys(input,"Software Testing").perform();
//		
		
		//JavascriptExecutor is an interface
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('email').value='rbc@xyz.com';");
		 
		js.executeScript("alert('Welcome To Selenium Testing');");
		
		
		
//		js.executeScript("arguments[0].value='abc';", input);   //function 
//		Thread.sleep(1000);
//		js.executeScript("arguments[0].click();", btn);

		
		
//		
//		js.executeScript("arguments[0].value='March_Batch';", input);
		
		Thread.sleep(2000);
		
		//driver.close();
	}
	
}

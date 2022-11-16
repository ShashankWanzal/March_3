package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softasser2
{
	WebDriver driver;
	SoftAssert soft;
	
	@BeforeClass
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void geturl()
	{
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test()
	{
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		boolean result = click.isEnabled();   
		
		
		 soft=new SoftAssert();
		
		 soft.fail();
		 
		 Reporter.log("test fail",true);
		 soft.assertFalse(result,"Forgotten password Button is not working as expected");
		 soft.assertAll();
		 click.click();
		 
	}
	
	@Test
	public void test2()
	{
		String exp="Facebook helps you connect and share with the people in your life.";
		WebElement text = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		
		String act = text.getText();
		
		soft.assertNotEquals(act, exp,"Getting missmatche in act & exp text");
		
		
		soft.assertAll();
		Reporter.log(act,true);
		
	}
	
	
	@AfterMethod
	public void back()
	{
		
		driver.navigate().back();
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	
}

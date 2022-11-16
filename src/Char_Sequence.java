import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Char_Sequence 
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.Facebook.com/");
		
		WebElement input = driver.findElement(By.xpath("//input[@id='email']"));
		
		//input.sendKeys("Dishaa Institute of training center");
		
		
		
		//1. String Builder
		
		StringBuilder key=new StringBuilder()
				.append("Dishaa")
				.append(" ")
				.append("Institute")
				.append(" ");

		
		//input.sendKeys(key);
		
		
		//2. String Buffer
		
		StringBuffer key2=new StringBuffer()
				.append("of")
				.append(" ")
				.append("Training")
				.append(" ")
				.append("Center");
		
		//input.sendKeys(key,key2);
		
		
		String key3=" ";
		String Key4="Pune";
		
		input.sendKeys(key,key2,key3,Key4);
		input.sendKeys(key,"001");
		
		
		//User key key2   abc001
		
	}
	
	
}

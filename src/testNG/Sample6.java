package testNG;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample6 
{

	
	
	@Parameters({"browsername"})
	@Test
	public void test(String browsername) throws InterruptedException {
		WebDriver dr = null;
		if(browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe" );
				
				 dr=new ChromeDriver();
				dr.get("http://www.google.com/");
				
				Thread.sleep(2000);
				
				Point p=new Point(-100, -100) ;
				
				dr.manage().window().setPosition(p);
				
				Thread.sleep(2000);
	
		}
		
		else if(browsername.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\shash\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			
			 dr=new FirefoxDriver();
	      dr.get("https://www.facebook.com/");		

	      dr.manage().window().maximize();
		
		}
		
		
	Thread.sleep(2000);
		
		dr.close();
		
		
		
	}
	
	
}

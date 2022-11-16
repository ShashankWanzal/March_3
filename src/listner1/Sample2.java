package listner1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Sample2 implements ITestListener
{
	

	@Override
	public void onTestFailure(ITestResult result)
	{
	
		
		System.out.println("Test is failed");
		Sample3.screenshot();

	}
	
	
}

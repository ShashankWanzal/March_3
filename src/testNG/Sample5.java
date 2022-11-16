package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample5
{

	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("-----Open Browser-----",true);
	}
	
	@BeforeMethod
	public void logintoApp()
	{
		Reporter.log("---Pre condition :Login---",true);
	}
	
	
	@Test
	public void VerifyPN() 
	{
		Reporter.log("--------Verify UN-----",true);
		
	}
	
	@AfterMethod
	public void LogoutFromApp()
	{
		Reporter.log("--------Post Condition--------",true);
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("------close the browser----------",true);
	}
	
	
	
	
}

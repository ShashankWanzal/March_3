package testNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample5 
{

	@Test(groups= {"order"})
	public void TC01()
	{
		Reporter.log("TC01 is running",true);
		
	}
	
	@Test(groups= {"payment"})
	public void TC02()
	{
		Reporter.log("TC02 is running",true);
		
	}
	
	@Test(groups= {"Home"})
	public void TC03()
	{
		Reporter.log("TC03 is running",true);
		
	}
	
	@Test(groups= {"order"})
	public void TC04()
	{
		Reporter.log("TC04 is running",true);
		
	}
	
	
}

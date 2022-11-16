package testNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4
{
	
	@Test(groups= {"order"})
	public void test1()
	{
		Reporter.log("Test 1 is running",true);
		
	}

	@Test(groups= {"order"})
	public void test2()
	{
		Reporter.log("Test 2 is running",true);
		
	}
	
	
	@Test(groups= {"order"})
	public void test3()
	{
		Reporter.log("Test 3 is running",true);
		
	}
	
	
	@Test(groups= {"payment"})
	public void test4()
	{
		Reporter.log("Test 4 is running",true);
		
	}

	
	@Test(groups= {"payment"})
	public void test5()
	{
		Reporter.log("Test 5 is running",true);
		
	}
	

	
	@Test(groups= {"payment"})
	public void test6()
	{
		Reporter.log("Test 6 is running",true);
		
	}

	
	@Test(groups= {"Home"})
	public void test7()
	{
		Reporter.log("Test 7 is running",true);
		
	}
	
	
	@Test(groups= {"Home"})
	public void test8()
	{
		Reporter.log("Test 8 is running",true);
		
	}
	
	
	
	
}

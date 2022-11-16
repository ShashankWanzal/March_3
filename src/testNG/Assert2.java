package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert2
{

	
	@Test
	public void test1() 
	{
	String a="aaaaaa";
	
	Reporter.log("Hi",true);
		Assert.fail();

	Assert.assertNull(a,"string a is not null");
	
		Reporter.log("Hi class",true);
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("running test 2");
	}
	
	
}

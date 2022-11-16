package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4
{

	// 1 class=> n test method(@test)
	
	@Test
	public void m1() 
	{
	System.out.println("Method m1 is running");	
	
	Reporter.log("Method m1 is pass",true);
	
	}
	@Test
	public void m2() 
	{
		System.out.println("Method m2 is running");
		Reporter.log("Method m2 is pass",true);
	}
	@Test
	public void m3() 
	{
		System.out.println("Method m3 is running");	
		Reporter.log("Method m3 is pass",true);
	}
	@Test
	public void m4() 
	{
		System.out.println("Method m4 is running");	
		Reporter.log("Method m4 is pass",true);
	}
	@Test
	public void m5() 
	{
		System.out.println("Method m5 is running");	
		Reporter.log("Method m5 is pass",true);
	}
	@Test
	public void m6() 
	{
		System.out.println("Method m6 is running");	
		Reporter.log("Method m6 is pass",true);
	}
	
	
	
	
}

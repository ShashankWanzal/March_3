package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_methods
{

	
	//7. Assert fail
	@Test
	public void test()
	{

		Reporter.log("Running Test Method",true);
		
		String exp=null;
		
		Assert.fail();

	}
	
	
//	//6. Assert not null
//	@Test
//	public void test()
//	{
//
//		Reporter.log("Running Test Method",true);
//		
//		String exp=null;
//		
//		//null=>false
//		//not null=>true 
//		
//		Assert.assertNotNull(exp,"exp is null");
//	
//	}
	
	
//	//5. Assert null
//	@Test
//	public void test()
//	{
//
//		Reporter.log("Running Test Method",true);
//		
//		String exp="hii";
//		
//		//null=>true
//		//not null=>false 
//		
//		Assert.assertNull(exp,"exp is not null");
//	
//	}
//	
	
	
	
//	//4. Assert false
//	@Test
//	public void test()
//	{
//
//		Reporter.log("Running Test Method",true);
//		
//		boolean result=true;
//		
//		//true=>false
//		//false=>true 
//		Assert.assertFalse(result,"condition is true thats why it is failing");
//	
//	}
	
	
//	//3. Assert true
//	@Test
//	public void test()
//	{
//
//		Reporter.log("Running Test Method",true);
//		
//		boolean result=false;
//		
//		//true=>Pass
//		//false=>fail 
//		
//		Assert.assertTrue(result,"result is not true");
//	}
	
	
	
//	//2. Assert not Equals
//	@Test
//	public void test()
//	{
//	
//		Reporter.log("Running Test Method",true);
//		
//		String exp="abcd";
//		String act="abcd";
//		
//		Assert.assertNotEquals(act, exp,"act & exp are matching");
//
//	}
	
	
	
	
//	//1. Assert Equals
//	@Test
//	public void test()
//	{
//	
//		Reporter.log("Running Test Method",true);
//		
//		String exp="abc";
//		String act="abcd";
//		
//		Assert.assertEquals(act, exp);
//
//	}
	
	
	
	
	
	
}

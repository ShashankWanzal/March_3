package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert3 
{

	
	@Test
	public void test1() 
	{
	String a="aaaa";
	
	
	SoftAssert soft=new SoftAssert();
	
	Reporter.log("Hi",true);
	
	soft.fail();
	
	soft.assertNull(a,"hiiii");

		Reporter.log("Hi class",true);
		
		soft.assertAll();
	}

	
	
	
	
	
}

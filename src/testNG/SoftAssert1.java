package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1
{

	@Test
	public void test()
	{
			
		String a="abc";
		String b="abcd";
		String c="123";

		SoftAssert soft=new SoftAssert();
		
		
		soft.assertEquals(a, c,"a & b are different");
		
		soft.assertNotEquals(a, b);
		
		soft.assertNotNull(a);
		
		
		
		soft.assertAll();
		
		
	}
	
	
}

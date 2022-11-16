package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert3 
{

	
	
	
		@Test
		public void test()
		{
			
			String a="abc";
			String b="abc";
			String c="123";
			String d=null;
			boolean result=true;
			
			SoftAssert soft=new SoftAssert();
			
			//7 fail
			
			soft.fail("due to enviroment issue");
			
			
			//6 assert not null
			
			soft.assertNotNull(d,"Object is not having property");
			
			//5 assert null
			
			soft.assertNull(c,"object is not null");
			
			
			
			//4 assert false
			
			soft.assertFalse(result,"Result is true");
			
			//3 assert true
			
			soft.assertTrue(result,"Result is not true");
			
			//2. assert not equal
			
			soft.assertNotEquals(a, c,"both are matching");
			
			
//			//1. assert equal 
//			
			soft.assertEquals(a, b,"it is not equal");
//			
//			
			
			
			
			
			
			soft.assertAll();
			
		}
	
	
	
	
	
}

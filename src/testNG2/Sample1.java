package testNG2;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class Sample1
{
	public void test1()
	{
		Reporter.log("test1 is running ",true);
	
	}
	
	@Test
	public void test2()
	{
		
		//Assert.fail("Test 2 is failed");
		
		Reporter.log("Test 2 is running",true);
		
		
		
	}
	
}


package testNG2;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class Sample6 
{
	@Parameters("name")
	@Test
	public void TC(String name)
	{
		
		//System.out.println();
		
		Reporter.log(name,true);
		
		
	}
	
	
	
}

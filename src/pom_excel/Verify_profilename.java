package pom_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify_profilename
{

	
	@FindBy(xpath="//span[@class='user-id']") private WebElement Profile;
	
	
	
	public Verify_profilename(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Vprofile(String exp)
	{
		
		String act = Profile.getText();
		if(act.equals(exp))
		{
			System.out.println("Test case 001 is pass");
		}
		else 
		{
			System.out.println("Test case 001 is fail");
		}
		
	}
	
	
	
	
	
}

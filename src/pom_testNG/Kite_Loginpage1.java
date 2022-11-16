package pom_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Loginpage1 
{

	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']") private WebElement Pass;
	
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement btn;
	
	public Kite_Loginpage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUN(String username)
	{
		UN.sendKeys(username);
		
	}
	
	public void EnterPass(String enterpass)
	{
		Pass.sendKeys(enterpass);
	}
	
	public void click()
	{
	btn.click();
		
	}
	
}

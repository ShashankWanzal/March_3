package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_login 
{

	
	//DF4359     //input[@id='password']
	
	//annotation 
	
	//Step1 :declare D.M. Globally 
	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']") private WebElement Pass;
	
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement btn;
	
	//Step 2 initialize within constructor with access level public 
	
	public Kite_login(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
		
	//Step 3
	
	public void enterUN()
	{
		UN.sendKeys("DF4359");
	}
	
	public void enterPass()
	{
	Pass.sendKeys("Shine@5407");
	}
	
	public void click()
	{
		btn.click();
	}
	
	
	
	
}

package pom_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_logine2page
{

	//1 Step declare DM globally (private)
	
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement btn;
	
	
	
	//Step2 initialize the constructor publically 
	
	public Kite_logine2page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step 3 declare methods 
	
	public void enterpin(String enterpin1)
	{
	
		pin.sendKeys(enterpin1);
	}
	
	public void clickonbtn() 
	{
	btn.click();	
	}
	
	
	
	
	
}

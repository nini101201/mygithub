package KitepomUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitepinpage {
	@FindBy(id="pin")  private WebElement pin1;
	@FindBy(xpath = "//button[@type='submit']")  private WebElement submit;
//Initilasation
	public  kitepinpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void enterPin(String pin)
	{
		pin1.sendKeys(pin);
		
	}
	public void clickoncontinew()
	{
	submit.click();
	}
	
	}





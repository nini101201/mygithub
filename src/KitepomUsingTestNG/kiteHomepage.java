package KitepomUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomepage {
	@FindBy(xpath="//span[@class='user-id']")  private WebElement userid;
	@FindBy(xpath="//a[@target='_self']") private WebElement log;
	//Initialisation
	public kiteHomepage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public String validation()
	{
		String ActualUserId=userid.getText();
		return ActualUserId;
//		String ExpectedUserId=userid1;
//		if(ActualUserId.equals(ExpectedUserId))
//		{
//			System.out.println("tc is pass");
//		}
//		else
//		{
//			System.out.println("tc fail");
//		}
	}
		public void click()
		{
			userid.click();
			log.click();
			
		}
		

}

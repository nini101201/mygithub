package KitepomUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteloginpage {
	 
		//do declare data member
		@FindBy(id="userid")    private WebElement id;
		@FindBy(id="password")  private WebElement password1;
	    @FindBy(xpath="//button[@type='submit']")private WebElement login;
	    //create constructor
	    public kiteloginpage (WebDriver driver) {
	    	PageFactory.initElements(driver,this);
	    	
	    }
	     public void sendkeyinuserID(String userid1) throws InterruptedException
	     {id.sendKeys(userid1);
	     Thread.sleep(2000);;
	     }
	     public void sendPassword(String password) throws InterruptedException
	     {
	    	 password1.sendKeys(password);
	    	 Thread.sleep(2000);
	     }
	     public void clickligin() throws InterruptedException
	     {
	    	 login.click();
	    	 Thread.sleep(2000);
	     }
	}
	     
	     



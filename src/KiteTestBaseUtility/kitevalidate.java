package KiteTestBaseUtility;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import KitepomUsingTestNG.kiteHomepage;
import KitepomUsingTestNG.kiteloginpage;
import KitepomUsingTestNG.kitepinpage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

@Listeners(suitLevelListener.listener.class)
public class kitevalidate extends Base {
	//Base b=new Base();
	//private static final String  = null;
	kiteloginpage login1;
	kitepinpage pin1;
	kiteHomepage home1;
	
  @Test
  public void f() throws EncryptedDocumentException, IOException {
	  int tcid=555;
	 // SoftAssert as=new SoftAssert();
	  Reporter.log("varification",true);
	 String ActualUserId=home1.validation();
	 System.out.println(ActualUserId);
	 String ExpectedId=Utility.getDataFromExcel(0, 0);
	 System.out.println(ExpectedId);
	 Assert.assertEquals(ActualUserId,ExpectedId,"tc fail" );
	// captureScreenShor();
	//as.assertAll();
  }
	 
  
  @BeforeMethod
  public void beforeMethod() throws EncryptedDocumentException, InterruptedException, IOException {
	  int tcid1=777;
	  Reporter.log("login kite app",true);
	 // Utility. captureScreenShort( driver, tcid1);
	  login1.sendkeyinuserID(Utility.getDataFromExcel(0, 0));
	  login1.sendPassword(Utility.getDataFromExcel(0, 1));
	  login1.clickligin();
	  pin1.enterPin(Utility.getDataFromExcel(1, 0));
	  pin1.clickoncontinew();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	  Reporter.log("log out",true);
	  home1.click();
	 
	  
  }
 // @Parameters("browsername")

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("launch browser",true);
//	  if(name.equals("chrome"))
//	  {
	 chromebrowserInitialisation();
	 // }
	 // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	  
//	  else if(name.equals("firefox"))
//		  firefoxbrowser();
//	  {
//		  
//		  
//	  }
	  login1=new kiteloginpage(driver);
	  pin1=new kitepinpage(driver);
	  home1=new kiteHomepage(driver);
			  
	  
  }

  @AfterClass
  public void afterClass() {
  
  Reporter.log("browser close",true);
  driver.close();
  }
}

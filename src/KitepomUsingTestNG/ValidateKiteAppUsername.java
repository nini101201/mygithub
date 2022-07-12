package KitepomUsingTestNG;

import org.testng.annotations.Test;

import KiteTestBaseUtility.Base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
@Listeners(suitLevelListener.listener.class)
public class ValidateKiteAppUsername extends Base {
	

	
	Sheet mysheet;
	kiteloginpage login;
	kitepinpage pin;
	kiteHomepage home;
	//@Parameters("browserName")

  @Test
  
  public void validateUserd() {
	
	  String expectedResult=mysheet.getRow(0).getCell(0).getStringCellValue();
	  String actualResult=home.validation();
	  Reporter.log("validateb user name",true);
	  Assert.assertEquals(expectedResult,actualResult,"result are not match" );
	  Reporter.log("tc pass",true);
  }
  @BeforeMethod
  public void logintokiteApp() throws InterruptedException {
	  String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
	     String password = mysheet.getRow(0).getCell(1).getStringCellValue();
	     String pin2 = mysheet.getRow(1).getCell(0).getStringCellValue();
	     login.sendkeyinuserID(UN);
	     Reporter.log("sending user name",true);
	     login.sendPassword(password);
	     Reporter.log("send Password",true);
	     login.clickligin();
	     Reporter.log("click on summit",true);
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	     pin.enterPin(pin2);
	     Reporter.log("enter pin sussecfully",true);
	     pin.clickoncontinew();
	     Reporter.log("click on continue",true);
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	     
  }

  @AfterMethod
  public void logoutfromkiteapp() {
	  home.click();
	  Reporter.log("log out");
  }
 // @Parameters("browserName")
  
  @BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException {
	  
//	if(name.equals("chrome"))  
//	{

	  System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
	     driver=new ChromeDriver();
//	}
//	else if(name.equals("firefox"))
//	{
//		 System.setProperty("webdriver.gecko.driver","D:\\giko\\geckodriver.exe");
//	     driver=new FirefoxDriver();
//	}
	    driver.get("https://kite.zerodha.com/");
	    Reporter.log("launch browser",true);
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	    File src=new File("D:\\poi-bin-5.2.2-20220312\\Book4.xlsx");
		 mysheet = WorkbookFactory.create(src).getSheet("Sheet1");
		 login=new kiteloginpage(driver);
		 pin=new kitepinpage(driver);
		 home=new kiteHomepage(driver);
		 
  }

  @AfterClass
  public void closeB() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	  Reporter.log("close browser");
	  driver.close();
	  
  }

}

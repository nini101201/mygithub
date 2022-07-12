package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class NewTest2 {
  @Test (invocationCount = 3)
  public void f()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
  driver.get("https://kite.zerodha.com/");
  }
  @Test
  public void f2()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/?gws_rd=ssl");
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("login with user id and password",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("logout",true);
	  
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("launch brouser",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("close broser",true);
  }

  
}

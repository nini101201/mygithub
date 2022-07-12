package TestNg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Annotation {
  @Test (groups="sanity")
  public void a() {
	  //Assert.fail();
	  Reporter.log("hi i f",true);
  }
  @Test(groups="regression")
  public void b() {
	  
	  Reporter.log("hi i am f1",true);
  }
  @Test (groups="sanity")
  public void c() {
	  
	  Reporter.log("hi i am f2",true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("hi i am Before method",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("hi i am afterMethod",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("hi i am beforeClass",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("hi i am afterclass",true);
  }

}

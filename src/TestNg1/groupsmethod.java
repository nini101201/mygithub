package TestNg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class groupsmethod {
  @Test (groups="sanity")
  public void d() {
	  Reporter.log("i am d from sanity",true);
  }
	 
	  @Test (groups="regression")
	  public void e() {
		  Reporter.log("i am e from from regression ",true);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}

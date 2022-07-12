package TestNg1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class disadvantagesOfHardAssert {
  @Test
  public void mymethod() {
	  Assert.fail();
	  Reporter.log("hi i am from mymethod",true);
	      
	  Reporter.log("hi i am fail from mymethod",true);
	  Reporter.log("hi i am  also fail from mymethod",true);
  }
	  @Test (dependsOnMethods= "mymethod")
	  public void my1()
	  {
	  Reporter.log("hi i am from my1",true);
	  }
	  @Test
	  public void my2()
	  {
		  Reporter.log("hi i am from my2",true);
	  }
	  
	  
	  
  
}

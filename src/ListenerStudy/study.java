package ListenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerStudy.listener.class)

public class study {
  @Test
  public void tc1() {
	  Reporter.log("tc1 running",true);
  }
  @Test
  public void tc2()
  {
	  Reporter.log("Tc2 Running",true);
  }
  @Test
  public void tc3()
  {
	  Assert.fail();
	  Reporter.log("tc3 is running",true);
  }
  @Test(dependsOnMethods="tc3")
  public void tc4()
  
  {
	  Reporter.log("tc4 is runing",true);
	  
  }
}

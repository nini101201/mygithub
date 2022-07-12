package TestNg1;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softVersion {
	
  @Test
  public void tc1() {
	  SoftAssert soft=new SoftAssert();
	  String a="pune";
	  String b="pune1";
	  soft.assertEquals(a, b,"they are not equal");
	  Reporter.log("varification pass",true);
	  soft.assertNotEquals(a, b,"they are equal");
	  Reporter.log("varification pass",true);
	  soft.assertAll();
	  
  }
}

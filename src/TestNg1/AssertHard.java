package TestNg1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertHard {
  @Test
  public void tc1() {
	  String name="pune";
	  String class1="pune";
	  Assert.assertEquals(name, class1,"result is not matching");
	  Reporter.log("tc1 pass",true);
  }
  @Test
  public void tc2() {
	 String a="mrunali";
	  String b="mrunali1";
	  Assert.assertNotEquals(a, b,"result is match");
	  Reporter.log("tc2 pass",true);
  }
  @Test  (enabled=false)
  public void tc3()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	 WebElement location = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
	     JavascriptExecutor jd = ((JavascriptExecutor)driver);
	     jd.executeScript("arguments[0].scrollIntoView(true);", location);
	   WebElement radio = driver.findElement(By.xpath("//input[@value='Radio1']"));
	   radio.click();
	  // boolean op=radio.isSelected();
	   Assert.assertTrue(radio.isSelected(), "result is false radio butten is not selected");
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   Reporter.log("tc3 is pass",true);
  }
  @Test (enabled=false)
  public void tc4()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	 WebElement loc = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
	        JavascriptExecutor jd1 = ((JavascriptExecutor)driver);
	        jd1.executeScript("arguments[0].scrollIntoView(true);", loc);
	       WebElement varification = driver.findElement(By.id("displayed-text"));
	      
	        WebElement output = driver.findElement(By.id("hide-textbox"));
	        output.click();
	       //driver.findElement(By.id("show-textbox")).click();
	            //boolean output=varification.isDisplayed();
	            Assert.assertFalse(varification.isDisplayed(), "box is diaplay");
	            Reporter.log("tc4 pass",true);
	  
  }
  @Test
  public void tc5()
  
  {
	  String rt=null;
	  Assert.assertNull(rt,"string contain something");
	  Reporter.log("tc5 pass",true);


  }
  @Test
  public void tc6()
  {
	  String k="null";
	  Assert.assertNotNull(k,"string must be contain something");
	  Reporter.log("tc6 is pass");
  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
}

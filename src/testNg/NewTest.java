package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void mymehod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/?gws_rd=ssl");
  }
  @Test
  public void my1()
  {
  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.google.com/?gws_rd=ssl");
  
  }
}

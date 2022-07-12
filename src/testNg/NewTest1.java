package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void kite() {
	   // System.out.println(UN);
	     System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
	     driver.get("https://kite.zerodha.com/");
  }
}

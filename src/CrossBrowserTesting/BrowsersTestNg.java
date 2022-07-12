package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BrowsersTestNg {
	WebDriver driver = null;
	@Parameters("browserName")
  @Test
  
  public void myMethod(String name) {
		//WebDriver driver = null;
		if(name.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\giko\\geckodriver.exe" );
			driver=new FirefoxDriver();
			
		}
		else if(name.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe" );
			driver=new ChromeDriver();
			
		}
		//driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.close();
		
	  
  }
}

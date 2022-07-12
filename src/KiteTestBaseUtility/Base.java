package KiteTestBaseUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class Base {
	static protected  WebDriver driver;
public void chromebrowserInitialisation()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
//	public void firefoxbrowser()
//	{
//		System.setProperty("webdriver.gecko.driver","D:\\giko\\geckodriver.exe" );
//		driver=new FirefoxDriver();
//		driver.get("https://kite.zerodha.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		
//	}
public  void captureScreenShort( String TCName) throws IOException

{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest= new File("D:\\screenshot\\mypicture5"+TCName+".png");
	FileHandler.copy(src, dest);
}

		
	}
		
		
	


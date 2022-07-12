package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class fluitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chrome\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        	       .withTimeout(Duration.ofSeconds(30))
        	       .pollingEvery(Duration.ofSeconds(5))
        	       .ignoring(NoSuchElementException.class);

        	   WebElement element= wait.until(new Function<WebDriver, WebElement>() {
        	     public WebElement apply(WebDriver driver) {
        	   WebElement id1 = driver.findElement(By.id("checkBoxOption1"));
        	   return id1;
        	     
        	   
        	     }
        	   });
        	   //element.click();
        	  // id1.click();
        	   if(element.isSelected())
        	   {
        		 System.out.println("select");
        	   }
        	   else
        	   {
        		   System.out.println("no");
        	   }
        	   
        	 
	}

	

}

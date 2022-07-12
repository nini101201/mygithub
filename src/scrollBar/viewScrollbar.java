package scrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class viewScrollbar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chrome\\\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://vctcpune.com/selenium/practice.html");
         Thread.sleep(2000);
         
         // scroll down to practice page and click on checkbox
       WebElement rf = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
           JavascriptExecutor je = ((JavascriptExecutor)driver);
           je.executeScript("arguments[0].scrollIntoView(true);",rf);
           driver.findElement(By.id("checkBoxOption1")).click();
           
           
         // scroll down to switch to tab and sendkey
           Thread.sleep(2000);
          WebElement rf1 = driver.findElement(By.xpath("//legend[text()='Switch Tab Example']"));
	          JavascriptExecutor jd = ((JavascriptExecutor)driver);
	          jd.executeScript("arguments[0].scrollIntoView(true);", rf1);
	          driver.findElement(By.id("name")).sendKeys("velocity");
	          Thread.sleep(2000);
	        
	          // scroll down to switch to calender example
	         
	          Thread.sleep(2000);
	          
	         WebElement ce = driver.findElement(By.xpath("//legend[text()='Calendar Example']"));
	        JavascriptExecutor str2 = ((JavascriptExecutor)driver);
	        str2.executeScript("arguments[0].scrollIntoView(true);", ce);
	         driver.findElement(By.xpath("//input[@list='mah-district']")).sendKeys("puna");
	       	       
	        

	          	        

}}

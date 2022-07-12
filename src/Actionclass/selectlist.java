package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectlist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(20000);
       WebElement str2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
      //str2.sendKeys("mrunali");
       Actions act=new Actions(driver);
       
       act.keyDown(str2, Keys.SHIFT).sendKeys("m").keyUp(Keys.SHIFT).sendKeys("runali").build().perform();
       // act.keyDown(str2, keys.);
       //act.keyDown(str2, Keys.CONTROL).sendKeys("a")build().perform();
      WebElement str3 = driver.findElement(By.name("reg_email__"));
       act.keyDown(str2, Keys.CONTROL).sendKeys(str2, "c").build().perform();
       act.keyDown(str3, Keys.CONTROL).sendKeys(str3, "v").build().perform();
       //act.keyDown(str3, Keys.CONTROL).sendKeys(str3, "a").build().perform();
        WebElement lastname1 = driver.findElement(By.name("lastname"));
        //Thread.sleep(2000);
      //act.keyDown(lastname1, Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).sendKeys("atil").build().perform();
	        //act.sendKeys(lastname1, "p").keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("till").build().perform();
	        act.sendKeys(lastname1, "pa").keyDown(Keys.SHIFT).sendKeys("t").keyUp(Keys.SHIFT).sendKeys("il").build().perform();
	        //Select dropdown list
	              WebElement day1 = driver.findElement(By.id("day"));
	              for(int i=12;i>=10;i--)
	              {
	            	  act.sendKeys(day1, Keys.ARROW_UP).perform();
	            	  Thread.sleep(200);
	              }
	              act.sendKeys(Keys.ENTER).perform();
	              
	           //select month
	              WebElement month1 = driver.findElement(By.id("month"));
	       for(int i=6;i<9;i++)
	       {
	    	   act.sendKeys(month1, Keys.ARROW_DOWN).perform();
	       }
	       act.sendKeys(Keys.ENTER);
	       //select year
	       WebElement year1 = driver.findElement(By.id("year"));
	       for(int i=2022;i>1991;i--)
	       {
	    	   act.sendKeys(year1, Keys.ARROW_DOWN).perform();
	       }
	       act.sendKeys(Keys.ENTER);
	       
	       
	//select gender
	     WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
	      act.moveToElement(gender).click(gender).build().perform();
	}
}

	



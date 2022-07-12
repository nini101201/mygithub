package seleniumpackage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handledynamiclist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(2000);
		List<WebElement> searchresult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		           
                  System.out.println(searchresult.size());
                  Iterator<WebElement> r = searchresult.iterator();
                  while(r.hasNext())
                  {
                	  System.out.println(r.next().getText());
                  }
                  for(WebElement result:searchresult)
                  {
                	  String actualr=result.getText();
                	  String exp="honda amaze";
                	  if(actualr.equals(exp))
                			  {
                		       result.click();
                		       break;
                			  }
                			  }
                 List<WebElement> list1 = driver.findElements(By.tagName("img"));
                	  System.out.println(list1.size());
                  }
	   
		   
	}



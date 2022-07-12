package seleniumpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reviewdyanmic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("readme10");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		List<WebElement> str2 = driver.findElements(By.xpath("(((//div[@class='col col-7-12'])[1]//span)[2]//span)[4]"));
		          //Thread.sleep(2000);
		          //System.out.println(str2.size());
	          //Thread.sleep(7000);
	          Iterator<WebElement> it = str2.iterator();
		          while(it.hasNext())
		          {
		              System.out.println(it.next().getText());
		          
		        	 
		          }
                           
	}

}

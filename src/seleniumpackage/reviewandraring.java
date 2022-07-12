package seleniumpackage;

import java.util.Iterator;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class reviewandraring {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("tv");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	 List<WebElement> rr = driver.findElements(By.xpath("((//div[@class='col col-7-12'])[1]//span)[2]"));
		//System.out.println(re.getText());
		        
		        Iterator<WebElement> rt = rr.iterator();
		        while(rt.hasNext())
	        {
		        	System.out.println(rt.next().getText());
		        }
		        
		        

		        
	}

}

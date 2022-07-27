package extraprogram;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	String mainpageid = driver.getWindowHandle();
	System.out.println("mainpageid "+mainpageid );
	driver.findElement(By.linkText("Try it Yourself")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.findElement(By.linkText("Try it Yourself")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.findElement(By.linkText("Try it Yourself")).click();
	Set<String> allpage = driver.getWindowHandles();
	
	
	for(String t:allpage)
		
	{
		System.out.println("all page id " +t);
		
		if(!t.equals(mainpageid))
		{
			driver.switchTo().window(t);
			driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
			String url = driver.getCurrentUrl();
			System.out.println(url);
			driver.close();
		}
	}
    
	
	driver.switchTo().window(mainpageid);
	String text = driver.findElement(By.xpath("//h3[text()='HTML Example:']")).getText();
	System.out.println(text);
	driver.close();
	 
     
	}

}

package extraprogram;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookwindowhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String mainpage = driver.getWindowHandle();
		System.out.println("mainpage "+mainpage);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	List<WebElement> drop = driver.findElements(By.tagName("select"));
//	String count = drop.get(0).getText();
//	System.out.println(count);
//	String count1 = drop.get(1).getText();
//	System.out.println(count1);
//	String count2 = drop.get(2).getText();
//	System.out.println(count2);
//	String count3 = drop.get(3).getText();
//	System.out.println(count3);
//	int c = drop.size();
//	System.out.println(c);
	for(int i=0;i<=drop.size();i++)
	{
		if(i%2==0)
		{
			System.out.println("drop down no "+i );
			System.out.println(drop.get(i).getText());
		}
	}
	
	
	
	

	}

}

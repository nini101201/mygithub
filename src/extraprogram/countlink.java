package extraprogram;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countlink {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	
		    List<WebElement> drop = driver.findElements(By.tagName("a"));
		 
		    int l = drop.size();
		    System.out.println("total "+l);
		//java.util.Iterator<WebElement> t=drop.iterator();
		for(int i=0;i<=drop.size();i++)
		{if(i%2!=0)
		{
			System.out.println( " odd link number of link " +i +drop.get(i).getText());
		}
		else
		{
			System.out.println("evenlink "+i+drop.get(i).getText());
		}
		}
	
	
				
		

	


	}
}



package extraprogram;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkoftutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/index.html");
	
		    List<WebElement> link = driver.findElements(By.tagName("a"));
		    System.out.println(link.size());
		   // ArrayList ar=new ArrayList(link);
		    for(int i=0;i<=link.size()-1;i++)
		    	
	    {
		    	if(i%2==0)
		    	{
		    	System.out.println("link no "+ i+" "+link.get(i).getText());
		    	
		    }
		    }
//	    for(WebElement link1:link)
//	    	
//		    {
//		    	System.out.println(link1.getText()+link1.getAttribute("href"));
//		    }
		 

	}

}

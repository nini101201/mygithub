package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		//how to find number of rows
		    List<WebElement> nrows = driver.findElements(By.xpath("//table//tr"));
	       System.out.println("number of rows " +nrows.size());
	       for(WebElement reader:nrows)
	       {
	    	   System.out.print(reader.getText()+" ");
	    	   System.out.println();
	       }
	
	}

}

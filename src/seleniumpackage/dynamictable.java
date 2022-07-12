package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictable {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	driver.manage().window().maximize();
	//how to find number of rows
	    List<WebElement> nrows = driver.findElements(By.xpath("//table//tr"));
       System.out.println("number of rows " +nrows.size());
       //find no of coloumn
       List<WebElement> nocl = driver.findElements(By.xpath("//table//tr[1]//th"));
            System.out.println("no of col " +nocl.size());
            //read the header
//            for(WebElement header:nocl)
//            {
//            	System.out.print(header.getText()+" ");
//            	
//            }
            List<WebElement> nrows2 = driver.findElements(By.xpath("//table//tr"));
            for(WebElement read:nrows2)
            {
            	System.out.print(read.getText()+ " ");
            	System.out.println();
            	
            }
	}

}

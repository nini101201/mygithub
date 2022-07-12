package seleniumpackage;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class positionAndsize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		System.out.println("position of window" +driver.manage().window().getPosition());
            //to set the position we need to create object of point class and pass x and y cordinate
		     Point h=new Point(5000,500);
		       driver.manage().window().setPosition(null);
		System.out.println("window size"+driver.manage().window().getSize());
		//to set size, need to create object of Dimension class and pass Width and 
		//Height
		//Object d=new Dimension(100,100);
		//driver.manage().window().setSize((org.openqa.selenium.Dimension) d);
		    


}
}
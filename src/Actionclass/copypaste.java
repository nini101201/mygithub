package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copypaste {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
         driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Mrunali");
        //Actions act=new Actions(driver);
       // act.sendKeys("Mrunali");
         System.out.println("gsgg");
	}

}

package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
       WebElement source = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
       WebElement desti = driver.findElement(By.id("amt7"));
       //Thread.sleep(2000);
       
       
       Actions act=new Actions(driver);
       //act.moveToElement(source).clickAndHold().moveToElement(desti).release().build().perform();
        act.dragAndDrop(source, desti).perform();
	}
	

}

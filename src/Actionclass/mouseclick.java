package Actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
//		WebElement clicks = driver.findElement(By.linkText("Insurance Project"));
//		//create object of Action class
		Actions as=new Actions(driver);
//		//as.moveToElement(clicks).click().build().perform();
//		as.click(clicks).perform();
		WebElement rightclick = driver.findElement(By.xpath("// span[text()='right click me']"));
		//as.moveToElement(rightclick ).contextClick().perform();
		as.contextClick(rightclick ).perform();
		WebElement doubleclick = driver.findElement(By.xpath("// button[text()='Double-Click Me To See Alert']"));
		//as.moveToElement(doubleclick).doubleClick().build().perform();
		as.doubleClick(doubleclick).perform();
		
		
		
		
		
	

	}

}

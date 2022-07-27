package extraprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getdifferntUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		String mainpageid = driver.getWindowHandle();
		System.out.println("mainpageid "+mainpageid );
		driver.findElement(By.linkText("Try it Yourself")).click();
		//String yrl = driver.getCurrentUrl()
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.linkText("Try it Yourself")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.linkText("Try it Yourself")).click();

	}

}

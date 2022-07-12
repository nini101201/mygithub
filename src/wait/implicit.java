package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chrome\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
        //System.out.println("ho");
        driver.findElement(By.id("autocomplet")).sendKeys("fwfw");

	}

}

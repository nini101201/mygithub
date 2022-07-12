package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\chrome\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
       // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
        //System.out.println("ho");
        WebDriverWait wait= new WebDriverWait(driver, 
        	Duration.ofMillis(2000));
      WebElement auto = driver.findElement(By.id("checkBoxOption1"));
        wait.until(ExpectedConditions.elementToBeClickable(auto));
        auto.click();
        
        


	}

}

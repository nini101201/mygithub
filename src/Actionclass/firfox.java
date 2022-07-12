package Actionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firfox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\giko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");

	}

}

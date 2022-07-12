package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class COUNTIMG {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.pexels.com/search/website/");
               List<WebElement> links = driver.findElements(By.tagName("img"));
              System.out.println(links.size());
	}

}

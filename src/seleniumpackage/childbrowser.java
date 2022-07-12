package seleniumpackage;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		String mainpageid=driver.getWindowHandle();
		System.out.println(mainpageid);

		driver.findElement(By.name("NewTab")).click();
		  Set<String>allpageid =driver.getWindowHandles();
		java.util.Iterator<String> it=allpageid.iterator();
		String mainpageid1=it.next();
		String childpageid1=it.next();
		driver.switchTo().window(childpageid1);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("mrunalipatil24@gmail.com");
		driver.switchTo().window(mainpageid1);
		String str1=driver.findElement(By.xpath("// p[text()='Click below to open link in new tab']")).getText();
		
		System.out.println(str1);
		driver.quit();
		
		 
		
	}

}

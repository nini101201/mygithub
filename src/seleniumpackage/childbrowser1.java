package seleniumpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");

        driver.findElement(By.name("NewTab")).click();
        Thread.sleep(7000);
        driver.findElement(By.name("NewWindow")).click();
        Thread.sleep(7000);
        
        Set<String>allpageid=driver.getWindowHandles();         
        Iterator<String> it=allpageid.iterator();
//         while(it.hasNext())
//         {
//        	 System.out.println(it.next());
//         }
        String mainpage=it.next();
        String secondpage=it.next();
        String thirdpage=it.next();
        System.out.println("mainpage "+mainpage);
        System.out.println("secondpage " +secondpage);
        System.out.println("thirdpagw  "+thirdpage);
        
        driver.switchTo().window(secondpage);
        driver.manage().window().maximize();
 driver.findElement(By.name("email")).sendKeys("mrunalipatil24@gmail.com");
 driver.close();
 

 driver.switchTo().window(mainpage);
 driver.manage().window().maximize();
 //Thread.sleep(2000);
 driver.close();
 
driver.switchTo().window(thirdpage);

driver.manage().window().maximize();
Thread.sleep(5000);
//driver.close();
 
// String str2=driver.findElement(By.xpath("(//span[text()='HOME'])[1]")).getText();
//System.out.println(str2);
         
	}

}

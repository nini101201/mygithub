package seleniumpackage;

import java.util.ArrayList;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class togetidofwindows {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://skpatro.github.io/demo/links/");
driver.findElement(By.name("NewTab")).click();
driver.findElement(By.name("NewWindow")).click();
Set<String>ids=driver.getWindowHandles();
//ArrayList al=new ArrayList(ids);
//for(int i=0;i<=al.size()-1;i++)

//System.out.println(al.get(i));

    java.util.Iterator<String> t1=ids.iterator();
       String mainpageid1=t1.next();
       System.out.println(mainpageid1);
       String secondpageid1=t1.next();
       
       System.out.println(secondpageid1);
       String thirspaheid3=t1.next();
       System.out.println(thirspaheid3);
       driver.switchTo().window(secondpageid1);
       driver.manage().window().maximize();
String str3= driver.findElement(By.xpath("(//span[text()='More'])[1]")).getText();
System.out.println(str3);
driver.close();
driver.switchTo().window(mainpageid1);
driver.manage().window().maximize();
String str4=driver.findElement(By.xpath("// p[text()='Click below to open link in new browser window']")).getText();
System.out.println(str4);
driver.close();
//switch focus to third page
driver.switchTo().window(thirspaheid3);
driver.manage().window().maximize();
driver.findElement(By.id("the7-search")).sendKeys("mrunalipatil24@gmail.com");







       
    

	}

}

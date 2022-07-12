package kite1;


import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class try1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException  {
		File src=new File("D:\\poi-bin-5.2.2-20220312\\Book4.xlsx");
		Sheet mysheet = WorkbookFactory.create(src).getSheet("Sheet1");
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		     String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		     String pin2 = mysheet.getRow(1).getCell(0).getStringCellValue();
		     System.out.println("pin" +pin2);
		     System.out.println(UN);
	     System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
	     driver.get("https://kite.zerodha.com/");
	 WebElement userid = driver.  findElement(By.id("userid"));
	 userid.sendKeys(UN);
	 WebElement passworsd = driver.findElement(By.id("password"));
	 passworsd.sendKeys(password );
	WebElement login = driver.findElement(By.xpath("// button[@type='submit']"));
	login.click();
	Thread.sleep(2000);
	WebElement pin1 = driver.findElement(By.xpath("//input[@type='password']"));
	pin1.sendKeys(pin2);
	WebElement continue1 = driver.findElement(By.xpath("//button[@type='submit']"));
	continue1.click();
	Thread.sleep(2000);
	WebElement actualid = driver.findElement(By.xpath("//span[text()='ELR321']"));
	actualid.click();
	String actualuserid = actualid .getText();
	System.out.println(actualuserid);
String expectedid = UN;
if(actualuserid.equals(expectedid))
{
	System.out.println("testcase pass");
}
else
{
	System.out.println("testcase fail");
}
 //driver.findElement(By.xpath(" //a[@target='_self']")).click();

		

	}

}

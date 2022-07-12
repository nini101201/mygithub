package frameWork;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		File src=new File("D:\\poi-bin-5.2.2-20220312\\Book4.xlsx");
		Sheet mysheet = WorkbookFactory.create(src).getSheet("Sheet1");
		  String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		     String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		     String pin2 = mysheet.getRow(1).getCell(0).getStringCellValue();
	System.setProperty("webdriver.chrome.driver","D:\\\\chrome\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://kite.zerodha.com/");
    testkiteApp t1=new testkiteApp(driver);
    t1.sendkeyinuserID(UN);
    t1.sendPassword(password);
    t1.clickligin();
    pinpage p1=new pinpage(driver);
    p1.enterPin(pin2);
    p1.clickoncontinew();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    homepage h1=new homepage(driver);
    h1.validation(UN);
    //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    h1.click();
   // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    driver.close();
    

	}

}

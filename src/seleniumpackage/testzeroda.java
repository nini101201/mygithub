package seleniumpackage;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testzeroda {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File src=new File("D:\\poi-bin-5.2.2-20220312\\Book4.xlsx");
		 org.apache.poi.ss.usermodel.Sheet mysheet = WorkbookFactory.create(src).getSheet("Sheet1");
		String UN = mysheet.getRow(0).getCell(0).getStringCellValue();
		     String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		     String pin = mysheet.getRow(1).getCell(0).getStringCellValue();
		     System.setProperty("webdriver.driver.chrome", "D:\\chrome\\chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
		     
		     

	}

}

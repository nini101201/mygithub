package KiteTestBaseUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility   {
	//WebDriver driver;
	public static String getDataFromExcel(int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException
	{
		File src=new File("D:\\poi-bin-5.2.2-20220312\\Book4.xlsx");
		Sheet mysheet = WorkbookFactory.create(src).getSheet("Sheet1");
		String value = mysheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
		return value;
		
	}
	
}

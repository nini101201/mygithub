package suitLevelListener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import KiteTestBaseUtility.Base;
import KiteTestBaseUtility.Utility;

public class listener extends Base implements ITestListener {
	Base b= new Base();
	public void onTestStart(ITestResult result)
	{
		
	}
public	void OnTestStart(ITestResult result)
{
	
}
public void onTestFailure(ITestResult result)
{
}
public void onTestSuccess(ITestResult result)
{
	String TCName =result.getName();
	try {
		b.captureScreenShort(TCName);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}

}

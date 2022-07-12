package ListenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listener implements ITestListener
{@Override
public void onTestFailure(ITestResult result) {
	Reporter.log("take screenshort",true);
	Reporter.log("tc fail pleas try again name is"+result.getName(),true);
	
}
@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test pass sussfuly",true);
	
	}
@Override
	public void onTestSkipped(ITestResult result) 
	{
	Reporter.log("this test is skipp",true);
		
	}
	
	{

}
}

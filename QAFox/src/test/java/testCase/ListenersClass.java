package testCase;

import java.io.File;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class ListenersClass extends TestListenerAdapter
{

	
	public void onTestStart(ITestResult tr)
	{
		System.out.println("Test Started Listner Reply....");
		
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		System.out.println("Test Pass Listner Reply....");
	}
	
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("Test Failed Listner Reply....");
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test Skipped Listner Reply....");
	}
	


	
}

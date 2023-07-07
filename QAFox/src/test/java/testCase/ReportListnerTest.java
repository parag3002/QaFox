package testCase;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ExtentReports;

public class ReportListnerTest 
{
	
	ExtentReports extent;
	ExtentTest test;
	

	@Test
	public void passAssert()
	{
		test=extent.startTest("Report Assert Pass...");
		System.out.println("Login by email--->");
		Assert.assertEquals("Parag", "Parag");
		test.log(LogStatus.PASS, "Assert passed and method passed...");
	}
	
	@Test
	public void failAssert()
	{
		test=extent.startTest("Report Failed...");
		System.out.println("Login by Facebook--->");
		try
		{
			Assert.assertEquals("Parag","Parag");
			test.log(LogStatus.PASS, "Assert Failed and method failed...");
		}
		catch (Exception e)
		{
	
		}
	}
	
	
	@BeforeTest
	public void startReport()
	{
		extent = new ExtentReports(System.getProperty("user.dir")+"//test-output//MyExtent.html",true);
		extent.addSystemInfo("Host Name","local host");
		extent.addSystemInfo("ENV","QA");
		extent.loadConfig(new File(System.getProperty("user.dir")+"//extent-config.xml"));
		
	}
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(LogStatus.FAIL, result.getThrowable());
		}
		extent.endTest(test);
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}
	
	
	
	
}

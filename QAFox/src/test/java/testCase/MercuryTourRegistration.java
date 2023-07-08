package testCase;
import java.lang.Math;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.baseClass;
import base.*;

public class MercuryTourRegistration extends baseClass // Register page all operations of mercury tour website
{
	
	MercuryTourRegistrationPageObjetc locator;
	ReportListnerTest report;
	
	MercuryTourRegistration() throws Exception
	{
		locator = new MercuryTourRegistrationPageObjetc();
		report = new ReportListnerTest();
	}
	
	@Test
	public void mercuryTourRegistration() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor)D;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		locator.setfirstName(RandomStringUtils.randomAlphabetic(8));
		locator.setLastName(RandomStringUtils.randomAlphabetic(8));
		locator.setPhone("8793748912");
		locator.setEmail("parag200922020@gmail.com");
		locator.setAddress("Arekere, Bangalore");
		locator.setCity("Bangalore");
		locator.setState("Karnataka");
		locator.setPostalCode("550068");
		locator.setCountry("INDIA");
		locator.setUsername(RandomStringUtils.randomAlphabetic(8));
		locator.setPassword("1234");
		locator.setConfirmPassword("1234");
		Thread.sleep(2000);
		locator.submitClick();
		Thread.sleep(2000);
		Assert.assertTrue(locator.checkSignOn());
		System.out.println("Mercury Tour Registration Successful ....");
		//System.out.println(RandomStringUtils.randomAlphabetic(8));
		
		
		
	}
	
	@BeforeMethod
	public void navigateToSignUp() throws Exception
	{
		D.navigate().to("https://demo.guru99.com/test/newtours/register.php");
	}
	
}

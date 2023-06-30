package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class baseClass 
{

	
	baseClass()
	{
		
		
	}
	
	@BeforeMethod
	public void setup()
	{
		System.out.println("setUp Drivers In Progress...");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("TearDown Complete.../");
	}
}

package testCase;

import org.testng.annotations.Test;
import base.*;

public class TC1_SignUp extends baseClass
{

	TC1_SignUp() throws Exception
	{
		
	
	}
	
	@Test
	public void TC1_Method() throws Exception
	{
		System.out.println("TC 1 Method...");
		System.out.println("TC 1 Method...Again");
		D.get("https://www.facebook.com");
		D.manage().window().maximize();
		Thread.sleep(4000);
		
	}
	
	
}

package testCase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.baseClass;
import utility.*;

public class TC2_Login extends baseClass
{
	Locators_A L;
	
	TC2_Login() throws Exception
	{
		L = new Locators_A();
	}
	
	@Test(dataProviderClass = excelDataProvider.class , dataProvider = "dataToTC2" , priority =1)
	public void TC2_Login_method(String userName , String passWord) throws Exception
	{
		//ScreenShot.captureSS();
		
		D.navigate().to("https://parabank.parasoft.com/parabank/register.htm");
		Thread.sleep(1000);
		D.findElement(By.xpath("//input[@id='customer.firstName']")).click();
		D.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("ABC");
		D.findElement(By.xpath("//input[@name='username']")).sendKeys("1234");
		Thread.sleep(1000);
	}
	
}

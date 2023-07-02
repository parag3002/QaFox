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
		
		D.navigate().to(configReader.readPS("register_parabank"));
		Thread.sleep(1000);
		D.findElement(By.xpath(L.userID)).sendKeys(userName);
		D.findElement(By.xpath(L.userPass)).sendKeys(passWord);
		D.findElement(By.xpath(L.loginCTA)).click();
		Thread.sleep(2000);
		System.out.println("Generic Message :: TC1 Testrun Complete.............>><<");
	}
	
}

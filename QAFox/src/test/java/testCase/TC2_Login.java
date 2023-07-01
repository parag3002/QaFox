package testCase;
import org.openqa.selenium.By;
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
		D.findElement(By.xpath(L.myAccountText)).click();
		D.findElement(By.xpath(L.loginB)).click();
		D.findElement(By.xpath(L.userID)).sendKeys(userName);
		D.findElement(By.xpath(L.userPass)).sendKeys(passWord);
		D.findElement(By.xpath(L.loginCTA)).click();
		//ScreenShot.captureSS();
		//Thread.sleep(1000);
		
	}
	
}

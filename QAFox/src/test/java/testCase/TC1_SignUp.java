package testCase;

import utility.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.*;
import utility.ScreenShot;
import utility.excelDataProvider;

public class TC1_SignUp extends baseClass
{

	Locators_A L;
	
	TC1_SignUp() throws Exception
	{
		L = new Locators_A();
	
	}
	
	
	@Test
	public void TC1_SignUp_method() throws Exception
	{
		D.navigate().to(configReader.readPS("register_parabank"));
		D.findElement(By.xpath(L.bank_First_Name)).sendKeys("ABC");
		D.findElement(By.xpath(L.bank_Last_Name)).sendKeys("ABC");
		D.findElement(By.xpath(L.bank_Address)).sendKeys("ABC");
		D.findElement(By.xpath(L.bank_City)).sendKeys("ABC");
		D.findElement(By.xpath(L.bank_State)).sendKeys("ABC");
		D.findElement(By.xpath(L.bank_ZipCode)).sendKeys("ABC");
		D.findElement(By.xpath(L.bank_PhoneNum)).sendKeys("ABC");
		D.findElement(By.xpath(L.bank_SSN)).sendKeys("ABC");
		D.findElement(By.xpath(L.bank_NewUserName)).sendKeys("ABC");
		D.findElement(By.xpath(L.bank_NewPass)).sendKeys("ABC");
		D.findElement(By.xpath(L.bank_ConfNewPass)).sendKeys("ABC");
		Thread.sleep(1000);
		D.findElement(By.xpath(L.bank_RegisterCTA)).click();
		
		Thread.sleep(1000);
	}
	
	
}

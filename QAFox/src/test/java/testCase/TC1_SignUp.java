package testCase;

import utility.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.*;
import utility.ScreenShot;
import utility.excelDataProvider;
import java.util.*;

public class TC1_SignUp extends baseClass
{

	Locators_A L;
	
	TC1_SignUp() throws Exception
	{
		L = new Locators_A();
	
	}
	
	
	@Test(dataProviderClass = excelDataProvider.class , dataProvider = "dataToTC1_SignUP" , priority =1)
	public void TC1_SignUp_method(String fName, String Lname, String AdRes, String CTY, String STAT, String ZPCode, String PhoneNo, String SSN_Param, String userNewName, String newPWD, String CnfPWD) throws Exception
	{
		Date DT = new Date();
		String DateUserName = DT.toString().replace(" ", "_").replace(":", "_");
		
		D.navigate().to(configReader.readPS("register_parabank"));
		D.findElement(By.xpath(L.bank_First_Name)).sendKeys(fName);
		D.findElement(By.xpath(L.bank_Last_Name)).sendKeys(Lname);
		D.findElement(By.xpath(L.bank_Address)).sendKeys(AdRes);
		D.findElement(By.xpath(L.bank_City)).sendKeys(CTY);
		D.findElement(By.xpath(L.bank_State)).sendKeys(STAT);
		D.findElement(By.xpath(L.bank_ZipCode)).sendKeys(ZPCode);
		D.findElement(By.xpath(L.bank_PhoneNum)).sendKeys(PhoneNo);
		D.findElement(By.xpath(L.bank_SSN)).sendKeys(SSN_Param);
		//D.findElement(By.xpath(L.bank_NewUserName)).sendKeys(userNewName);
		D.findElement(By.xpath(L.bank_NewUserName)).sendKeys(userNewName+DateUserName);
		D.findElement(By.xpath(L.bank_NewPass)).sendKeys(newPWD);
		D.findElement(By.xpath(L.bank_ConfNewPass)).sendKeys(CnfPWD);
		Thread.sleep(5000);
		D.findElement(By.xpath(L.bank_RegisterCTA)).click();
		Thread.sleep(5000);
		System.out.println("Generic Message :: TC1 TestRun Complete.............>><<");
		
	}
	
	
}

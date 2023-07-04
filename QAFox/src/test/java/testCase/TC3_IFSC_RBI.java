package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.*;
import base.baseClass;
import utility.configReader;

public class TC3_IFSC_RBI extends baseClass
{

	

	//https://tutorialsninja.com/demo/index.php?route=product/category&path=18
	//https://magento.softwaretestingboard.com/customer/account/create/
	//https://trailhead.salesforce.com/
	
	Locators_A L;
	public TC3_IFSC_RBI() throws Exception
	{
		L = new Locators_A();
	
	}

	
	@Test (priority =3 )
	public void TC3_method()throws Exception
	{
		D.navigate().to(configReader.readPS("IFSC_RBI_URL"));
				
		WebElement bankDropDown =  D.findElement(By.xpath(L.rbiDropDown));
		Select selectDDL = new Select(bankDropDown);
		selectDDL.selectByVisibleText(configReader.readPS("IFSCBankName"));
		Thread.sleep(1000);
		D.findElement(By.xpath(L.rbiBranch)).sendKeys("Bangalore");
		D.findElement(By.xpath(L.rbiSubmit)).click();
		Thread.sleep(1000);
		D.findElement(By.xpath(L.rbiBankLink)).click();
		Thread.sleep(1000);
		WebElement IFSC_Found =  D.findElement(By.xpath(L.rbiIFSCfield));
		Assert.assertTrue(IFSC_Found.isDisplayed());
		System.out.println("Address / Branch ---> "+D.findElement(By.xpath(L.rbiAddressfield)).getText().toString());
		System.out.println("Was Able to find IFSC --> "+IFSC_Found.getText().toString() +"for above address^");
		Thread.sleep(3000);
		
	}
	
}

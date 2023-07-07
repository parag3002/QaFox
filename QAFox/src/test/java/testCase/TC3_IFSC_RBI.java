package testCase;


import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.commons.logging.Log;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.Logger;
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
	WriteToExcel W;
	public TC3_IFSC_RBI() throws Exception
	{
		L = new Locators_A();
		W=new WriteToExcel();
		
		
	}

	
	@Test (priority =3 )
	public void TC3_method()throws Exception
	{
		
		
		D.navigate().to(configReader.readPS("IFSC_RBI_URL"));
				
		WebElement bankDropDown =  D.findElement(By.xpath(L.rbiDropDown));
		Select selectDDL = new Select(bankDropDown);
		selectDDL.selectByVisibleText(configReader.readPS("IFSCBankName"));
		Thread.sleep(1000);
		D.findElement(By.xpath(L.rbiBranch)).sendKeys(configReader.readPS("bankCItyIFSC"));
		D.findElement(By.xpath(L.rbiSubmit)).click();
		Thread.sleep(1000);
		D.findElement(By.xpath(L.rbiBankLink)).click();
		Thread.sleep(1000);
		WebElement IFSC_Found =  D.findElement(By.xpath(L.rbiIFSCfield));
		Assert.assertTrue(IFSC_Found.isDisplayed());
		
		String S1,S2;
		
		S1 = D.findElement(By.xpath(L.rbiAddressfield)).getText().toString();
		System.out.println("Address / Branch ---> "+D.findElement(By.xpath(L.rbiAddressfield)).getText().toString());
		
		S2=IFSC_Found.getText().toString();
		System.out.println("Was Able to find IFSC --> "+IFSC_Found.getText().toString() +"for above address^");
		
		W.TestRepostExcel(S1,1,2);
		W.TestRepostExcel(S2,1,1);
		W.fileclose();
		
		Thread.sleep(3000);
		
		
		
	}
	
}

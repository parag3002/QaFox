package base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass 
{

	public FileInputStream FIS;
	public Properties PS;
	public WebDriver D;
	
	
	public baseClass() throws Exception
	{
		D=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
	}
	
	@BeforeMethod
	public void setup() throws Exception
	{
		//baseClass B = new baseClass();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		D.close();
		D.quit();
	}
}

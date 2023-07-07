package base;

import java.io.FileInputStream;
import java.util.Properties;
import utility.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class baseClass // class name should start with capital letter
{

	public static FileInputStream FIS; // variable should be start with small
	public static  Properties PS; // variable name should be meaningful
	public static WebDriver D;
	
	
	public baseClass() throws Exception
	{
		
		
		
	}
	
	@BeforeMethod
	public void setup() throws Exception
	{
		//baseClass B = new baseClass();
		
		if(configReader.readPS("browser").equalsIgnoreCase("chrome"))
		{
			//System.out.println("Chrome..........");
			D=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			D.get(configReader.readPS("testurl"));
			D.manage().window().maximize(); // code redundancy
		}
		if(configReader.readPS("browser").equalsIgnoreCase("edge"))
		{
			D=new EdgeDriver();
			WebDriverManager.edgedriver().setup();
			D.get(configReader.readPS("testurl"));
			D.manage().window().maximize();
		}
		if(configReader.readPS("browser").equalsIgnoreCase("firefox"))
		{
			D=new FirefoxDriver();
			WebDriverManager.firefoxdriver().setup();
			D.get(configReader.readPS("testurl"));
			D.manage().window().maximize();
		}
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		//D.close();
		D.quit();
	}
}

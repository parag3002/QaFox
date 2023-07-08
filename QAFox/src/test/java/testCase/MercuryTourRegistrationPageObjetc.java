package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import base.baseClass;


public class MercuryTourRegistrationPageObjetc extends baseClass// All web-elements locators identification methods
{

	//WebDriver driver;
	
	public MercuryTourRegistrationPageObjetc() throws Exception 
	{
		//driver=D;
		//PageFactory.initElements(D,this);
	}


	//@FindBy(xpath = "//input[@name='lastName']") WebElement lastName;
	private  By firstName = By.xpath("//input[@name='firstName']");
	private By lastName = By.xpath("//input[@name='lastName']");
	private By phone = By.name("phone");
	private By email = By.id("userName");
	private By address = By.name("address1");
	private By city = By.xpath("//input[@name='city']");
	private By state = By.xpath("//input[@name='state']");
	private By postalCode = By.xpath("//input[@name='postalCode']");
	private By country = By.xpath("//select[@name='country']");
	private By user_name = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By confirmPassword = By.xpath("//input[@name='confirmPassword']");
	private By submit = By.xpath("//input[@name='submit']");
	private By signInCTA = By.xpath("//a[normalize-space()='sign-in']");
	

	public void setfirstName(String first_Name)
	{
		D.findElement(firstName).sendKeys(first_Name);
	}
	
	public void setLastName(String last_name)
	{
		D.findElement(lastName).sendKeys(last_name);
		//lastName.sendKeys(last_name);
	}
	
	public void setPhone(String phoneNumber)
	{
		D.findElement(phone).sendKeys(phoneNumber);
	}
	
	public void setEmail(String email1)
	{
		D.findElement(email).sendKeys(email1);
	}
	
	public void setAddress(String address1)
	{
		D.findElement(address).sendKeys(address1);
	}
	
	public void setCity(String city1)
	{
		D.findElement(city).sendKeys(city1);
	}
	
	public void setState(String state1)
	{
		D.findElement(state).sendKeys(state1);
	}
	
	public void setPostalCode(String postalCode1)
	{
		D.findElement(postalCode).sendKeys(postalCode1);
	}
	
	public void setCountry(String conutry1)
	{
		WebElement con = D.findElement(country);
		Select select = new Select(con);
		select.selectByVisibleText(conutry1);
	}
	
	public void setUsername(String userName)
	{
		D.findElement(user_name).sendKeys(userName);
	}
	
	public void setPassword(String passWord)
	{
		D.findElement(password).sendKeys(passWord);
	}
	
	
	public void setConfirmPassword(String confirm_password)
	{
		D.findElement(confirmPassword).sendKeys(confirm_password);
	}
	
	public void submitClick()
	{
		D.findElement(submit).click();
	}
	
	public boolean checkSignOn()
	{
		boolean verifySignOn = D.findElement(signInCTA).isDisplayed();
		return verifySignOn;
	}
	
}


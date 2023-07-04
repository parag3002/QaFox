package utility;

public class Locators_A 
{

	public String myAccountText = "//span[text()='My Account']";
	public String loginB = "//ul[@class='dropdown-menu dropdown-menu-right']/li/a[text()='Login']";
	
	public String userID = "//input[@name='username']";
	public String userPass = "//input[@name='password']";
	public String loginCTA = "//input[@value='Log In']";
	
	public String bank_First_Name = "//input[@id='customer.firstName']";
	public String bank_Last_Name = "//input[@id='customer.lastName']";
	public String bank_Address = "//input[@id='customer.address.street']";
	public String bank_City = "//input[@id='customer.address.city']";
	public String bank_State = "//input[@id='customer.address.state']";
	public String bank_ZipCode = "//input[@id='customer.address.zipCode']";
	public String bank_PhoneNum = "//input[@id='customer.phoneNumber']";
	public String bank_SSN = "//input[@id='customer.ssn']";
	public String bank_NewUserName = "//input[@id='customer.username']";
	public String bank_NewPass = "//input[@id='customer.password']";
	public String bank_ConfNewPass = "//input[@id='repeatedPassword']";
	public String bank_RegisterCTA = "//input[@value='Register']";
	
	public String LogOutCTA = "//li/a[@href='/parabank/logout.htm']";
	
	
	// RBI Locators
	
	public String rbiDropDown = "//select[@id='ddlBankName']";
	public String rbiBranch = "//input[@id='txtBranch']";
	public String rbiSubmit = "//input[@id='btnSubmit']";
	public String rbiIFSCfield = "//span[@id='lblIFSCDetails']";
	public String rbiAddressfield = "//td/span[@id='lblAddress']";
	public String rbiBankLink = "//tr/td/a[text()='HSR LAYOUT']";
//	public String
	
	
}

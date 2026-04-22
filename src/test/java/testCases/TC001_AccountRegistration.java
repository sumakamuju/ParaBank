package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistration extends BaseClass{
	@Test
	public void account_registration() {
		HomePage hp=new HomePage(driver);
		hp.clickRegister();
		
		RegistrationPage rp=new RegistrationPage(driver);
		rp.setFirstname(randomString().toUpperCase());
		rp.setLastname(randomString().toUpperCase());
		rp.setAddress(randomString());
		rp.setCity(randomString());
		rp.setState(randomString());
		rp.setZipcode(randomNumber());
		rp.setUsername(randomString());
		rp.setPassword(randomString());
		rp.setConfrimpassword(randomString());
		rp.clickregister();
	
	
	
	
	}

	
	
	
	
	
	
	
}

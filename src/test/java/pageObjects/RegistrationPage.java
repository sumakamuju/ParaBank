package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//*[@id='customer.firstName']")
	WebElement txtFirstname;
	@FindBy(xpath="//*[@id='customer.lastName']")
	WebElement txtLastname;
	@FindBy(xpath="//*[@id='customer.address.street']")
	WebElement txtAddress; 
	@FindBy(xpath="//*[@id='customer.address.city']")
	WebElement txtCity;
	@FindBy(xpath="//*[@id='customer.address.state']")
	WebElement txtState;
	@FindBy(xpath="//*[@id='customer.address.zipCode']")
	WebElement txtZipcode;
	@FindBy(xpath="//*[@id='customer.username']")
	WebElement txtUsername;
	@FindBy(xpath="//*[@id=\"customer.password\"]")
	WebElement txtPassword;
	@FindBy(xpath="//*[@id='repeatedPassword']")
	WebElement txtConfirmpassword;
	@FindBy(xpath="//*[@value=\"Register\"]")
	WebElement btnregister;
	
	
	
	public void setFirstname(String firstname) {
		txtFirstname.sendKeys(firstname);
	}
	public void setLastname(String lastname) {
		txtLastname.sendKeys(lastname);
	}
	public void setAddress(String address) {
		txtAddress.sendKeys(address);
	}
	public void setCity(String city) {
		txtCity.sendKeys(city);
	}
	public void setState(String state) {
		txtState.sendKeys(state); 
	}
	public void setZipcode(String zipcode) {
		txtZipcode.sendKeys(zipcode); 
	}
	public void setUsername(String username) {
		txtUsername.sendKeys(username); 
	}
	public void setPassword(String password) {
		txtPassword.sendKeys(password); 
	}
	public void setConfrimpassword(String confirmpassword) {
		txtConfirmpassword.sendKeys(confirmpassword);  
	}
	public void clickregister() {
		btnregister.click();  
	}

}

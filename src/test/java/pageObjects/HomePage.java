package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[text()='Register']")
	WebElement linkRegister; 
	
	public void clickRegister() {
		linkRegister.click();
	}
	
	
	
	
	
}

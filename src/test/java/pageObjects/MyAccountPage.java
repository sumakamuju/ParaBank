package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//*[text()='Account Services']")
	WebElement msgTitle;
	@FindBy(xpath="//*[text()='Log Out']")
	WebElement linkLogout;
	
	public boolean myAcc() {
		return(msgTitle.isDisplayed());
	}
	public void clickLogout()
	{
		linkLogout.click();
	}
	 

}

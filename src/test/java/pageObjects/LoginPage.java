package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
			}
@FindBy(xpath="//*[@name='username']")
WebElement txtUserName; 
@FindBy(xpath="//*[@name='password']")
WebElement txtPassword;
@FindBy(xpath="//*[@value='Log In']")
WebElement btnLogin;

public void setUsername(String name)
{
	txtUserName.sendKeys(name);
}

public void setPassword(String password){
	txtPassword.sendKeys(password);
}
public void clickLogin(){
	
	btnLogin.click();
}



}

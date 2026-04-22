package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	@Test(priority=1)
	public void Verify_Login() {
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(p.getProperty("username"));
		lp.setPassword(p.getProperty("password"));
		
		lp.clickLogin();
		
	
	}
	
	@Test(priority=2)
	public void Validation() {
	    MyAccountPage ap = new MyAccountPage(driver);
	    boolean targetpage = ap.myAcc();
	    Assert.assertEquals(targetpage, true, "Login failed");
	}
////gfthftyfghfgh
}

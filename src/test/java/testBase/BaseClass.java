package testBase;



import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass {
public static WebDriver driver;
public Logger logger;
public Properties p;

@BeforeClass
public void setup() throws IOException 
{
	//config.properties
	FileReader file;
	file = new FileReader("./src//test//resources//Config.properties");
	p=new Properties();
	p.load(file);
	
	logger=LogManager.getLogger(this.getClass());
	
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	driver.manage().window().maximize();
}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
public String randomString() {
	String generateString=RandomStringUtils.secure().nextAlphabetic(6);
	return generateString;
} 
public String randomNumber() {
	String generateNumber=RandomStringUtils.secure().nextNumeric(6);
	return generateNumber;
}
public String randomAlphaNumeric() {
	String generateString=RandomStringUtils.secure().nextAlphabetic(6);
	String generateNumber=RandomStringUtils.secure().nextNumeric(6);
	return (generateString + generateNumber); 
	
}







}

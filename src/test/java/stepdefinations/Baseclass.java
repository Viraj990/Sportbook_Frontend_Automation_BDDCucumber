package stepdefinations;

import org.openqa.selenium.WebDriver;

import pageObject.ForgotPassword;
import pageObject.Login;
import pageObject.Profile;
import pageObject.Registration;

public class Baseclass {

	
	public WebDriver driver;
	
	public Registration rg; 
	
	public Login lg;
	
	public ForgotPassword fp;
	
	public Profile pp;
	
//	@After
//	public void afterScenario() {
//		driver.close();
//	}
}

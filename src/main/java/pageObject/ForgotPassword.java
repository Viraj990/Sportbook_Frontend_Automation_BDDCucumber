package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
	WebDriver ldriver;

	public ForgotPassword (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id=":r2:")
	WebElement txtusername;	
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement txtphone;	
	
	@FindBy(xpath="//button[@aria-label='Restore Password']")
	WebElement btnlogin;	
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	WebElement forgotpasswordlink;
	
	public void uname(String uname) {
		txtusername.click();
		txtusername.sendKeys(uname);
	}
	
	public void phone(String phone) {
		txtphone.sendKeys(phone);
	}
	
	public void btnfp() throws Exception {
		btnlogin.click();
		Thread.sleep(1000);
	}
	
	public void link() throws Exception {
		forgotpasswordlink.click();
		Thread.sleep(1000);
	}
	
	
	
}

package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {

	WebDriver ldriver;

	public Registration(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath= "//input[@name='first_name']")
	WebElement txtfirstname;

	@FindBy(xpath= "//input[@name='last_name']")
	WebElement txtlastname;

	@FindBy(xpath= "//input[@placeholder='Enter Username']")
	WebElement txtusername;

	@FindBy(xpath= "//input[@placeholder='DD-MM-YYYY']")
	WebElement txtdob;

	@FindBy(xpath= "//input[@name='phone']")
	WebElement phone;

	@FindBy(xpath= "//input[@name='email']")
	WebElement txtemail;

	@FindBy(xpath= "//input[@placeholder='Enter Password']")
	WebElement txtpassword;

	@FindBy(xpath= "//input[@name='checkbox']")
	WebElement terms;

	@FindBy(xpath= "//button[text()='Register']")
	WebElement btnlogin;
	
	@FindBy(xpath="//input[@autocomplete='one-time-code']")
	WebElement otp;
	
	@FindBy(xpath= "//button[text()='Verify OTP']")
	WebElement verify;
	
	@FindBy(xpath= "//button[@aria-label='Logout']")
	WebElement logoutbtn;
	
	@FindBy(xpath="//button[text()='Resend OTP']")
	WebElement resendotp;
	//user defined method to perform operation on above webelement

	public void setfirstname(String fname) {
		txtfirstname.sendKeys(fname);
	}

	public void setlastname(String lname) {
		txtlastname.sendKeys(lname);
	}
	public void setemail(String email) {
		txtemail.sendKeys(email);
	}
	public void setdob(String Dob) {
		txtdob.click();
		txtdob.sendKeys(Dob);
	}
	public void setphone(String Number) {
		phone.sendKeys(Number);
	}
	public void setusername(String uname) {
		txtusername.sendKeys(uname);
	}
	public void setpassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	public void settc() {
		terms.click();
	}
	public void clickregister() {
		btnlogin.click();
	}
	public void EnterOTP(String Otp) {
		
		otp.sendKeys(Otp);
	}
	public void Clickverify() {
		verify.click();
	}
	public void logbutton() {
		logoutbtn.isDisplayed();
		}
	public void resend() {
		resendotp.click();
	}
}

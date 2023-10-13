package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver ldriver;

	public Login (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement txtusername;	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtpassword;	
	
	@FindBy(xpath="//button[@aria-label='Login']")
	WebElement btnlogin;	
	@FindBy(xpath= "//button[@aria-label='Logout']")
	WebElement logoutbtn;
	
	public void uname(String uname) {
		txtusername.sendKeys(uname);
	}
	
	public void pwd(String Pwd) {
		txtpassword.sendKeys(Pwd);
	}
	
	public void loginbtn() throws Exception {
		btnlogin.click();
		Thread.sleep(1000);
	}
	
	public void logbutton() {
		logoutbtn.click();
		}
}

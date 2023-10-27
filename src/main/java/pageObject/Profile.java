package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	WebDriver ldriver;

	public Profile (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@aria-label='username']")
	WebElement profilelink;
	
	@FindBy(xpath="//textarea[@name='address']")
	WebElement txtAddress;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Txtoldpwd;
	
	@FindBy(xpath="//input[@name='new_password']")
	WebElement Txtnewpwd;
	
	@FindBy(xpath="//button[text()='Update Profile']")
	WebElement btnupdate;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement first_name;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement last_name;
	
	public void profileredirection() {
		profilelink.click();
	}
	public void setfname(String fname) {
		first_name.sendKeys(fname);
	}
	public void setlname(String lname) {
		last_name.sendKeys(lname);
	}
	
	public void clearfiled() {
		first_name.clear();
		last_name.clear();
		txtAddress.clear();
	}
	
	public void setaddress(String Address) {
		txtAddress.sendKeys(Address);
	}
	
	public void setoldpwd(String oldpwd) {
		Txtoldpwd.sendKeys(oldpwd);
	}
	
	public void setnewpwd(String newpwd) {
		Txtnewpwd.sendKeys(newpwd);
	}
	
	public void updatebtn() {
		btnupdate.click();
	}
}

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
	
	@FindBy(xpath="")
	WebElement profilelink;
	
	@FindBy(xpath="")
	WebElement usernamesection;
	
	@FindBy(xpath="")
	WebElement txtAddress;
	
	@FindBy(xpath="")
	WebElement Txtoldpwd;
	
	@FindBy(xpath="")
	WebElement Txtnewpwd;
	
	@FindBy(xpath="")
	WebElement btnupdate;
	
	
	public void profileredirection() {
		profilelink.click();
	}
	
	public void fetchusername() {
		usernamesection.getText();
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
		btnupdate.sendKeys();
	}
}

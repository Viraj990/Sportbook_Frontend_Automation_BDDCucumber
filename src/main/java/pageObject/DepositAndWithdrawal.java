package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositAndWithdrawal  {
	WebDriver ldriver;

	public DepositAndWithdrawal (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//span[text()='Deposits and Withdrawals']")
	WebElement sidelink;

	@FindBy(xpath="//a[@href='/user/paymentrequest/chapa_deposit']")
	WebElement ChapaDeposit;

	@FindBy(xpath="//a[@href='/user/paymentrequest/santimpay_deposit']")
	WebElement SantimDeposit;

	@FindBy(xpath="//a[@href='/user/paymentrequest/chapa_withdraw']")
	WebElement Chapawithdrawal;

	@FindBy(xpath="//a[@href='/user/paymentrequest/santimpay_withdraw']")
	WebElement SantimWithdrawal;

	@FindBy(name="amount")
	WebElement Chaparequestamount;

	@FindBy(name="amount")
	WebElement Santimrequestamount;

	@FindBy(name="phone")
	WebElement santimmobilenumber;

	@FindBy(xpath="//button[text()='deposit']")
	WebElement ChapaDepositbtn;

	@FindBy(xpath="//button[text()='deposit']")
	WebElement SantimDepositbtn;

	@FindBy(xpath="//button[text()='Back']")
	WebElement Chapaback;

	@FindBy(xpath="//button[text()='Back']")
	WebElement Santimback;

	@FindBy(xpath="//input[@autocomplete='one-time-code']")
	WebElement otp;

	@FindBy(xpath= "//button[text()='Verify OTP']")
	WebElement verify;
	
	@FindBy(name="account_name")
	WebElement actname;
	
	@FindBy(name="account_number")
	WebElement actnumber;
	
	@FindBy(id="demo-select-small")
	WebElement selectbank;
	
	@FindBy(xpath="//button[@type='submit' and text()='Submit']")
	WebElement Submit;
	
	@FindBy(xpath="//button[text()='withdraw']")
	WebElement ChapaWithdraw;
	
	@FindBy(xpath="//button[text()='Withdraw']")
	WebElement SantimWithdraw;
	
	@FindBy(xpath="//button[text()='Resend OTP']")
	WebElement resendotp;

	public void resend() {
		resendotp.click();
	}
	public void SideLink() {
		sidelink.click();
	}
	public void chapadeposit() {
		ChapaDeposit.click();
	}
	public void santimdeposit() {
		SantimDeposit.click();
	}
	public void chapawithdrawal() {
		Chapawithdrawal.click();
	}
	public void santimWithdrawal() {
		SantimWithdrawal.click();
	}
	public void chaparequestamount(String chapaamount) {
		Chaparequestamount.sendKeys(chapaamount);
	}
	public void santimrequestamount(String santimamount) {
		Santimrequestamount.sendKeys(santimamount);
	}
	public void SantimMobileNumber(String santimphone) {
		santimmobilenumber.sendKeys(santimphone);
	}
	public void chapaDepositbtn() {
		ChapaDepositbtn.click();
	}
	public void santimDepositbtn() {
		SantimDepositbtn.click();
	}
	public void chapaback() {
		Chapaback.click();
	}
	public void santimback() {
		Santimback.click();
	}
	public void EnterWithdrawalOTP(String Otp) {

		otp.sendKeys(Otp);
	}
	public void Clickverifybtn() {
		verify.click();
	}
	public void txtaccountname(String Accountname) {
		actname.sendKeys(Accountname);
	}
	public void txtaccountnumer(String Accountnumber) {
		actnumber.sendKeys(Accountnumber);
	}
	public void SelectBank() {
		selectbank.click();
	}
	public void submitbtn() {
	 	Submit.click();
	}
	public void ChapaWithdrawbtn() {
		ChapaWithdraw.click();
	}
	public void SantimWithdrawbtn() {
		SantimWithdraw.click();
	}
}

package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObject.DepositAndWithdrawal;
import pageObject.ForgotPassword;
import pageObject.Login;
import pageObject.Profile;
import pageObject.Registration;
import pageObject.Tickets;
import pageObject.Transaction;

public class Baseclass {

	
	public WebDriver driver;
	WebDriverWait wait;
	
	public Registration rg; 
	
	public Login lg;
	
	public ForgotPassword fp;
	
	public Profile pp;
	
	public DepositAndWithdrawal dw;
	
	public Transaction tr;
	
	public Tickets ti;
	
	

}

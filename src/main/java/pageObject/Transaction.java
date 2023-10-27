package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transaction {
	WebDriver ldriver;

	public Transaction (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//span[text()='Transactions']")
	WebElement sidelink;
	
	@FindBy(xpath="//a[@aria-label='User Balance']")
	WebElement headlink;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div[1]/div[2]/div/div/div/div[1]/div/button")
	WebElement refreshicon;
	
	@FindBy(id=":r5:")
	WebElement RPP;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div[1]/div[2]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/div")
	WebElement firstdate;
	
	@FindBy(id=":r25:")
	WebElement enddate;
	
	@FindBy(xpath="//span[text()='All']")
	WebElement all;
	
	@FindBy(xpath="//span[text()='Deposit']")
	WebElement deposit;
	
	@FindBy(xpath="//span[text()='Withdraw']")
	WebElement withdraw;
	
	@FindBy(xpath="//span[text()='Bet place']")
	WebElement betplace;
	
	@FindBy(xpath="//span[text()='Winning']")
	WebElement winning;
	
	@FindBy(xpath="//button[text()='Clear']")
	WebElement clear;
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement search;
		
	
	
	public void Sidebarlink() {
		sidelink.click();
	}
	public void Headerlink() {
		headlink.click();
	}
	public void refreshiconvisibility() {
		refreshicon.isDisplayed();
	}
	
	public void Refreshiconclick() {
		refreshicon.click();
		
	}
	
	public void Rowperpage() {
		RPP.click();
	}
	
//	public void clickstartdate() {
//		firstdate.click();
//	}
//	public void clickenddate() {
//		enddate.click();
//	}
	
//	public void startdate(String Fdob) {
//		firstdate.getEditor(Fdob);
//	}
//	
	public void lastdate(String Edob) {
		enddate.sendKeys(Edob);
	}
	public void allfilter() {
		all.click();
	}
	public void depositfilter() {
		deposit.click();
	}
	public void withdrawfilter() {
		withdraw.click();
	}
	public void betplacfilter() {
		betplace.click();
	}
	public void winningfilter() {
		winning.click();
	}
	public void clearbtn() {
		clear.click();
	}
	public void searchbtn() {
		search.click();
	}
}

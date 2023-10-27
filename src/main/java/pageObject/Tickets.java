package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tickets {
	WebDriver ldriver;

	public Tickets (WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//span[text()='Tickets']")
	WebElement sidelink;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div[1]/div[2]/div/div/div/div[1]/div/button")
	WebElement refreshicon;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[4]/div[1]/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[2]")
	WebElement clickticket;
	
	@FindBy(xpath="//div[@aria-haspopup='listbox']")
	WebElement trpp;
	
	
	public void sideticket() {
		sidelink.click();
	}
	public void refreshvisibility() {
		refreshicon.isDisplayed();
	}
	
	public void ticketclick() {
		clickticket.click();
	}
	public void trpp() {
		trpp.click();
	}
}

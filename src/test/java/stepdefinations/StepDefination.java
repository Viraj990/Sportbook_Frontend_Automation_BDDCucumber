package stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.internal.Console;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DepositAndWithdrawal;
import pageObject.ForgotPassword;
import pageObject.Login;
import pageObject.Profile;
import pageObject.Registration;
import pageObject.Tickets;
import pageObject.Transaction;

public class StepDefination extends Baseclass {


	@SuppressWarnings("deprecation")
	@Given("User Launch The Chrome Browser")
	public void user_launch_the_chrome_browser() throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Create object of registration
		rg=new Registration(driver);
		lg=new Login(driver);
		fp= new ForgotPassword(driver);
		pp= new Profile(driver);
		dw = new DepositAndWithdrawal(driver);
		tr = new Transaction(driver);
		ti = new Tickets(driver);
		Thread.sleep(2000);
	}

	@When("User Open URL {string}")
	public void user_open_url(String URL) throws Exception {

		driver.get(URL);
		Thread.sleep(3000);
	}

	@When("Enter FirstName as {string}, Lastname as {string}, Email as {string}, Dateofbirth as {string}, phone as {string}, username as {string} , password as {string} and accept T&C")
	public void enter_first_name_as_lastname_as_email_as_dateofbirth_as_phone_as_username_as_password_as_and_accept_t_c(String firstname, String lastname, String Email,  String dateofbirth, String phone,String username, String password) throws Exception {
		rg.setfirstname(firstname);
		Thread.sleep(2000);
		rg.setlastname(lastname);
		Thread.sleep(2000);
		rg.setemail(Email);
		Thread.sleep(2000);
		rg.setdob(dateofbirth);
		Thread.sleep(2000);
		rg.setphone(phone);
		Thread.sleep(2000);
		rg.setusername(username);
		Thread.sleep(2000);
		rg.setpassword(password);
		Thread.sleep(2000);
		rg.settc();
		Thread.sleep(2000);
	}

	@When("Click on register button")
	public void click_on_register_button() throws Exception {
		rg.clickregister();
		Thread.sleep(4000);
	}

	@When("Enter OTP as {string}")
	public void enter_otp_as(String otp) throws Exception {

		rg.EnterOTP(otp);
		Thread.sleep(2000);
	}

	@When("Click on Verify OTP")
	public void click_on_verify_otp() throws Exception {
		rg.Clickverify();
		Thread.sleep(2000);
	}

	@When("verify logout button")
	public void verify_logout_button() throws Exception {
		rg.logbutton();
		Thread.sleep(2000);
	}


	@SuppressWarnings("deprecation")
	@Then("close browser")
	public void close_browser() throws Exception {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.quit();
		Thread.sleep(1000);
	}

	@When("verify validation Message for FirstName as {string}, LastName as {string}, UserName as {string}, DateofBirth as {string}, Phone as {string}, Email as {string}, Password as {string} and terms as {string}")
	public void verify_validation_message_for_first_name_as_last_name_as_user_name_as_dateof_birth_as_phone_as_email_as_password_as_and_terms_as(String firstname, String lastname, String username, String dateofbirth, String phone, String email, String password, String terms) throws Exception {

		WebElement fnamevalidation = driver.findElement(By.xpath("//p[text()='First Name is required']"));
		assertTrue(fnamevalidation.isDisplayed());
		assertEquals("First Name is required", fnamevalidation.getText());

		WebElement lnamevalidation = driver.findElement(By.xpath("//p[text()='Last Name is required']"));
		assertTrue(lnamevalidation.isDisplayed());
		assertEquals("Last Name is required", lnamevalidation.getText());

		WebElement unamevalidation = driver.findElement(By.xpath("//p[text()='Username is required']"));
		assertTrue(unamevalidation.isDisplayed());
		assertEquals("Username is required", unamevalidation.getText());

		WebElement DOBvalidation = driver.findElement(By.xpath("//p[text()='Date of Birth is required']"));
		assertTrue(DOBvalidation.isDisplayed());
		assertEquals("Date of Birth is required", DOBvalidation.getText());

		WebElement phonevalidation = driver.findElement(By.xpath("//p[text()='Phone Number is required']"));
		assertTrue(phonevalidation.isDisplayed());
		assertEquals("Phone Number is required", phonevalidation.getText());

		WebElement emailvalidation = driver.findElement(By.xpath("//p[text()='Email is required']"));
		assertTrue(emailvalidation.isDisplayed());
		assertEquals("Email is required", emailvalidation.getText());

		WebElement passwordvalidation = driver.findElement(By.xpath("//p[text()='Please Enter your password']"));
		assertTrue(passwordvalidation.isDisplayed());
		assertEquals("Please Enter your password", passwordvalidation.getText());

		WebElement termsvalidation = driver.findElement(By.xpath("//p[text()='You must accept the terms and conditions']"));
		assertTrue(termsvalidation.isDisplayed());
		assertEquals("You must accept the terms and conditions", termsvalidation.getText());

	}
	@When("verify Validation Message as {string}")
	public void verify_validation_message_as(String verifymessage) throws Exception {
		WebElement validation = driver.findElement(By.xpath("//div[text()='Username already exists.']"));
		assertTrue(validation.isDisplayed());
		assertEquals("Username already exists.", validation.getText());
		Thread.sleep(2000);
	}


	@When("verify Firstname validation as {string} and Lastname Validation as {string}")
	public void verify_firstname_validation_as_and_lastname_validation_as(String firstname, String lastname) {
		WebElement fnamevalidation = driver.findElement(By.xpath("//p[text()='No numbers allowed']"));
		assertTrue(fnamevalidation.isDisplayed());
		assertEquals("No numbers allowed", fnamevalidation.getText());

		WebElement lnamevalidation = driver.findElement(By.xpath("//p[text()='No numbers allowed']"));
		assertTrue(lnamevalidation.isDisplayed());
		assertEquals("No numbers allowed", lnamevalidation.getText());

	}

	@When("verify DateofBitrth validation message as {string}")
	public void verify_dateof_bitrth_validation_message_as(String dateofbirth) {
		WebElement DOBvalidation = driver.findElement(By.xpath("//p[text()='You must be at least 18 years old']"));
		assertTrue(DOBvalidation.isDisplayed());
		assertEquals("You must be at least 18 years old", DOBvalidation.getText());
	}

	@When("Enter FirstName as {string}, Lastname as {string}, Email as {string}, Dateofbirth as {string}, phone as {string}, username as {string} and password as {string}")
	public void enter_first_name_as_lastname_as_email_as_dateofbirth_as_phone_as_username_as_and_password_as(String firstname, String lastname, String email, String dateofbirth, String phone, String username, String password) throws Exception {
		rg.setfirstname(firstname);
		Thread.sleep(2000);
		rg.setlastname(lastname);
		Thread.sleep(2000);
		rg.setemail(email);
		Thread.sleep(2000);
		rg.setdob(dateofbirth);
		Thread.sleep(2000);
		rg.setphone(phone);
		Thread.sleep(2000);
		rg.setusername(username);
		Thread.sleep(2000);
		rg.setpassword(password);
		Thread.sleep(2000);
	}

	@When("verify terms validation message as {string}")
	public void verify_terms_validation_message_as(String string) {
		WebElement termsvalidation = driver.findElement(By.xpath("//p[text()='You must accept the terms and conditions']"));
		assertTrue(termsvalidation.isDisplayed());
		assertEquals("You must accept the terms and conditions", termsvalidation.getText());
	}

	@When("Enter FirstName as {string}, Lastname as {string}, Email as {string}, Dateofbirth as {string}, phone as {string}, username as {string} and password as {string} and accept T&C")
	public void enter_first_name_as_lastname_as_email_as_dateofbirth_as_phone_as_username_as_and_password_as_and_accept_t_c(String firstname, String lastname, String email, String dateofbirth, String phone, String username, String password) throws Exception {
		rg.setfirstname(firstname);
		Thread.sleep(2000);
		rg.setlastname(lastname);
		Thread.sleep(2000);
		rg.setemail(email);
		Thread.sleep(2000);
		rg.setdob(dateofbirth);
		Thread.sleep(2000);
		rg.setphone(phone);
		Thread.sleep(2000);
		rg.setusername(username);
		Thread.sleep(2000);
		rg.setpassword(password);
		Thread.sleep(2000);
		rg.settc();
		Thread.sleep(2000);
	}

	@When("verify password validation message as {string}")
	public void verify_password_validation_message_as(String string) {
		WebElement pwdvalidation = driver.findElement(By.xpath("//p[text()='Must Contain 8 Characters, One Uppercase, One Lowercase, One Number and One Special Case Character']"));
		assertTrue(pwdvalidation.isDisplayed());
		assertEquals("Must Contain 8 Characters, One Uppercase, One Lowercase, One Number and One Special Case Character", pwdvalidation.getText());
	}

	@When("verify the error toast message as {string}")
	public void verify_the_error_toast_message_as(String string) {
		WebElement errortoast = driver.findElement(By.xpath("//div[text()='Invalid OTP.']"));
		assertTrue(errortoast.isDisplayed());
		assertEquals("Invalid OTP.", errortoast.getText());
	}

	@When("Click on Resend OTP")
	public void click_on_resend_otp() throws Exception {
		rg.resend();
		Thread.sleep(2500);

	}

	@When("verify the toast message as {string}")
	public void verify_the_toast_message_as(String otptoast) throws Exception {
		WebElement toast = driver.findElement(By.xpath("//div[text()='OTP sent successfully.']"));
		assertTrue(toast.isDisplayed());
		assertEquals("OTP sent successfully.", toast.getText());
		Thread.sleep(2500);
	}

	@When("Verify the validation message as {string}")
	public void verify_the_validation_message_as(String string) {
		WebElement errorvalidation = driver.findElement(By.xpath("//p[text()='OTP should contain only numbers.']"));
		assertTrue(errorvalidation.isDisplayed());
		assertEquals("OTP should contain only numbers.", errorvalidation.getText());
	}
	@Then("verify Success register toast message as {string}")
	public void verify_success_register_toast_message_as(String Successtoast) throws Exception {
		WebElement successtoastvalidation = driver.findElement(By.xpath("//div[text()='Registration successful.']"));
		assertTrue(successtoastvalidation.isDisplayed());
		assertEquals("Registration successful.", successtoastvalidation.getText());
		Thread.sleep(2500);

	}

	///////////////////////////////////////////////////////// LOGIN STEP DEFINATION ////////////////////////////////////////////////////////////////////////////////////////////////////

	@When("Click on Login button")
	public void click_on_login_button() throws Exception {
		lg.loginbtn();
		Thread.sleep(4000);

	}

	@Then("verify validation Message for Username as {string} and Password as {string}")

	public void verify_validation_message_for_username_as_and_password_as(String username, String password) {
		WebElement uname = driver.findElement(By.xpath("//p[text()='Username is required']"));
		assertTrue(uname.isDisplayed());
		assertEquals("Username is required", uname.getText());

		WebElement pwd = driver.findElement(By.xpath("//p[text()='Password is required']"));
		assertTrue(pwd.isDisplayed());
		assertEquals("Password is required", pwd.getText());
	}

	@When("user enter Password as {string}")
	public void user_enter_password_as(String password) {
		lg.pwd(password);
	}

	@Then("verify validation Message for Username as {string}")
	public void verify_validation_message_for_username_as(String username) {
		WebElement uname = driver.findElement(By.xpath("//p[text()='Username is required']"));
		assertTrue(uname.isDisplayed());
		assertEquals("Username is required", uname.getText());
	}

	@When("user enter Username as {string}")
	public void user_enter_username_as(String username) {
		lg.uname(username);
	}

	@Then("verify validation Message for Password as {string}")
	public void verify_validation_message_for_password_as(String password) {
		WebElement pwd = driver.findElement(By.xpath("//p[text()='Password is required']"));
		assertTrue(pwd.isDisplayed());
		assertEquals("Password is required", pwd.getText());
	}

	@When("user enter Username as {string} Password as {string}")
	public void user_enter_username_as_password_as(String username, String password) throws Exception {
		lg.uname(username);
		lg.pwd(password);
		Thread.sleep(2000);
	}

	@Then("verify validation toast Message as {string}")
	public void verify_validation_toast_message_as(String toast) {

		WebElement validationtoast = driver.findElement(By.xpath("//div[text()='Invalid credentials.']"));
		assertTrue(validationtoast.isDisplayed());
		assertEquals("Invalid credentials.", validationtoast.getText());
	}

	@Then("verify validation success toast Message as {string}")
	public void verify_validation_success_toast_message_as(String toast) {

		WebElement validationsuccesstoast = driver.findElement(By.xpath("//div[text()='Login successfully.']"));
		assertTrue(validationsuccesstoast.isDisplayed());
		assertEquals("Login successfully.", validationsuccesstoast.getText());
	}

	@Then("verify inactive toast Message as {string}")
	public void verify_inactive_toast_message_as(String toast) {

		WebElement validationsuccesstoast = driver.findElement(By.xpath("//div[text()='Account is not active.']"));
		assertTrue(validationsuccesstoast.isDisplayed());
		assertEquals("Account is not active.", validationsuccesstoast.getText());
	}

	@Then("Click logout")
	public void click_logout() {
		lg.logbutton();
	}

	//////////////////////////////////////////////////////////////// Forgot Password ///////////////////////////////////////////////////////////////////////////////////////////////////////


	@When("Click Forgot password link")
	public void click_forgot_password_link() throws Exception {
		fp.link();
	}

	@Then("verify the url as {string}")
	public void verify_the_url_as(String verifyFP) {
		if(driver.getCurrentUrl().equals(verifyFP)) {
			Assert.assertTrue(true);  
		}
		else {
			Assert.assertTrue(false
					);
		}
	}

	@When("Enter the Username as {string}")
	public void enter_the_username_as(String username) {
		fp.uname(username);
	}

	@When("Enter the invalid Username as {string}")
	public void enter_the_invalid_username_as(String username)  {
		fp.uname(username);
	}

	@When("Click Restore password button")
	public void click_restore_password_button() throws Exception {
		fp.btnfp();
	}

	@Then("Verify the success email toast message as {string}")
	public void verify_the_success_email_toast_message_as(String string) {
		WebElement FPusernametoast = driver.findElement(By.xpath("//div[text()='Your password has been reset, Please login with the new password given to you in the text message.']"));
		assertTrue(FPusernametoast.isDisplayed());
		assertEquals("Your password has been reset, Please login with the new password given to you in the text message.", FPusernametoast.getText());
	}

	@When("Enter the phone number as {string}")
	public void enter_the_phone_number_as(String Phone) {
		fp.phone(Phone);
	}

	@Then("Verify the success phone toast message as {string}")
	public void verify_the_success_phone_toast_message_as(String string) {
		WebElement FPsuccesstoastphone = driver.findElement(By.xpath("//div[text()='Your password has been reset, Please login with the new password given to you in the text message.']"));
		assertTrue(FPsuccesstoastphone.isDisplayed());
		assertEquals("Your password has been reset, Please login with the new password given to you in the text message.", FPsuccesstoastphone.getText());
	}

	@Then("Verify the failed email toast message as {string}")
	public void verify_the_failed_email_toast_message_as(String string) {
		WebElement FPemailtoast = driver.findElement(By.xpath("//div[text()='User does not exist.']"));
		assertTrue(FPemailtoast.isDisplayed());
		assertEquals("User does not exist.", FPemailtoast.getText());
	}

	@Then("Verify the failed phone toast message as {string}")
	public void verify_the_failed_phone_toast_message_as(String string) {
		WebElement FPphonetoast = driver.findElement(By.xpath("//div[text()='User does not exist.']"));
		assertTrue(FPphonetoast.isDisplayed());
		assertEquals("User does not exist.", FPphonetoast.getText());
	}

	@Then("Verify the failed fp toast message as {string}")
	public void verify_the_failed_fp_toast_message_as(String string) {
		WebElement FPvalidation = driver.findElement(By.xpath("//div[text()='Please Enter any Value']"));
		assertTrue(FPvalidation.isDisplayed());
		assertEquals("Please Enter any Value", FPvalidation.getText());
	}


	////////////////////////////////////////////////////////////////////////// Profile Step Defination /////////////////////////////////////////////////////////////////////////////////////////////

	@When("Click profile link")
	public void click_profile_link() throws Exception {
		pp.profileredirection();
		Thread.sleep(3000);
	}

	@Then("Verify the profile url as {string}")
	public void verify_the_profile_url_as(String profileurl) {

		if(driver.getCurrentUrl().equals(profileurl)) {
			Assert.assertTrue(true);  
		}
		else {
			Assert.assertTrue(false);
		}

	}


	@Then("Verify the profile page displayed")
	public void verify_the_profile_page_displayed() {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/")) {
			System.out.println("Profile page doesnot get displayed while pasting");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("Profile page get displayed while pasting");
			Assert.assertTrue(false);
		}
	}

	@Then("Profile name match with the expected username as {string}")
	public void profile_name_match_with_the_expected_username_as(String expectedusername) {
		String actualusername = driver.findElement(By.xpath("//input[@name='user_name']")).getAttribute("value");
		// WebElement Actual = pp.fetchusername();
		if (actualusername.equals(expectedusername)) {
			System.out.println("Username matches the expected username: " + expectedusername);
		} else {
			System.out.println("Username does not match the expected username. Actual: " + actualusername + ", Expected: " + expectedusername);
		}
	}

	@Then("Click Update profile button")
	public void click_update_profile_button() throws Exception {
		pp.updatebtn();
		Thread.sleep(1000);
	}

	@Then("Verify the error message displayed as {string}")
	public void verify_the_error_message_displayed_as(String message) {
		WebElement FPvalidation = driver.findElement(By.xpath("//p[text()='Please Enter your Old password']"));
		assertTrue(FPvalidation.isDisplayed());
		assertEquals("Please Enter your Old password", FPvalidation.getText());
	}

	@Then("Add Address as {string} Enter Password as {string}")
	public void add_address_as_enter_password_as(String address, String password) throws Exception {
		pp.setaddress(address);
		pp.setoldpwd(password);
		Thread.sleep(2000);
	}

	@Then("verify the success profile update toast message as {string}")
	public void verify_the_success_profile_update_toast_message_as(String toastmessage) {
		WebElement FPvalidation = driver.findElement(By.xpath("//div[text()='Your profile updated successfully.']"));
		assertTrue(FPvalidation.isDisplayed());
		assertEquals("Your profile updated successfully.", FPvalidation.getText());
		//		String FPvalidation = driver.findElement(By.xpath("//div[text()='Your profile updated successfully.']")).getText();
		//		System.out.println(FPvalidation);
		//		if(FPvalidation.equals(toastmessage)) {
		//			 System.out.println("Your profile updated successfully. " + toastmessage);
		//		}
		//		else {
		//			 System.out.println("Toast not received " + FPvalidation + "Expected:" + toastmessage);
		//		}


	}

	@Then("Enter Firstname as {string} Lastname as {string} Address as {string} Enter Password as {string}")
	public void enter_firstname_as_lastname_as_address_as_enter_password_as(String firstname, String lastname, String address, String password) throws Exception {
		pp.clearfiled();
		Thread.sleep(2000);
		pp.setfname(firstname);
		Thread.sleep(500);
		pp.setlname(lastname);
		Thread.sleep(500);
		pp.setaddress(address);
		Thread.sleep(500);
		pp.setoldpwd(password);
		Thread.sleep(2000);

	}



	@Then("Enter Firstname as {string} Lastname as {string} Address as {string}")
	public void enter_firstname_as_lastname_as_address_as(String firstname, String lastname, String address) throws Exception {
		pp.clearfiled();
		Thread.sleep(2000);
		pp.setfname(firstname);
		Thread.sleep(500);
		pp.setlname(lastname);
		Thread.sleep(500);
		pp.setaddress(address);
		Thread.sleep(500);
		Thread.sleep(2000);
	}

	@Then("verify the password error validation message as {string}")
	public void verify_the_password_error_validation_message_as(String passworderror) {
		WebElement errorvalidation = driver.findElement(By.xpath("//p[text()='Please Enter your Old password']"));
		assertTrue(errorvalidation.isDisplayed());
		assertEquals("Please Enter your Old password", errorvalidation.getText());
	}

	@Then("Enter invalid old password as {string}")
	public void enter_invalid_old_password_as(String oldpassword) throws Exception {
		pp.setoldpwd(oldpassword);
		Thread.sleep(2000);
	}

	@Then("verify the invalid profile toast message as {string}")
	public void verify_the_invalid_profile_toast_message_as(String toast) throws Exception {
		WebElement invalidtoast = driver.findElement(By.xpath("//div[text()='Invalid credentials.']"));
		assertTrue(invalidtoast.isDisplayed());
		assertEquals("Invalid credentials.", invalidtoast.getText());


	}		
	@Then("enter old password as {string}")
	public void enter_old_password_as(String oldpassword) throws Exception {
		pp.setoldpwd(oldpassword);
		Thread.sleep(3000);

	}

	@Then("verify the validation error password message as {string}")
	public void verify_the_validation_error_password_message_as(String pwdvalidation) {
		//		 WebElement passwordvalidations = driver.findElement(By.xpath("//p[text()='Must Contain 8 Characters, One Uppercase, One Lowercase, One Number and One Special Case Character']"));
		//			assertTrue(passwordvalidations.isDisplayed());
		//			assertEquals("Must Contain 8 Characters, One Uppercase, One Lowercase, One Number and One Special Case Character", passwordvalidations.getText());

		String passwordvalidations = driver.findElement(By.xpath("//p[text()='Must Contain 8 Characters, One Uppercase, One Lowercase, One Number and One Special Case Character']")).getText();
		System.out.println(passwordvalidations);
		if(passwordvalidations.equals(pwdvalidation)) {
			System.out.println("Toast Received " + pwdvalidation);
		}
		else {
			System.out.println("Toast not received " + passwordvalidations + "Expected:" + pwdvalidation);
		}
	}

	@Then("enter Old password as {string} and New password as {string}")
	public void enter_old_password_as_and_new_password_as(String oldpassword, String newpassword) throws Exception {
		pp.setoldpwd(oldpassword);
		Thread.sleep(2000);
		pp.setnewpwd(newpassword);
		Thread.sleep(2000);

	}
	@Then("Verify the success profile update toast message as {string}")
	public void verify_the_success_profile_update_toast_message_as_(String toast) throws Exception {
		WebElement fPvalidation = driver.findElement(By.xpath("//div[text()='Your profile updated successfully.']"));
		assertTrue(fPvalidation.isDisplayed());
		assertEquals("Your profile updated successfully", fPvalidation.getText());


	}	



	///////////////////////////////////////////////////////////// Deposit and Withdrawal Step Definition ////////////////////////////////////////////////////////////////////////////////////////


	@When("Click Deposits and Withdarwal link")
	public void click_deposits_and_withdarwal_link() throws Exception {
		dw.SideLink();
		Thread.sleep(1000);
	}

	@Then("Verify the Deposit section is open as {string}")
	public void verify_the_deposit_section_is_open_as(String depositpage) {
		WebElement txtdepositpage = driver.findElement(By.xpath("//h6[text()='Deposits and withdrawals']"));
		assertTrue(txtdepositpage.isDisplayed());
		//System.out.println(txtdepositpage);
		assertEquals("DEPOSITS AND WITHDRAWALS", txtdepositpage.getText());
	}

	@Then("verify the Deposit page url as {string}")
	public void verify_the_deposit_page_url_as(String depositurl) {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/user/DepositsAndWithdrawals")) {
			System.out.println("Deposit page displayed");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("Deposit page not dispayed");
			Assert.assertTrue(false);
		}
	}

	@Then("verify the Deposit URL as {string}")
	public void verify_the_deposit_url_as(String chapaurl) {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/user/paymentrequest/chapa_deposit")) {
			System.out.println("Deposit page displayed");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("Deposit page not dispayed");
			Assert.assertTrue(false);
		}
	}

	@When("Click on the Chapa Deposit")
	public void click_on_the_chapa_deposit() throws Exception {
		dw.chapadeposit();
		Thread.sleep(1000);
	}

	@Then("Verify the Chapa Deposit section is open")
	public void verify_the_chapa_deposit_section_is_open() {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/user/paymentrequest/chapa_deposit")) {
			System.out.println("chapa Deposit page displayed");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("chapa Deposit page not dispayed");
			Assert.assertTrue(false);
		}
	}

	@When("Enter the chapa request amount as {string}")
	public void enter_the_chapa_request_amount_as(String Camount) throws Exception {
		dw.chaparequestamount(Camount);
		Thread.sleep(1000);
	}

	@When("Click deposit button")
	public void click_deposit_button() throws Exception {
		dw.chapaDepositbtn();
		Thread.sleep(1000);

	}

	@Then("Verify the request amount validation message")
	public void verify_the_request_amount_validation_message() {
		WebElement chapavalidation = driver.findElement(By.xpath("//p[text()='Value must be greater than or equal to 20 ETB']"));
		assertTrue(chapavalidation.isDisplayed());
		assertEquals("Value must be greater than or equal to 20 ETB", chapavalidation.getText());
	}

	@Then("Verify the validation message without entering data as {string}")
	public void verify_the_validation_message_without_entering_data_as(String string) {
		WebElement chapavalidationmsg = driver.findElement(By.xpath("//p[text()='Amount is required']"));
		assertTrue(chapavalidationmsg.isDisplayed());
		assertEquals("Amount is required", chapavalidationmsg.getText());
	}

	@When("Click back button")
	public void click_back_button() throws Exception {
		dw.chapaback();
		Thread.sleep(1000);
	}

	@Then("verify the redirection URL as {string}")
	public void verify_the_redirection_url_as(String string) {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/user/DepositsAndWithdrawals")) {
			System.out.println("back btn work");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("back not work");
			Assert.assertTrue(false);
		}
	}

	@Then("verify the santim Deposit URL as {string}")
	public void verify_the_santim_deposit_url_as(String santimurl) {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/user/paymentrequest/santimpay_deposit")) {
			System.out.println("Deposit page displayed");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("Deposit page not dispayed");
			Assert.assertTrue(false);
		}
	}

	@Then("verify the balance displayed same or not")
	public void verify_the_balance_displayed_same_or_not() throws Exception {
		String mainbalance = driver.findElement(By.xpath("//a[@aria-label='User Balance']")).getText().replaceAll("[^\\d.]", "");
		System.out.println(mainbalance);
		String otherbalance = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div[1]/div[2]/div/div/div/form/div/p/span")).getText().replaceAll("[^\\d.]", "");
		System.out.println(otherbalance);
		Thread.sleep(500);
		if(mainbalance.equals(otherbalance)) {
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}


	}
	@When("Click on the santim Deposit")
	public void click_on_the_santim_deposit() throws Exception {
		dw.santimdeposit();
		Thread.sleep(1000);
	}

	@Then("Verify the santim Deposit section is open")
	public void verify_the_santim_deposit_section_is_open() {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/user/paymentrequest/santimpay_deposit")) {
			System.out.println("chapa Deposit page displayed");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("chapa Deposit page not dispayed");
			Assert.assertTrue(false);
		}
	}

	@Then("Verify the validation message of Mobile number as {string} and Amount as {string}")
	public void verify_the_validation_message_of_mobile_number_as_and_amount_as(String phone, String amount) {
		WebElement santimphone = driver.findElement(By.xpath("//p[text()='Phone Number is required']"));
		assertTrue(santimphone.isDisplayed());
		assertEquals("Phone Number is required", santimphone.getText());
		WebElement santimamount = driver.findElement(By.xpath("//p[text()='Amount is required']"));
		assertTrue(santimamount.isDisplayed());
		assertEquals("Amount is required", santimamount.getText());
	}

	@Then("Verify the validation message of Amount as {string}")
	public void verify_the_validation_message_of_amount_as(String amount) {
		WebElement santimamount = driver.findElement(By.xpath("//p[text()='Amount is required']"));
		assertTrue(santimamount.isDisplayed());
		assertEquals("Amount is required", santimamount.getText());
	}

	@Then("Verify the validation message of Mobile number as {string}")
	public void verify_the_validation_message_of_mobile_number_as(String phone) {
		WebElement santimphone = driver.findElement(By.xpath("//p[text()='Phone Number is required']"));
		assertTrue(santimphone.isDisplayed());

		assertEquals("Phone Number is required", santimphone.getText());
	}

	@When("Enter the mobile number as {string}")
	public void enter_the_mobile_number_as(String phone) throws Exception {
		dw.SantimMobileNumber(phone);
		Thread.sleep(1000);
	}

	@When("Enter the santim request amount as {string}")
	public void enter_the_santim_request_amount_as(String amount) throws Exception {
		dw.santimrequestamount(amount);
		Thread.sleep(1000);
	}

	@When("Click santim page deposit button")
	public void click_santim_page_deposit_button() throws Exception {
		dw.santimDepositbtn();
		Thread.sleep(1000);

	}

	@Then("Verify the santim request amount validation message")
	public void verify_the_santim_request_amount_validation_message() {
		WebElement santimvalidationmsg = driver.findElement(By.xpath("//p[text()='Value must be greater than or equal to 10 ETB']"));
		assertTrue(santimvalidationmsg.isDisplayed());
		assertEquals("Value must be greater than or equal to 10 ETB", santimvalidationmsg.getText());
		
	}
	
	@When("Click on the Chapa Withdrawal")
	public void click_on_the_chapa_withdrawal() throws Exception {
	    dw.chapawithdrawal();
	    Thread.sleep(1000);
	}

	@Then("verify the Chapa Withdrawal URL as {string}")
	public void verify_the_chapa_withdrawal_url_as(String ChapaWithdrawURL) {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/user/paymentrequest/chapa_withdraw")) {
			System.out.println("chapa Withdraw page displayed");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("chapa Withdraw page not dispayed");
			Assert.assertTrue(false);
		}
	}

	@When("Click Withdraw button")
	public void click_withdraw_button() throws Exception {
	    dw.ChapaWithdrawbtn();
	   Thread.sleep(2000);

	}

	@Then("Validate the error toast message")
	public void validate_the_error_toast_message() throws Exception {
		String toastmessage = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div")).getText();
		System.out.println(toastmessage);
		String mainbalance = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div[1]/div[2]/div/div/div/form/div/p/span")).getText();
		System.out.println(mainbalance);
		String validatemsg = "Withdraw amount must be between 20 ETB and less than " + mainbalance;
		Thread.sleep(500);
		if(validatemsg.equals(toastmessage)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}

	@Then("Validate the withdrawal validation error message")
	public void validate_the_withdrawal_validation_error_message() {
		WebElement santimamountmsg = driver.findElement(By.xpath("//p[text()='Amount is required']"));
		assertTrue(santimamountmsg.isDisplayed());
		assertEquals("Amount is required", santimamountmsg.getText());
	}

	@When("Enter Withdarwal OTP as {string}")
	public void enter_withdarwal_otp_as(String WOTP) throws Exception {
	    dw.EnterWithdrawalOTP(WOTP);
	    Thread.sleep(1000);
	}

	@When("Click on Verify withdrawal OTP")
	public void click_on_verify_withdrawal_otp() throws Exception {
	    dw.Clickverifybtn();
	    Thread.sleep(1000);
	    
	}

	@Then("Validate the Withdrawal Error toast message as {string}")
	public void validate_the_withdrawal_error_toast_message_as(String errortoasts) {
		WebElement errortoast = driver.findElement(By.xpath("//div[text()='Invalid OTP.']"));
		assertTrue(errortoast.isDisplayed());
		assertEquals("Invalid OTP.", errortoast.getText());
	}

	@Then("Validate the Withdrawal Error validation message as {string}")
	public void validate_the_withdrawal_error_validation_message_as(String errorvalidation) {
		WebElement validationerror = driver.findElement(By.xpath("//p[text()='OTP should contain only numbers.']"));
		assertTrue(validationerror.isDisplayed());
		assertEquals("OTP should contain only numbers.", validationerror.getText());
	}

	@When("Click Resend OTP button on Withdrawal Section")
	public void click_resend_otp_button_on_withdrawal_section() throws Exception {
		dw.resend();
		Thread.sleep(200);
	}

	@Then("Validate the Withdrawal resent OTP success toast message as {string}")
	public void validate_the_withdrawal_resent_otp_success_toast_message_as(String resenttoast) {
		WebElement resentotp = driver.findElement(By.xpath("//div[text()='OTP sent successfully.']"));
		assertTrue(resentotp.isDisplayed());
		assertEquals("OTP sent successfully.", resentotp.getText());
	}

	@Then("Validate the Withdrawal success toast message as {string}")
	public void validate_the_withdrawal_success_toast_message_as(String successotp) {
//		WebElement otpsuccess = driver.findElement(By.xpath("//div[text()='OTP verified successfully.']"));
//		assertTrue(otpsuccess.isDisplayed());
//		assertEquals("OTP verified successfully.", otpsuccess.getText());
		
		String OTPsuccess = driver.findElement(By.xpath("//div[text()='OTP verified successfully.']")).getText();
		System.out.println(OTPsuccess);
		if(OTPsuccess.equals("OTP verified successfully.")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
	}

	@Then("Click submit button of the bank details page")
	public void click_submit_button_of_the_bank_details_page() throws Exception {
	   dw.submitbtn();
	   Thread.sleep(2000);
	}

	@Then("Validate the bank deatils error validation message for account name as {string}, account number as {string} and Select bank as {string}")
	public void validate_the_bank_deatils_error_validation_message_for_account_name_as_account_number_as_and_select_bank_as(String acname, String acnum, String bank) {
		WebElement accountname = driver.findElement(By.xpath("//p[text()='Account name is required']"));
		assertTrue(accountname.isDisplayed());
		assertEquals("Account name is required", accountname.getText());
		
		WebElement accountnumber = driver.findElement(By.xpath("//p[text()=' Account number is required']"));
		assertTrue(accountnumber.isDisplayed());
		assertEquals(""+"Account number is required", accountnumber.getText());
		
		WebElement bankmsg = driver.findElement(By.xpath("//p[text()='Bank is required']"));
		assertTrue(bankmsg.isDisplayed());
		assertEquals("Bank is required", bankmsg.getText());
	}

	@When("Enter the account name as {string}")
	public void enter_the_account_name_as(String acname) throws Exception {
	    dw.txtaccountname(acname);
	    Thread.sleep(500);
	}

	@Then("Validate the account name error validation message as {string}")
	public void validate_the_account_name_error_validation_message_as(String acnameerror) {
		WebElement acnameeror = driver.findElement(By.xpath("//p[text()='Only alphabetic characters are allowed']"));
		assertTrue(acnameeror.isDisplayed());
		assertEquals("Only alphabetic characters are allowed", acnameeror.getText());
	}

	@When("Enter the account number as {string}")
	public void enter_the_account_number_as(String acnum) throws Exception {
	    dw.txtaccountnumer(acnum);
	    Thread.sleep(500);
	}

	@Then("Validate the min account number error validation message as {string}")
	public void validate_the_min_account_number_error_validation_message_as(String acnumerror) {
		WebElement acnumeror = driver.findElement(By.xpath("//p[text()='Account number should have atleast 8 digits']"));
		assertTrue(acnumeror.isDisplayed());
		assertEquals("Account number should have atleast 8 digits", acnumeror.getText());
	}

	@When("Enter the max account number as {string}")
	public void enter_the_max_account_number_as(String acnum) throws Exception {
		   dw.txtaccountnumer(acnum);
		    Thread.sleep(500);
	}

	@Then("Validate the max account number error validation message as {string}")
	public void validate_the_max_account_number_error_validation_message_as(String string) {
		WebElement acnumeror = driver.findElement(By.xpath("//p[text()='Account number should have atleast 18 digits']"));
		assertTrue(acnumeror.isDisplayed());
		assertEquals("Account number should have atleast 18 digits", acnumeror.getText());
	}

	@When("Select the bank as {string}")
	public void select_the_bank_as(String bankselect) throws Exception {
	   dw.SelectBank();
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//li[@data-value='96e41186-29ba-4e30-b013-2ca36d7e7025']")).click();
	   
	}

	@Then("validate the redirection url as {string}")
	public void validate_the_redirection_url_as( String url) throws Exception {
		Thread.sleep(1000);
		
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/user/Transactions")) {
			System.out.println("Withdrawal success");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("Withdrawal not placed");
			Assert.assertTrue(false);
		}
	}

	@Then("verify the santim Withdrawal URL as {string}")
	public void verify_the_santim_withdrawal_url_as(String string) {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/user/paymentrequest/santimpay_withdraw")) {
			System.out.println("santim Withdraw page displayed");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("santim Withdraw page not dispayed");
			Assert.assertTrue(false);
		}
	}

	@When("Click on the santim withdrawal")
	public void click_on_the_santim_withdrawal() throws Exception {
	    dw.santimWithdrawal();
	    Thread.sleep(2000);
	}

	@When("Click santim page withdraw button")
	public void click_santim_page_withdraw_button() throws Exception {
		 dw.SantimWithdrawbtn();
		    Thread.sleep(2000);
	}

	@Then("Verify the santim withdrawal request amount validation message")
	public void verify_the_santim_withdrawal_request_amount_validation_message() throws Exception {
		String toastmessage = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div")).getText();
		System.out.println(toastmessage);
		String mainbalance = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div[1]/div[2]/div/div/div/form/div/p/span")).getText();
		System.out.println(mainbalance);
		Thread.sleep(500);
		String validatemsg = "Withdraw amount must be between 10 ETB and less than " + mainbalance;
		if(validatemsg.equals(toastmessage)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

	@Then("Verify the santim withdrawal request amount validation error message as {string}")
	public void verify_the_santim_withdrawal_request_amount_validation_error_message_as(String numvalidation) {
		WebElement numerror = driver.findElement(By.xpath("//p[text()='Minimum 9 digits allowed']"));
		assertTrue(numerror.isDisplayed());
		assertEquals("Minimum 9 digits allowed", numerror.getText());
	}

	@Then("Validate the santim Withdrawal Error toast message as {string}")
	public void validate_the_santim_withdrawal_error_toast_message_as(String invaliderror) {
		WebElement errorstoast = driver.findElement(By.xpath("//div[text()='Invalid OTP.']"));
		assertTrue(errorstoast.isDisplayed());
		assertEquals("Invalid OTP.", errorstoast.getText());
	}

	@Then("Validate the santim Withdrawal Error validation message as {string}")
	public void validate_the_santim_withdrawal_error_validation_message_as(String charerror) {
		WebElement validationerrors = driver.findElement(By.xpath("//p[text()='OTP should contain only numbers.']"));
		assertTrue(validationerrors.isDisplayed());
		assertEquals("OTP should contain only numbers.", validationerrors.getText());
	}

	@Then("Validate the santim Withdrawal OTP success toast message as {string}")
	public void validate_the_santim_withdrawal_otp_success_toast_message_as(String otpstoast) {
		WebElement resentotp = driver.findElement(By.xpath("//div[text()='OTP sent successfully.']"));
		assertTrue(resentotp.isDisplayed());
		assertEquals("OTP sent successfully.", resentotp.getText());
	}

	@Then("Validate the santim Withdrawal success toast message as {string}")
	public void validate_the_santim_withdrawal_success_toast_message_as(String stoast) {
		String OTPsuccess = driver.findElement(By.xpath("//div[text()='OTP verified successfully.']")).getText();
		System.out.println(OTPsuccess);
		if(OTPsuccess.equals("OTP verified successfully.")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

	@Then("Click submit button of the santim bank details page")
	public void click_submit_button_of_the_santim_bank_details_page() throws Exception {
	    dw.submitbtn();
	    Thread.sleep(1000);
	}

	@Then("Validate the bank deatils error validation message for Select bank as {string}")
	public void validate_the_bank_deatils_error_validation_message_for_select_bank_as(String bankerror) {
		WebElement bankmsg = driver.findElement(By.xpath("//p[text()='Bank is required']"));
		assertTrue(bankmsg.isDisplayed());
		assertEquals("Bank is required", bankmsg.getText());
	}
	@When("Select the santim bank as {string}")
	public void select_the_santim_bank_as(String bankselect) throws Exception {
	   dw.SelectBank();
	   Thread.sleep(500);
	   driver.findElement(By.xpath("//li[@data-value='telebirr']")).click();
	   
	}


//////////////////////////////////////////////////////////////////////// Transactions /////////////////////////////////////////////////////////////////////////////////////////////////////////


	@When("Click side transaction link")
	public void click_side_transaction_link() throws Exception {
		tr.Sidebarlink();
		Thread.sleep(1000);
	}

	@Then("Verify the transaction section is open as {string}")
	public void verify_the_transaction_section_is_open_as(String txnvalidation) {
		WebElement transactionvalidation = driver.findElement(By.xpath("//h6[text()='YOUR TRANSACTIONS']"));
		assertTrue(transactionvalidation.isDisplayed());
		assertEquals("YOUR TRANSACTIONS", transactionvalidation.getText());
	}

	@Then("Verify the transaction section displayed through pasting")
	public void verify_the_transaction_section_displayed_through_pasting() {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/")) {
			System.out.println("without login user is not redirect to transaction page");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("without login user is redirect to transaction page");
			Assert.assertTrue(false);
		}
	}

	@Then("verify the transaction page url as {string}")
	public void verify_the_transaction_page_url_as(String txnurl) {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/user/Transactions")) {
			System.out.println("transaction section matched");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("transaction section not matched");
			Assert.assertTrue(false);
		}
	}

	@When("Click amount header link")
	public void click_amount_header_link() throws Exception {
		tr.Headerlink();
		Thread.sleep(1000);
	}

	@Then("Verify the refresh icon visibility")
	public void verify_the_refresh_icon_visibility() throws Exception {
		WebElement refreshicon = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[1]/div[2]/div/div/div/div[1]/div/button"));
		if(refreshicon.isDisplayed()) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

	@Then("Verify the table heading")
	public void verify_the_table() {
		WebElement txnheadings = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[1]/div[2]/div/div/div/div[2]/table/thead/tr"));

		String heading = txnheadings.getText();
		System.out.println(heading);
		String expected = "DATE TYPE VALUE PAYMENT TYPE DESCRIPTION STATUS";
//		Assert.assertEquals(heading, expected, "Headings are displayed properly");
		if(heading.equals(expected)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

	@When("click on the Row per page dropdown")
	public void click_on_the_row_per_page_dropdown() throws Exception {
		tr.Rowperpage();
		Thread.sleep(1000);
	}

	@Then("Verify the number of row per page")
	public void verify_the_number_of_row_per_page() {
		By Tablerowlocator = By.xpath("//*[@id=\"root\"]/div[4]/div[1]/div[2]/div/div/div/div[2]/table/tbody");
		WebElement table = driver.findElement(Tablerowlocator);
		int numberofrows = table.findElements(By.tagName("tr")).size();
		System.out.println(numberofrows);
		int expectedrows = 10;
		Assert.assertEquals(numberofrows, expectedrows);
	}

	@When("click on the Row per page dropdown and select as {string}")
	public void click_on_the_row_per_page_dropdown_and_select_as(String RPP) throws Exception {
		tr.Rowperpage();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-value='25']")).click();
		
	}

	@Then("Verify the changes displayed in the row per page")
	public void verify_the_changes_displayed_in_the_row_per_page() {
		By Tablerowlocator = By.xpath("//*[@id=\"root\"]/div[4]/div[1]/div[2]/div/div/div/div[2]/table/tbody");
		WebElement table = driver.findElement(Tablerowlocator);
		int numberofrows = table.findElements(By.tagName("tr")).size();
		System.out.println(numberofrows);
		int expectedrows = 25;
		Assert.assertEquals(numberofrows, expectedrows);
	}


@When("Select the date")
public void select_the_date() throws Exception {

WebElement startdate = driver.findElement(By.xpath("//label[text()='Start Date']"));
startdate.click();
Thread.sleep(1000);
WebElement enterdate = startdate.findElement(By.xpath("//input[@inputmode='numeric']"));
enterdate.sendKeys("01022023", "02022023");
WebElement selectdate = enterdate.findElement(By.xpath("//button[text()='1']"));
selectdate.click();
//WebElement enddate = driver.findElement(By.xpath("//label[text()='End Date']"));
//WebElement enterenddate = enddate.isSelected();
//enterdate.sendKeys("01022022");
//selectdate.click();
//Thread.sleep(2000);
}

@When("Click transaction search button")
public void click_transaction_search_button() throws Exception {
   tr.searchbtn();
	Thread.sleep(500);
}

@Then("verify the data gets display between the date")
public void verify_the_data_gets_display_between_the_date() {
	String dateTimeStr = "2023-10-02T14:56:42";
    DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, formatter);

    // Extract only the date
    LocalDate date = localDateTime.toLocalDate();
    System.out.println("Date without Time: " + date);
}
	
	
	
	
	
	
	
	
	
	
	


//////////////////////////////////////////////////////////////////////////////// Tickets ////////////////////////////////////////////////////////////////////////////////////////////////////

	@When("Click side ticket link")
	public void click_side_ticket_link() throws Exception {
	   ti.sideticket();
	   Thread.sleep(1000);
	}
	
	@Then("Verify the ticket section is open as {string}")
	public void verify_the_ticket_section_is_open_as(String tktvalidation) {
		WebElement tktsvalidation = driver.findElement(By.xpath("//h6[text()='Tickets']"));
		assertTrue(tktsvalidation.isDisplayed());
		assertEquals("TICKETS", tktsvalidation.getText());
	}

	@Then("verify the ticket page url as {string}")
	public void verify_the_ticket_page_url_as(String tkturl) {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/user/Tickets")) {
			System.out.println("tickets section matched");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("tickets section not matched");
			Assert.assertTrue(false);
		}
	}
	
	
	@Then("Verify the ticket section displayed through pasting")
	public void verify_the_ticket_section_displayed_through_pasting() {
		if(driver.getCurrentUrl().equals("http://onlinegamblingtech.com/")) {
			System.out.println("Tickets section not displayed while pasting direct URL");
			Assert.assertTrue(true);  
		}
		else {
			System.out.println("Tickets section is displayed while pasting direct URL");
			Assert.assertTrue(false);
		}
	}

	@Then("Verify the ticket table headings")
	public void verify_the_ticket_table_headings() {
		WebElement txnheadings = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[1]/div[2]/div/div/div/div[2]/table/thead/tr"));
		// Capture the text of the toast message
		String heading = txnheadings.getText();
		System.out.println(heading);
		String expected = "DATE BET ID BET AMOUNT WIN TYPE STATUS";
		if(heading.equals(expected)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}

	@When("Click Bet id")
	public void click_bet_id() throws Exception {
	   ti.ticketclick();
	   Thread.sleep(1000);
	}

	@Then("verify the popup get displayed or not")
	public void verify_the_popup_get_displayed_or_not() {
	    WebElement tktpopup = driver.findElement(By.xpath("/html/body/div[2]/div[3]"));
	    if(tktpopup.isDisplayed()) {
	    	System.out.println("displayed");
	    	Assert.assertTrue(true);
	    }
	    else {
	    	System.out.println("not Diplsyed");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("Verify the ticket number row per page")
	public void verify_the_ticket_number_row_per_page() {
		By Tablerowlocator = By.xpath("//*[@id=\"root\"]/div[4]/div[1]/div[2]/div/div/div/div[2]/table/tbody");
		WebElement table = driver.findElement(Tablerowlocator);
		int numberofrows = table.findElements(By.tagName("tr")).size();
		System.out.println(numberofrows);
		int expectedrows = 10;
		Assert.assertEquals(numberofrows, expectedrows);
	}

	@Then("Verify the changes displayed in the ticket row per page")
	public void verify_the_changes_displayed_in_the_ticket_row_per_page() {
		By Tablerowlocator = By.xpath("//*[@id=\"root\"]/div[4]/div[1]/div[2]/div/div/div/div[2]/table/tbody");
		WebElement table = driver.findElement(Tablerowlocator);
		int numberofrows = table.findElements(By.tagName("tr")).size();
		System.out.println(numberofrows);
		int expectedrows = 25;
		Assert.assertEquals(numberofrows, expectedrows);
	}

	@When("click on the ticket Row per page dropdown and select as {string}")
	public void click_on_the_ticket_row_per_page_dropdown_and_select_as(String tRPP) throws Exception {
		ti.trpp();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-value='25']")).click();
		
	}



























}

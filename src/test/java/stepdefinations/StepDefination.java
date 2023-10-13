package stepdefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ForgotPassword;
import pageObject.Login;
import pageObject.Profile;
import pageObject.Registration;

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
		driver.close();
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
		Thread.sleep(1000);

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
	public void user_enter_username_as_password_as(String username, String password) {
		lg.uname(username);
		lg.pwd(password);

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
	   Thread.sleep(2000);
	}

	@Then("Verify the profile url as {string}")
	public void verify_the_profile_url_as(String string) {
	  
	}

	@Then("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify the profile page displayed")
	public void verify_the_profile_page_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Profile name match with the expected username as {string}")
	public void profile_name_match_with_the_expected_username_as(String expectedusername) {
	  
	}

	@Then("Click Update profile button")
	public void click_update_profile_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify the error message displayed as {string}")
	public void verify_the_error_message_displayed_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Add Address as {string} Enter Password as {string}")
	public void add_address_as_enter_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the success profile update toast message as {string}")
	public void verify_the_success_profile_update_toast_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter Firstname as {string} Lastname as {string} Address as {string} Enter Password as {string}")
	public void enter_firstname_as_lastname_as_address_as_enter_password_as(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the update profile update toast message as {string}")
	public void verify_the_update_profile_update_toast_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter Firstname as {string} Lastname as {string} Address as {string}")
	public void enter_firstname_as_lastname_as_address_as(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the password error validation message as {string}")
	public void verify_the_password_error_validation_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Enter invalid old password as {string}")
	public void enter_invalid_old_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the invalid profile toast message as {string}")
	public void verify_the_invalid_profile_toast_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("enter old password as {string}")
	public void enter_old_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("verify the validation error password message as {string}")
	public void verify_the_validation_error_password_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("enter Old password as {string} and New password as {string}")
	public void enter_old_password_as_and_new_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Verify the password success toast message as {string}")
	public void verify_the_password_success_toast_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}













































}

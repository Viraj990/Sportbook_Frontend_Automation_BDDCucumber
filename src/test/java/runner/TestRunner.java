package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {
//				"C:\\Users\\Admin\\eclipse-workspace\\iGuru_BETINPRIME_Website_BDD_framework\\Feature\\iGuru_Sportbook_TC_Register.feature",
//				"C:\\Users\\Admin\\eclipse-workspace\\iGuru_BETINPRIME_Website_BDD_framework\\Feature\\iGuru_Sportbook_TC_Login.feature",
//				"C:\\Users\\Admin\\eclipse-workspace\\iGuru_BETINPRIME_Website_BDD_framework\\Feature\\iGuru_Sportbook_TC_ForgotPassword.feature",
//				"C:\\Users\\Admin\\eclipse-workspace\\iGuru_BETINPRIME_Website_BDD_framework\\Feature\\iGuru_Sportbook_TC_Profile.feature",
				"C:\\Users\\Admin\\eclipse-workspace\\iGuru_BETINPRIME_Website_BDD_framework\\Feature\\iGuru_Sportbook_TC_Deposit_Withdrawal.feature",
//				"C:\\Users\\Admin\\eclipse-workspace\\iGuru_BETINPRIME_Website_BDD_framework\\Feature\\iGuru_Sportbook_TC_Transaction.feature",
//				"C:\\Users\\Admin\\eclipse-workspace\\iGuru_BETINPRIME_Website_BDD_framework\\Feature\\iGuru_Sportbook_TC_Ticket.feature"
		},
		glue = "stepdefinations",
		dryRun =  false,
		monochrome =  true,
		publish = true
		)
public class TestRunner {

}

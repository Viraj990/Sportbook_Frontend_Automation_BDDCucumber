package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {
				"C:\\Users\\Admin\\eclipse-workspace\\iGuru_BETINPRIME_Website_BDD_framework\\Feature\\Register.feature",
				"C:\\Users\\Admin\\eclipse-workspace\\iGuru_BETINPRIME_Website_BDD_framework\\Feature\\Login.feature",
				"C:\\Users\\Admin\\eclipse-workspace\\iGuru_BETINPRIME_Website_BDD_framework\\Feature\\ForgotPassword.feature"
				
		},
		glue = "stepdefinations",
		dryRun =  false,
		monochrome =  true,
		publish = true
		)
public class TestRunner {

}

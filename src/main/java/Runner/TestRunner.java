package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/user/workspace/ebayTechnicalTest/src/main/java/Features"
		,glue = {"stepDefinition"}
		,format = {"pretty", "html:target/test-output"}
		,dryRun = false
		)

public class TestRunner {
	
}

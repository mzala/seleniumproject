package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/user/workspace/ebayTechnicalTest/src/main/java/Features"
		,glue = {"stepDefinition"}
		,plugin = {"html:src/main/java/Util/test-output-report"}
		,format = {"pretty"}
		,dryRun = false
		)

public class TestRunner {
	
}

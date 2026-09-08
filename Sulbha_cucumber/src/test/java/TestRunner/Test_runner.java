package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = { "./feature/Login.feature" },

glue = { "StepDefinition", "AppUtils" }, 

dryRun = false,

		plugin = { 
			"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			

		},
		tags = " @sanity or @smoke"
)
public class Test_runner extends AbstractTestNGCucumberTests {

}

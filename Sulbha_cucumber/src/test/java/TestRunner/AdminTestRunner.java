package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"./feature/Admin.feature"},
		glue= {"StepDefinition","AppUtils"},
		dryRun=false,
		
		plugin	={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		          
		
		},
		
		
		tags="@sanity"
		
		)


public class AdminTestRunner extends AbstractTestNGCucumberTests {

}

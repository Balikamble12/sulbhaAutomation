package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "./Feature/Leave.feature" },

		glue = { "StepDefinition", "AppUtils" },

		dryRun = false,

		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },

		tags = "@leave")

public class LeaveRunner {

}
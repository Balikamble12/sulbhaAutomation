package StepDefinition;

import org.openqa.selenium.WebDriver;

import AppUtils.Hooks;
import PageObjectModule.Leave_Module;
import io.cucumber.java.en.Given;

public class Leave_stepdefinition {
	WebDriver driver;
	Leave_Module lm;
	@Given("user click on Leave")
	public void user_click_on_leave() {
	   driver= Hooks.driver;
	   lm= new Leave_Module(driver);
	   lm.UserClickOnLeave();
	}
	


@Given("user select starting leave date")
public void user_select_starting_leave_date() throws InterruptedException {
    lm.userSelectStartLeaveDate();
}
@Given("user select ending leave date")
  public void user_select_ending_leave_date() throws InterruptedException {
    lm.UserSelectLeaveEndMonth1date();
}
	
}

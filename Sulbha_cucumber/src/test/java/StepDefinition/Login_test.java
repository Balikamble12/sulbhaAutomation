package StepDefinition;

import org.openqa.selenium.WebDriver;

import AppUtils.Hooks;
import PageObject.Login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_test {

	WebDriver driver;
	Login_page lp;

	@Given("user browse the application")
	public void user_browse_the_application() throws InterruptedException {

		driver = Hooks.driver;

		lp = new Login_page(driver);
		
		lp.logout();
		
		
		Thread.sleep(4000);
	}

	@Given("user enters username")
	public void user_enters_username() throws InterruptedException {
		
		lp.enterUsername("admin");
	}

	@Then("user enters password")
	public void user_enters_password() {

		lp.enterPassword("Qedge123!@#");
	}

	@Then("user click on submit")
	public void user_click_on_submit() throws InterruptedException {

		lp.clickLogin();
	}

	@Given("user enters username {string}")
	public void user_enters_username(String username) {

		lp.enterUsername(username);
	}

	@Then("user enters password {string}")
	public void user_enters_password(String password) {

		lp.enterPassword(password);
	}
}

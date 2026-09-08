package StepDefinition;

import org.openqa.selenium.WebDriver;

import AppUtils.Hooks;
import PageObject.Admin;
import PageObject.Login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Admin_module {


	    WebDriver driver;
	   
	    Admin Ad;



	    @Given("user click on Admin module")
	    public void user_click_on_admin_module() throws InterruptedException {

	    	   driver = Hooks.driver;
		        Ad = new Admin(driver);
		        
		        
	        Ad.clickAdminModule();
	    }


	    @Given("user enter system username as {string}")
	    public void user_enter_system_username_as(String username) {

	        Ad.enterSystemUsername(username);
	    }


	    @Then("user select user role as {string}")
	    public void user_select_user_role_as(String role) throws InterruptedException {

	        Ad.selectUserRole(role);
	    }


	    @Then("user enter emp name as {string}")
	    public void user_enter_emp_name_as(String empname) {

	        Ad.enterEmployeeName(empname);
	    }


	    
	    @Then("user select status as {string}")
	    public void user_select_status_as(String userstatus) {

	        Ad.selectStatus(userstatus);
	    }


	    @Then("user click on Search button")
	    public void user_click_on_search_button() throws InterruptedException {

	        Ad.clickSearch();
	    }
	}



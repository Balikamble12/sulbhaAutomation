package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	WebDriver driver;

	@FindBy(id = "txtUsername")
	WebElement username;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement loginButton;

	@FindBy(id = "welcome")
	WebElement clickWelcome;

	@FindBy(linkText = "Logout")
	WebElement logoutButton;

	public Login_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String usernameValue) {
		username.clear();
		username.sendKeys(usernameValue);
	}

	public void enterPassword(String passwordValue) {
		password.clear();
		password.sendKeys(passwordValue);
	}

	public void clickLogin() throws InterruptedException {
		loginButton.click();
		Thread.sleep(2000);
	}

	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		clickWelcome.click();
		logoutButton.click();
		Thread.sleep(2000);
	}
}

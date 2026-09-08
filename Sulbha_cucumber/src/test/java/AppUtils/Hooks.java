package AppUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Login_page;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static WebDriver driver;

	Readconfig config = new Readconfig();

	@Before
	public void Launchapp() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(config.Geturl());

		// Login before starting the scenario
		Login_page lp = new Login_page(driver);

		lp.enterUsername(config.getUsername());
		lp.enterPassword(config.password());
		lp.clickLogin(
				);
	}

	@After
	public void Logoutapp() {

		if (driver != null) {
			driver.quit();
		}
	}
}

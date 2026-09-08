package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AppUtils.Baseclass;
import AppUtils.Readconfig;

public class Admin {
    WebDriver driver;
    Readconfig config = new Readconfig();

    // Login page elements
    @FindBy(id = "txtUsername")
    WebElement username;

    @FindBy(id = "txtPassword")
    WebElement password;

    @FindBy(id = "btnLogin")
    WebElement loginButton;

    // Admin module
    @FindBy(linkText = "Admin")
    WebElement adminModule;

    // Admin > User Management
    @FindBy(id = "searchSystemUser_userName")
    WebElement systemUsername;

    @FindBy(id = "searchSystemUser_userType")
    WebElement userRole;

    @FindBy(id = "searchSystemUser_employeeName_empName")
    WebElement employeeName;

    @FindBy(id = "searchSystemUser_status")
    WebElement status;

    @FindBy(id = "searchBtn")
    WebElement searchButton;


    // Constructor
    public Admin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // Login methods

    public void enterUsername() {
        username.sendKeys(config.getUsername());
    }

    public void enterPassword() {
        password.sendKeys("Qedge123!@#");
    }

    public void clickLogin() {
        loginButton.click();
    }


    // Admin module methods

    public void clickAdminModule() throws InterruptedException {
        adminModule.click();
        Thread.sleep(2000);
    }

    public void enterSystemUsername(String username) {
        systemUsername.sendKeys(username);
    }

    public void selectUserRole(String role) throws InterruptedException {
        Baseclass.dropdown(userRole, role);
        Thread.sleep(2000);
    }

    public void enterEmployeeName(String employee) {
        employeeName.sendKeys(employee);
    }

    public void selectStatus(String statusValue) {
        Baseclass.dropdown(status, statusValue);
    }

    public void clickSearch() throws InterruptedException {
        searchButton.click();
        Thread.sleep(4000);
    }
}

package PageObjectModule;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import AppUtils.Baseclass;

import org.openqa.selenium.By;

public class Leave_Module {
	WebDriver driver;
	Baseclass bs= new Baseclass();

	@FindBy(linkText = "Leave")
	WebElement leavebutton;
	
	@FindBy(className = "ui-datepicker-month")
	WebElement SelectMonth;
	
	@FindBy(className = "ui-datepicker-year")
	WebElement calyear;
	
	@FindBy(className = "ui-datepicker-calendar")
	WebElement Table;

	@FindBy(id = "calFromDate")
	WebElement CalenderLeaveStartDate;

	@FindBy(linkText = "Next")
	WebElement NextButton;

	
  @FindBy(tagName = "tr")
	List<WebElement> rows;

	@FindBy(tagName = "td")
	List<WebElement> columns;
	
	@FindBy(name="leaveList[calToDate]")
	WebElement calenderleaveEndDateTtextbox;
	
	@FindBy(xpath = "//select[contains(@data-handler,\"selectMonth\")]")
	WebElement SelectLeaveEndMonthDate;

	public Leave_Module(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

	public void UserClickOnLeave() {
		leavebutton.click();
	}

	public void userSelectStartLeaveDate() throws InterruptedException {
	CalenderLeaveStartDate.click();
	
	bs.DropdownText(SelectMonth, "Oct");
	bs.Dropdownvalue("2028", calyear);
	
	WebElement entireTable= Table;
	List<WebElement> rows= entireTable.findElements(By.tagName("tr"));
	
	for(int i=1; i<rows.size(); i++)
	{
		List<WebElement> columns= rows.get(i).findElements(By.tagName("td"));
		
		for(int j=0; j<columns.size(); j++)
		{
			String dt=columns.get(j).getText();
			
			if(dt.equals("18"))
			{
				columns.get(i).click();
				Thread.sleep(2000);
			}
		}
		}
	}
	
	
	
	public void userSelectEndLeaveDate() throws InterruptedException {
		
		calenderleaveEndDateTtextbox.click();
		Thread.sleep(2000);
		
		}
	public void UserSelectLeaveEndMonth1date() {
	bs.DropdownText(SelectLeaveEndMonthDate, "Oct");
	}
	
}

	
	
	
		
	


		




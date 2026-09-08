package AppUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static void dropdown(WebElement path, String text) {
		Select drpdwn= new Select(path);
		drpdwn.selectByVisibleText(text);
		
	}
	public static void dropdown(WebElement path,int index) {
	Select drpdwn= new Select(path);
	drpdwn.selectByIndex(index);}
	
	public static void dropdown(String value, WebElement path) {
	Select drpdwn=new Select(path);
	drpdwn.selectByValue(value);
	}

}

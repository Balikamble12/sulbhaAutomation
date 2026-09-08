package AppUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;

	public Readconfig() {
		try {
			FileInputStream fis = new FileInputStream("./config/config.properties");
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {
			e.getMessage();
		}

	}

	public String Geturl() {
		return pro.getProperty("url");
	}

	public String getUsername() {
		return pro.getProperty("username");
	}
	public String password() {
		return pro.getProperty("password");
	}

}
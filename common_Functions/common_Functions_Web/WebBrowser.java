package common_Functions_Web;

import org.openqa.selenium.WebDriver;

public class WebBrowser {
	/*
	 * Purpose - As a user, I want to validate my page title.
	 * Input Parameter :- WebDriver, String
	 * Return type :- String
	 */
	public static boolean verifyTitle(WebDriver driver, String title) {
		boolean titleMatch = false;
		if(driver.getTitle().equals(title)) {
			titleMatch = true;
		}
		return titleMatch;
	}

}

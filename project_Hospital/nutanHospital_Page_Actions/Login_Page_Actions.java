package nutanHospital_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import common_Functions_Web.WebButton;
import common_Functions_Web.WebTextBox;
import nutanHospital_Page_Locators.Login_Page_Locators;

public class Login_Page_Actions {
	public WebDriver driver = null;
	public ExtentTest logger;
	Login_Page_Locators loginPL = null;
	
	public Login_Page_Actions(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		loginPL = new Login_Page_Locators(driver);
	}
	/*
	 * Purpose:- As a user I want to enter the text in text box.
	 * Input param:- String
	 * Return type:- none
	 */
	public void enterUserName(String userValue) {
		WebTextBox.sendInput(loginPL.getUserName(), userValue, logger, "Username");
	}
	/*
	 * Purpose:- As a user I want to enter the text in text box.
	 * Input param:- String
	 * Return type:- none
	 */
	public void enterPassword(String passwordValue) {
		WebTextBox.sendInput(loginPL.getPassword(), passwordValue, logger, "Password");
	}
	/*
	 * Purpose:- As a user I want to click on login button.
	 * Input param:- none
	 * Return type:- none
	 */
	public void clickLoginButton() {
		WebButton.clickButton(loginPL.getLoginButton(), logger, "Login");
	}
	/*
	 * Purpose:- As a user I want to login into my system without password.
	 * Input param:- String
	 * Return type:- none
	 */
	public void loginWithoutUser(String passswordValue) {
		enterUserName(passswordValue);
		clickLoginButton();
	}
	/*
	 * Purpose:- As a user I want to login into my system without user.
	 * Input param:- String
	 * Return type:- none
	 */
	public void loginWithoutPassword(String userValue) {
		enterPassword(userValue);
		clickLoginButton();
	}
	/*
	 * Purpose:- As a user I want to login successfully into my system.
	 * Input param:- String
	 * Return type:- none
	 */
	public void successfullLogin(String userValue, String passswordValue) {
		enterUserName(userValue);
		enterPassword(passswordValue);
		clickLoginButton();
	}

}

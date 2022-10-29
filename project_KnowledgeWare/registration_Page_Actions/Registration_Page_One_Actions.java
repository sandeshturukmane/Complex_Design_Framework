package registration_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import common_Functions_Web.WebButton;
import common_Functions_Web.WebTextBox;
import registration_Page_Locator.Registration_Page_One_Locators;

public class Registration_Page_One_Actions {
	public WebDriver driver = null;
	public ExtentTest logger;
	Registration_Page_One_Locators regPageOneL = null;
	
	public Registration_Page_One_Actions(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		regPageOneL = new Registration_Page_One_Locators(driver);
	}
	public void enterUserName(String userValue) {
		WebTextBox.sendInput(regPageOneL.getUserName(), userValue, logger, "Username");
	}
	public void enterPassword(String passwordValue) {
		WebTextBox.sendInput(regPageOneL.getPassword(), passwordValue, logger, "Password");
	}
	public void enterConfirmPassword(String confirmPasswordValue) {
		WebTextBox.sendInput(regPageOneL.getConfirmPassword(), confirmPasswordValue, logger, "Confirm password");
	}
	public void clickLoginButton() {
		WebButton.clickButton(regPageOneL.getLoginButton(), logger, "Login");
	}
	public void registerPageOneDetails(String userValue, String passwordValue, String confirmPasswordValue) {
		enterUserName(userValue);
		enterPassword(passwordValue);
		enterConfirmPassword(confirmPasswordValue);
		clickLoginButton();
	}

}

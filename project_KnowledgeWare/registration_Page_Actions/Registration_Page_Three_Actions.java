package registration_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import common_Functions_Web.WebButton;
import common_Functions_Web.WebDropdown;
import common_Functions_Web.WebTextBox;
import registration_Page_Locator.Registration_Page_Three_Locators;

public class Registration_Page_Three_Actions {
	public WebDriver driver = null;
	public ExtentTest logger;
	Registration_Page_Three_Locators regPageThreeL = null;
	
	public Registration_Page_Three_Actions(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		regPageThreeL = new Registration_Page_Three_Locators(driver);
	}
	public void enterAddress(String addressValue) {
		WebTextBox.sendInput(regPageThreeL.getAddress(), addressValue, logger, "Address");
	}
	public void enterCity(String cityValue) {
		WebTextBox.sendInput(regPageThreeL.getCity(), cityValue, logger, "City name");
	}
	public void enterPin(String pinValue) {
		WebTextBox.sendInput(regPageThreeL.getPin(), pinValue, logger, "Pin code");
	}
	public void enterState(String stateValue) {
		WebTextBox.sendInput(regPageThreeL.getState(), stateValue, logger, "State");
	}
	public void selectCountry(String countryValue) {
		WebDropdown.selectDropDownByVisibleText(regPageThreeL.getIndia(), countryValue, logger, "Country");
	}
	public void clickNext() {
		WebButton.clickButton(regPageThreeL.getNextButton(), logger, "Next");
	}
	public void registerPageThreeDetails(String addressValue, String cityValue, String pinValue, String stateValue) {
		enterAddress(addressValue);
		enterCity(cityValue);
		enterPin(pinValue);
		enterState(pinValue);
		enterState(stateValue);
		//selectCountry(countryValue);
		clickNext();
	}
	
}

package registration_Page_Actions;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import common_Functions_Web.WebButton;
import common_Functions_Web.WebDropdown;
import common_Functions_Web.WebRadioButton;
import common_Functions_Web.WebTextBox;
import registration_Page_Locator.Registration_Page_Two_Locators;

public class Registration_Page_Two_Actions {
	public WebDriver driver = null;
	public ExtentTest logger;
	Registration_Page_Two_Locators regPageTwoL = null;
	
	public Registration_Page_Two_Actions(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		regPageTwoL = new Registration_Page_Two_Locators(driver);
	}
	public void enterFirstName(String firstNameValue) {
		WebTextBox.sendInput(regPageTwoL.getFirstName(), firstNameValue, logger, "Firstname");
	}
	public void enterLastName(String lastNameValue) {
		WebTextBox.sendInput(regPageTwoL.getLastName(), lastNameValue, logger, "Lastname");
	}
	public void selectBirthDay(String birthDateValue) {
		WebDropdown.selectDropDownByValue(regPageTwoL.getBDay(), birthDateValue, logger, "Birth date");
	}
	public void selectBirthMonth(String birthMonthValue) {
		WebDropdown.selectDropDownByVisibleText(regPageTwoL.getBMonth(), birthMonthValue, logger, "Birth month");
	}
	public void selectBirthYear(String birthYearValue) {
		WebDropdown.selectDropDownByVisibleText(regPageTwoL.getBYear(), birthYearValue, logger, "Birth year");
	}
	public void enterEmailID(String emailIDValue) {
		WebTextBox.sendInput(regPageTwoL.getEmailID(), emailIDValue, logger, "EmailID");
	}
	public void enterMobileNumber(String mobileNumberValue) {
		WebTextBox.sendInput(regPageTwoL.getMobileNumber(), mobileNumberValue, logger, "Mobile number");
	}
	public void selectMale() {
		WebRadioButton.clickRadioButton(regPageTwoL.getMale(), logger, "Male");
	}
	public void clickNext() {
		WebButton.clickButton(regPageTwoL.getNextButton(), logger, "Next");
	}
	public void registerPageTwoDetails(String firstNameValue, String lastNameValue, String birthDateValue, String birthMonthValue,
			                           String birthYearValue, String emailIDValue, String mobileNumberValue) {
		enterFirstName(firstNameValue);
		enterLastName(lastNameValue);
		selectBirthDay(birthDateValue);
		selectBirthMonth(birthMonthValue);
		selectBirthYear(birthYearValue);
		enterEmailID(emailIDValue);
		enterMobileNumber(mobileNumberValue);
		selectMale();
		clickNext();
	}

}

package nutanHospital_Page_Actions;

import org.openqa.selenium.WebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import common_Functions_Web.WebButton;
import common_Functions_Web.WebCheckBox;
import common_Functions_Web.WebTextBox;
import nutanHospital_Page_Locators.Dashboard_Doctor_Page_Locators;

public class Dashboard_Doctor_Page_Actions {
	public WebDriver driver = null;
	public ExtentTest logger;
	Dashboard_Doctor_Page_Locators DashDocPL = null;
	
	public Dashboard_Doctor_Page_Actions(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
		DashDocPL = new Dashboard_Doctor_Page_Locators(driver);
	}
	/*
	 * Purpose:- As a user I want to click on the web button (Doctor).
	 * Input param:- none
	 * Return type:- none
	 */
	public void clickDoctor() {
		WebButton.clickButton(DashDocPL.getDoctors(), logger, "Doctor");
	}
	/*
	 * Purpose:- As a user I want to enter the text in text box (Doctor Name).
	 * Input param:- String
	 * Return type:- none
	 */
	public void enterDoctorName(String nameValue) {
		WebTextBox.sendInput(DashDocPL.getDoctorsName(), nameValue, logger, "Doctor name");
	}
	/*
	 * Purpose:- As a user I want to enter the text in text box (Registration number).
	 * Input param:- String
	 * Return type:- none
	 */
	public void enterRegistration(String registrationNumber) {
		WebTextBox.sendInput(DashDocPL.getRegistration(), registrationNumber, logger, "Registration number");
	}
	/*
	 * Purpose:- As a user I want to enter the text in text box (Contact number).
	 * Input param:- String
	 * Return type:- none
	 */
	public void enterContact(String cantactNumber) {
		WebTextBox.sendInput(DashDocPL.getContact(), cantactNumber, logger, "Contact number");
	}
	/*
	 * Purpose:- As a user I want to enter the text in text box (Address).
	 * Input param:- String
	 * Return type:- none
	 */
	public void enterAddress(String addressValue) {
		WebTextBox.sendInput(DashDocPL.getAddress(), addressValue, logger, "Address");
	}
	/*
	 * Purpose:- As a user I want to enter the text in text box (Qualification).
	 * Input param:- String
	 * Return type:- none
	 */
	public void enterQualification(String qualificationValue) {
		WebTextBox.sendInput(DashDocPL.getQualification(), qualificationValue, logger, "Qualification");
	}
	/*
	 * Purpose:- As a user I want to enter the text in text box (Specialization).
	 * Input param:- String
	 * Return type:- none
	 */
	public void enterSpecialization(String specializationValue) {
		WebTextBox.sendInput(DashDocPL.getSpecialization(), specializationValue, logger, "Specialization");
	}
	/*
	 * Purpose:- As a user I want to enter the text in text box (Indoor fees).
	 * Input param:- String
	 * Return type:- none
	 */
	public void enterIndoorFees(String indoorFees) {
		WebTextBox.sendInput(DashDocPL.getIndoorFees(), indoorFees, logger, "Indoor fees");
	}
	/*
	 * Purpose:- As a user I want to enter the text in text box (Outdoor fees).
	 * Input param:- String
	 * Return type:- none
	 */
	public void enterOutdoorFees(String outdoorFees) {
		WebTextBox.sendInput(DashDocPL.getOutdoorFees(), outdoorFees, logger, "Outdoor fees");
	}
	/*
	 * Purpose:- As a user I want to enter the text in text box (Email).
	 * Input param:- String
	 * Return type:- none
	 */
	public void enterEmail(String email) {
		WebTextBox.sendInput(DashDocPL.getEmail(), email, logger, "EmailId");
	}
	/*
	 * Purpose:- As a user I want to click on the check box (Available).
	 * Input param:- none
	 * Return type:- none
	 */
	public void clickAvailable() {
		WebCheckBox.clickCheckBox(DashDocPL.getAvailable(), logger, "Available");
	}
	/*
	 * Purpose:- As a user I want to click on the check box (Is Visible).
	 * Input param:- none
	 * Return type:- none
	 */
	public void clickIsVisible() {
		WebCheckBox.clickCheckBox(DashDocPL.getIsVisible(), logger, "Is visible");
	}
	/*
	 * Purpose:- As a user I want to click on web button (add doctor).
	 * Input param:- none
	 * Return type:- none
	 */
	public void clickAddDoctor() {
		WebButton.clickButton(DashDocPL.getAddDoctor(), logger, "Add doctor");
	}
	public void dashDocPageDetails(String nameValue, String registrationNumber, String cantactNumber, String addressValue,
			                       String qualificationValue, String specializationValue, String indoorFees, String outdoorFees,
			                       String email) {
		
		clickDoctor();
		enterDoctorName(nameValue);
		enterRegistration(registrationNumber);
		enterContact(cantactNumber);
		enterAddress(addressValue);
		enterQualification(qualificationValue);
		enterSpecialization(specializationValue);
		enterIndoorFees(indoorFees);
		enterOutdoorFees(outdoorFees);
		enterEmail(email);
		clickAvailable();
		clickIsVisible();
		clickAddDoctor();
	}
}

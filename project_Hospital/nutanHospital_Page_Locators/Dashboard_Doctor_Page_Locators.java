package nutanHospital_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_Doctor_Page_Locators {
	public WebDriver driver = null;
	
	public Dashboard_Doctor_Page_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*
	 * Purpose:- This is a doctor WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(xpath = "//a[@href='/Doctor' and @class='small-box-footer']")
	private WebElement doctors;
	
	public WebElement getDoctors() {
		return doctors;
	}
	/*
	 * Purpose:- This is a doctor's name WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(name = "Name")
	private WebElement doctorsName;
	
	public WebElement getDoctorsName() {
		return doctorsName;
	}
	/*
	 * Purpose:- This is a registration WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(id = "Registration")
	private WebElement registration;
	
	public WebElement getRegistration() {
		return registration;
	}
	/*
	 * Purpose:- This is a contact WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(id = "Contact")
	private WebElement contact;
	
	public WebElement getContact() {
		return contact;
	}
	/*
	 * Purpose:- This is a address WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(name = "Address")
	private WebElement address;
	
	public WebElement getAddress() {
		return address;
	}
	/*
	 * Purpose:- This is a qualification WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(id = "Qualification")
	private WebElement qualification;
	
	public WebElement getQualification() {
		return qualification;
	}
	/*
	 * Purpose:- This is a specialization WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(id = "Specialization")
	private WebElement specialization;
	
	public WebElement getSpecialization() {
		return specialization;
	}
	/*
	 * Purpose:- This is a indoor fees WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(name = "Fees")
	private WebElement indoorFees;
	
	public WebElement getIndoorFees() {
		return indoorFees;
	}
	/*
	 * Purpose:- This is a outdoor fees WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(name = "OutdoorFees")
	private WebElement outdoorFees;
	
	public WebElement getOutdoorFees() {
		return outdoorFees;
	}
	/*
	 * Purpose:- This is a email WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(id = "Email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
	/*
	 * Purpose:- This is a available WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(id = "Available")
	private WebElement available;
	
	public WebElement getAvailable() {
		return available;
	}
	/*
	 * Purpose:- This is a visible in website WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(id = "IsVisible")
	private WebElement isVisible;
	
	public WebElement getIsVisible() {
		return isVisible;
	}
	/*
	 * Purpose:- This is a visible in website WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(xpath = "//input[@value='Add Doctor']")
	private WebElement addDoctor;
	
	public WebElement getAddDoctor() {
		return addDoctor;
	}

}

package registration_Page_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page_Two_Locators {
	public WebDriver driver = null;
	
	public Registration_Page_Two_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*
	 * Purpose :- This is a first name webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(name = "First_Name")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
	/*
	 * Purpose :- This is a last name webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(name = "Last_Name")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	/*
	 * Purpose :- This is a birth date webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(name = "Birthday_day")
	private WebElement bDay;
	
	public WebElement getBDay() {
		return bDay;
	}
	/*
	 * Purpose :- This is a birth month webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(name = "Birthday_Month")
	private WebElement bMonth;
	
	public WebElement getBMonth() {
		return bMonth;
	}
	/*
	 * Purpose :- This is a birth year webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(name = "Birthday_Year")
	private WebElement bYear;
	
	public WebElement getBYear() {
		return bYear;
	}
	/*
	 * Purpose :- This is a emailID webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(name = "Email_Id")
	private WebElement emailID;
	
	public WebElement getEmailID() {
		return emailID;
	}
	/*
	 * Purpose :- This is a mobile number webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(name = "Mobile_Number")
	private WebElement mobileNumber;
	
	public WebElement getMobileNumber() {
		return mobileNumber;
	}
	/*
	 * Purpose :- This is a gender webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(xpath = "//input[@value='Male']")
	private WebElement male;
	
	public WebElement getMale() {
		return male;
	}
	/*
	 * Purpose :- This is a next webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(linkText = "NEXT")
	private WebElement nextButton;
	
	public WebElement getNextButton() {
		return nextButton;
	}

}

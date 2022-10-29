package registration_Page_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page_Three_Locators {
	public WebDriver driver = null;
	
	public Registration_Page_Three_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/*
	 * Purpose :- This is a address webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */

	@FindBy(name = "Address")
	private WebElement address;
	
	public WebElement getAddress() {
		return address;
	}
	/*
	 * Purpose :- This is a city webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */

	@FindBy(name = "City")
	private WebElement city;
	
	public WebElement getCity() {
		return city;
	}
	/*
	 * Purpose :- This is a pin code webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */

	@FindBy(name = "Pin_Code")
	private WebElement pin;
	
	public WebElement getPin() {
		return pin;
	}
	/*
	 * Purpose :- This is a state webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */

	@FindBy(name = "State")
	private WebElement state;
	
	public WebElement getState() {
		return state;
	}
	/*
	 * Purpose :- This is a country webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */

	@FindBy(xpath = "/html/body/form/table/tbody/tr[5]/td[2]/select/option[102]")
	private WebElement india;
	
	public WebElement getIndia() {
		return india;
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

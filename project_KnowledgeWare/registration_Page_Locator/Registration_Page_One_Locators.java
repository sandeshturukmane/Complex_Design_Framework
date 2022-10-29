package registration_Page_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Page_One_Locators {
	public WebDriver driver = null;
	
	public Registration_Page_One_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	/*
	 * Purpose :- This is a username webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(name = "name")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}
	/*
	 * Purpose :- This is a password webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(name = "password")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	/*
	 * Purpose :- This is a confirm password webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(name = "confirmpassword")
	private WebElement confirmPassword;
	
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	/*
	 * Purpose :- This is a login webelement to perform action on it.
	 * Input parameter :- WebElement
	 * Return Type :- None
	 */
	@FindBy(linkText = "LOGIN")
	private WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}

}

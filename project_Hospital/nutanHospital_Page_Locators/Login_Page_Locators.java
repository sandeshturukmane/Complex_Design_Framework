package nutanHospital_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Locators {
	public WebDriver driver = null;
	
	public Login_Page_Locators(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*
	 * Purpose:- This is a user name WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(name ="Username") 
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}
	/*
	 * Purpose:- This is a password WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(name="Password")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	/*
	 * Purpose:- This is a login WebElement to perform action on it.
	 * Input param:- None
	 * return type:- WebElement
	 */
	@FindBy(xpath ="//input[@type='submit']")
	private WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}

}

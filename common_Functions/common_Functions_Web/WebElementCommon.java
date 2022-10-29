package common_Functions_Web;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebElementCommon {
	/*
	 * Purpose:- As a user I want to check whether the element is present in DOM.
	 * Input param:- WebElement
	 * Return type:- boolean
	 */
	public static boolean isPresent(WebElement element) {
		boolean isPresent = false;
		if(element.isDisplayed()) {
			isPresent = true;
		}
		return isPresent;
	}
	/*
	 * Purpose:- As a user I want to check whether the element is clickable or not.
	 * Input param:- WebElement
	 * Return type:- boolean
	 */
	public static boolean isClickable(WebElement element, ExtentTest logger, String fieldName) {
		boolean isClickable = false;
		if(isPresent(element)) {
			if(element.isEnabled()) {
				isClickable = true;
				logger.log(LogStatus.PASS, fieldName+ " field is present and clickable.");
			} else {
				logger.log(LogStatus.FAIL, fieldName+ " field is not present and not clickable.");
			}
		}
		return isClickable;
	}
	public static WebElement waitTillLoad(WebElement element) {
		return element;
	}
	// clear text box method overload here.
	public static boolean isClickable(WebElement textBox) {
		return false;
	}
	
}

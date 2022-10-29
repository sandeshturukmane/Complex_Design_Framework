package common_Functions_Web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebDropdown {
	/*
	 * Purpose:- As a user I want to select the dropdown by using index.
	 * Input param:- WebElement, integer
	 * Return type:- none
	 */
	public static void selectDropDownByIndex(WebElement dropDown, int index, ExtentTest logger, String fieldName) {
		if(WebElementCommon.isClickable(dropDown, logger, fieldName)) {
			Select dropdown = new Select(dropDown);
			dropdown.selectByIndex(index);
			logger.log(LogStatus.PASS, fieldName+ " dropdown selected successfully.");
		} else {
			logger.log(LogStatus.FAIL, fieldName+ " dropdown not selected.");
		}
	}
	/*
	 * Purpose:- As a user I want to select the dropdown by using value.
	 * Input param:- WebElement, String
	 * Return type:- none
	 */
	public static void selectDropDownByValue(WebElement dropDown, String value, ExtentTest logger, String fieldName) {
		if(WebElementCommon.isClickable(dropDown, logger, fieldName)) {
			Select dropdown = new Select(dropDown);
			dropdown.selectByValue(value);
			logger.log(LogStatus.PASS, fieldName+ " dropdown selected successfully.");
		} else {
			logger.log(LogStatus.FAIL, fieldName+ " dropdown not selected.");
		}
	}
	/*
	 * Purpose:- As a user I want to select the dropdown by using visible text.
	 * Input param:- WebElement, String
	 * Return type:- none
	 */
	public static void selectDropDownByVisibleText(WebElement dropDown, String visibleText, ExtentTest logger, String fieldName) {
		if(WebElementCommon.isClickable(dropDown, logger, fieldName)) {
			Select dropdown = new Select(dropDown);
			dropdown.selectByVisibleText(visibleText);
			logger.log(LogStatus.PASS, fieldName+ " dropdown selected successfully.");
		} else {
			logger.log(LogStatus.FAIL, fieldName+ " dropdown not selected.");
		}
	}

}

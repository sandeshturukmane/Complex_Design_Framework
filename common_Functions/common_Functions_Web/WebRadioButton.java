package common_Functions_Web;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebRadioButton {
	/*
	 * Purpose:- As a user I want to click on radio button.
	 * Input param:- WebElement
	 * Return type:- none
	 */
	public static void clickRadioButton(WebElement radioButton, ExtentTest logger, String fieldName) {
		if(WebElementCommon.isClickable(radioButton, logger, fieldName)) {
			radioButton.click();
			logger.log(LogStatus.PASS, fieldName+ " radio button selected successfully.");
		} else {
			logger.log(LogStatus.FAIL, fieldName+ " radio button not selected.");
		}
	}

}

package common_Functions_Web;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebButton {
	/*
	 * Purpose:- As a user I want to click on the web button.
	 * Input param:- WebElement
	 * Return type:- none
	 */
	public static void clickButton(WebElement button, ExtentTest logger, String fieldName) {
		if(WebElementCommon.isClickable(button, logger, fieldName)) {
			button.click();
			logger.log(LogStatus.PASS, fieldName + " button clicked successfully.");
		} else {
			logger.log(LogStatus.FAIL, fieldName + " button not clicked.");
		}
	}

}

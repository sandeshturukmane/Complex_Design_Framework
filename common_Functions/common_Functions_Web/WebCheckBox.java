package common_Functions_Web;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebCheckBox {
	/*
	 * Purpose:- As a user I want to click on the check box.
	 * Input param:- WebElement
	 * Return type:- none
	 */
	public static void clickCheckBox(WebElement checkBox, ExtentTest logger, String fieldName) {
		if(WebElementCommon.isClickable(checkBox, logger, fieldName)) {
			checkBox.click();
			logger.log(LogStatus.PASS, fieldName+ " check box selected successfully.");
		} else {
			logger.log(LogStatus.FAIL, fieldName+ " check box not selected.");
		}
	}

}

package common_Functions_Web;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebLink {
	/*
	 * Purpose:- As a user I want to click on the web link.
	 * Input param:- WebElement
	 * Return type:- none
	 */
	public static void clickLink(WebElement link, ExtentTest logger, String fieldName) {
		if(WebElementCommon.isClickable(link, logger, fieldName)) {
			link.click();
			logger.log(LogStatus.PASS, fieldName+ " link clicked successfully.");
		} else {
			logger.log(LogStatus.FAIL, fieldName+ " link not clicked.");
		}
	}

}

package common_Functions_Web;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class WebTextBox {
	/*
	 * Purpose:- As a user I want to enter a text into text box.
	 * Input parameter:- WebElement, String
	 * Return type:- none
	 */
	public static void sendInput(WebElement textBox, String text, ExtentTest logger, String fieldName) {
		if(WebElementCommon.isClickable(textBox, logger, fieldName)) {
			clearTextBox(textBox);
			textBox.sendKeys(text);
			logger.log(LogStatus.PASS, fieldName + " entered successfully.");
		} else {
			logger.log(LogStatus.FAIL, fieldName + " not entered.");
		}
	}
	/*
	 * Purpose:- As a user I want to clear the text from text box.
	 * Input parameter:- WebElement
	 * Return type:- none
	 */
	public static void clearTextBox(WebElement textBox) {
		if(WebElementCommon.isClickable(textBox)) {
			textBox.clear();
		}
	}
	

}

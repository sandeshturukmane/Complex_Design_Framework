package registration_Page_Tests;

import org.testng.annotations.Test;

import common_Functions_Web.WebBrowser;
import initializer_Components.BaseClass_Web;
import registration_Page_Actions.Registration_Page_One_Actions;
import registration_Page_Actions.Registration_Page_Three_Actions;
import registration_Page_Actions.Registration_Page_Two_Actions;

public class RegistrationProcess extends BaseClass_Web {
	
	@Test
	public void registrationProcess() {
		Registration_Page_One_Actions regPageOneA = new Registration_Page_One_Actions(driver, logger);
		regPageOneA.registerPageOneDetails("admin", "admin", "admin");
		if(WebBrowser.verifyTitle(driver, "Reg2")) {
			System.out.println("Successfully jump to second page.");
		Registration_Page_Two_Actions regPageTwoA = new Registration_Page_Two_Actions(driver, logger);
		regPageTwoA.registerPageTwoDetails("Sangharsh", "Turukmane", "20", "Jul", "2000", "sangha@123.com", "8381099845");
		if(WebBrowser.verifyTitle(driver, "Reg3")) {
			System.out.println("Successfully jump to third page.");
		Registration_Page_Three_Actions regPageThreeA = new Registration_Page_Three_Actions(driver, logger);
		regPageThreeA.registerPageThreeDetails("Pune", "Shivaji Nagar", "412220", "Maharashtra");
		if(WebBrowser.verifyTitle(driver, "Reg4")) {
			System.out.println("Successfully jump to fourth page.");
		}
		}
		}
	}

}

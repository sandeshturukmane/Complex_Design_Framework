package nutanHospital_Page_Tests;

import java.io.IOException;
import org.testng.annotations.Test;
import common_Functions_Web.Web_Common_Static_DM;
import data_Sources.JsonReader;
import data_Sources.PropertyReader;
import initializer_Components.BaseClass_Web;
import nutanHospital_Page_Actions.Dashboard_Doctor_Page_Actions;
import nutanHospital_Page_Actions.Login_Page_Actions;

public class Login_Page_Tests extends BaseClass_Web {
	public Login_Page_Actions loginPA = null;
	
	@Test(priority = 1)
	public void loginWithoutUser() {
		loginPA = new Login_Page_Actions(driver, logger);
		loginPA.loginWithoutUser(JsonReader.readJsonFileDynamic(Web_Common_Static_DM.Path+"NutanHospital/testData.json",
				"$..Nutan_Hospital.commonForProject.login.password", 0));
	}
	@Test(priority = 2)
	public void loginWithoutPassword() {
		loginPA = new Login_Page_Actions(driver, logger);
		loginPA.loginWithoutPassword(JsonReader.readJsonFileDynamic(Web_Common_Static_DM.Path+"NutanHospital/testData.json",
				"$..Nutan_Hospital.commonForProject.login.userName", 0));
		
	}
	@Test(priority = 3)
	public void successfullLogin() throws IOException {
		loginPA = new Login_Page_Actions(driver, logger);
		loginPA.successfullLogin(PropertyReader.getPropertyValue(Web_Common_Static_DM.Path+"NutanHospital/config.properties",
				                 "userName"),
				                 PropertyReader.getPropertyValue(Web_Common_Static_DM.Path+"NutanHospital/config.properties",
		                         "password"));
		Dashboard_Doctor_Page_Actions dashDocPageA = new Dashboard_Doctor_Page_Actions(driver, logger);
	     dashDocPageA.dashDocPageDetails("Sangharsh", "ABC123", "8381099845", "Pune", "MBBS", "Dentist", "100.00", "25.00", "sangha@123.com");	
	}
	
}

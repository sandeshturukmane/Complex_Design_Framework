package initializer_Components;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import common_Functions_Web.LocalDriverFactory;
import common_Functions_Web.Web_Common_Static_DM;
import data_Sources.JsonReader;
import data_Sources.PropertyReader;

public class BaseClass_Web {
	public static WebDriver driver = null;
	public static ExtentTest logger;
	public static ExtentReports graphicalReport;
	@BeforeSuite
	public void beforeSuiteStart(){
		graphicalReport = new ExtentReports(Web_Common_Static_DM.reportPath+"KnowledgeWare_Report/knowledgeWareReport.html", true);
	}
	
	@BeforeMethod
	public void beforeEachTest(Method testMethod) throws IOException {
		driver = LocalDriverFactory.setBrowser(PropertyReader.getPropertyValue(
				                               Web_Common_Static_DM.Path+"KnowledgeWare/config.properties", "browser"));
		driver.manage().window().maximize();
		driver.get(JsonReader.readJsonFileDynamic(Web_Common_Static_DM.Path+"KnowledgeWare/testData.json",
				                                  "$..KnowledgeWare.commonForProject.knowledgewareURL", 0));
		logger = graphicalReport.startTest(testMethod.getName());
		
	}
	@AfterMethod
	public void afterEachTest() {
		graphicalReport.endTest(logger);
		graphicalReport.flush();
		driver.close();
	}

}

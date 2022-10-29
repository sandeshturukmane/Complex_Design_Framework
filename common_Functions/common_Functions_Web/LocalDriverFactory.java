package common_Functions_Web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LocalDriverFactory extends Web_Common_Static_DM {
	public static WebDriver driver = null;
	/*
	 * This method return you the WebDriver of your choice.
	 * Input param:- String (browser name)
	 * Return type:- WebDriver
	 */
	public static WebDriver setBrowser(String browserName) {
		switch(browserName) {
		case "chrome":
			System.setProperty(chromeKey, driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty(firefoxKey, driverPath+"geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty(edgeKey, driverPath+"msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "safari":
			System.setProperty(safariKey, driverPath+"safaridriver.exe");
			driver = new SafariDriver();
			break;
		case "InternetExplorer":
			System.setProperty(IEKey, driverPath+"iedriverserver.exe");
			driver = new InternetExplorerDriver();
			break;
		default:
			System.setProperty(chromeKey, driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}
}

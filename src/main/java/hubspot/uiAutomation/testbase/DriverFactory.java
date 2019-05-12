package hubspot.uiAutomation.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {
		// private constructor
	}

	private static  WebDriver getDriverInstance(String browser) {
		//System.out.println(browser+driver);
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/main/resources/driverServer/chromedriver.exe");
			return new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/src/main/resources/driverServer/geckodriver.exe");
			return new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "/src/main/resources/driverServer/geckodriver.exe");
			return new EdgeDriver();
		} else {
			return null;
		}
	}
	
	public static  WebDriver getDriver(String browser) {
		/**
		if(driver == null){
		driver = getDriverInstance(browser);
		return driver;
		} else {
			System.out.println("else"+driver);
			return driver;
		}
		**/
		driver = getDriverInstance(browser);
		return driver;
	}

}

package hubspot.uiAutomation.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestBase {
	
	protected static WebDriver driver;
	
	public TestBase() {
		PageFactory.initElements(driver, this);
	}
	
	public void setUpDriver(String browser) {
		driver = DriverFactory.getDriver(browser);
	}
	
	@Before
	public void setUp() {
		setUpDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
	}
	
	@After
	public void tearDown() { 
		driver.close();
		driver.quit();
		
	}

}

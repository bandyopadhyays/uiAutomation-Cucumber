package hubspot.uiAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import hubspot.uiAutomation.testbase.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement userNameTxtbx;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordTxtbx;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginBtn;
	
	private LoginPage() {
		super();
	}
	
	public static LoginPage getLoginPageObject() {
			return new LoginPage();
	}
	
	public LoginPage setUserName(String username) {
		userNameTxtbx.sendKeys(username);
		return this;
	}
	
	public LoginPage setPassword(String password) {
		passwordTxtbx.sendKeys(password);
		return this;
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	// binding methods --
	
	public void loginToApplication(String username, String password) {
		this.setUserName(username)
			.setPassword(password)
			.clickOnLoginBtn();
	}
	
	public void setCredentials(String username, String password) {
		this.setUserName(username);
		this.setPassword(password);
	}

}

package stepDef;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hubspot.uiAutomation.pages.LoginPage;
import io.cucumber.datatable.DataTable;

public class LoginPageStepDef {

	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() {		
		// before hooks will perform this step
		//driver = DriverFactory.getDriver("chrome");
		//System.out.println(driver + "out test base");
	}


	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		LoginPage objLoginPage = LoginPage.getLoginPageObject();
		objLoginPage.clickOnLoginBtn();
	}

	@When("user enters user name as {string} and password as {string}")
	public void user_enters_user_name_as_and_password_as(String userName, String password) {
		LoginPage objLoginPage = LoginPage.getLoginPageObject();
		objLoginPage.setCredentials(userName, password);
	}
	
	@Then("^user successfully lands on home page$")
	public void user_successfully_lands_on_home_page() {
		System.out.println("home page");
	}
	

	@Then("login page title should be as per requirement")
	public void login_page_title_should_be_as_per_requirement() {
		LoginPage objLoginPage = LoginPage.getLoginPageObject();
	    System.out.println(objLoginPage.getLoginPageTitle());
	}

	@Given("user enters credentials in login page")
	public void user_enters_credentials_in_login_page(DataTable userCredentials) {
		 // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> data = userCredentials.asLists();
		
		LoginPage objLoginPage = LoginPage.getLoginPageObject();
		objLoginPage.setUserName(data.get(0).get(0))
					.setPassword(data.get(0).get(1));
	}

}

package io_tray_StepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.tray.pages.Dashboardpage;
import io.tray.pages.Loginpage;
import io_tray_base.Bootstrap;

public class LoginPageStepDefinition extends Bootstrap{
	Loginpage loginpage;
	Dashboardpage dashboardpage;


	public LoginPageStepDefinition() {
		super();
		initialisation();
		loginpage = new Loginpage();
		dashboardpage =new Dashboardpage();
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		loginpage.clickOnLoginBtn();
	}

	@Then("^I should be on login page$")
	public void i_should_be_on_login_page() throws Throwable {
		loginpage.isUserOnLoginPage();	
	}

	@When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_username_and_password(String email, String password) throws Throwable {
		loginpage.enterUserNamePassword(email, password);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		loginpage.clickOnAccLoginBtn();
	}
	
	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	   loginpage.closeBrowser();
	}

}

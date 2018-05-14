package io_tray_StepDefinition;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.tray.pages.Dashboardpage;
import io.tray.pages.Loginpage;
import io.tray.pages.Triggerpage;
import io_tray_base.Bootstrap;
import junit.framework.Assert;

public class TriggerPageStepDefinition extends Bootstrap{

	Loginpage loginpage;
	Dashboardpage dashboardpage;
	Triggerpage triggerpage;

	public TriggerPageStepDefinition() {
		triggerpage = new Triggerpage();
		dashboardpage =new Dashboardpage();
		loginpage = new Loginpage();
	}

	@Then("^I should be on a trigger page$")
	public void i_should_be_on_a_trigger_page() throws Throwable {
		triggerpage.isUserOnTriggerPage();
		//S/ring title = triggerpage.isUserOnTriggerPage();
		//Assert.assertEquals(title,"tray.io | Choose a trigger");
	}

	@When("^I click on close button$")
	public void i_click_on_close_button() throws Throwable {
		triggerpage.clickOnCloseBtn();
	}
}

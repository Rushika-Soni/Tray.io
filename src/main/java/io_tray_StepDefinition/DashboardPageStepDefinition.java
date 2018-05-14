package io_tray_StepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.tray.pages.Dashboardpage;
import io.tray.pages.Loginpage;
import io.tray.pages.Triggerpage;
import io_tray_base.Bootstrap;

public class DashboardPageStepDefinition extends Bootstrap {
	Loginpage loginpage;
	Dashboardpage dashboardpage;
	Triggerpage triggerpage;

	public DashboardPageStepDefinition() {
		loginpage = new Loginpage();
		dashboardpage = new Dashboardpage();
		triggerpage = new Triggerpage();
	}

	@Then("^I should be on dashboard page$")
	public void i_should_be_on_dashboard_page() throws Throwable {
		dashboardpage.isUserOnDashboardPage();
	}

	@When("^I select option CREATE NEW WORKFLOW$")
	public void I_select_option_CREATE_NEW_WORKFLOW() throws Throwable {
		dashboardpage.clickOnCreateNewWorkflow();
	}
	
	@When("^I enter \"([^\"]*)\" and click on create$")
	public void i_enter_and_click_on_create(String name) throws Throwable {
		dashboardpage.enterWorkflowName(name);
		dashboardpage.clickOnCreateBtn();
	}

	@When("^I click on delete button$")
	public void i_click_on_delete_button() throws Throwable {
		dashboardpage.mouseHoverToDelete();
		dashboardpage.clickOnYes();
	}

	@Then("^the workflow should be deleted$")
	public void the_workflow_should_be_deleted() throws Throwable {
		dashboardpage.isWorkflowDeleted();
	}

	@When("^I click on logout button in header$")
	public void i_click_on_logout_button_in_header() throws Throwable {
		dashboardpage.clickOnLogout();
	}

}

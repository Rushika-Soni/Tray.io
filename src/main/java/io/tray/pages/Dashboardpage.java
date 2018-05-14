package io.tray.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import io_tray_base.Bootstrap;

public class Dashboardpage extends Bootstrap{

	@FindBy(xpath = "//div[@class='Dashboard-fixed-header--title___1DThTq']")
	private WebElement dashboardPage;

	@FindBy(xpath= "//a[@class='Page-navigation-button___2nr8D6']")
	private WebElement createNewWorkflowBtn;

	@FindBy(name = "name")
	private WebElement workflowName;

	@FindBy(xpath = "//div[@class='button___20IrAn button___1PSJhJ success___3Tf3_d uppercase___2hcvEE']")
	private WebElement createBtn;

	@FindBy(xpath="//div[@class='Options-menu___2xCHNh Options-menu--right___2b16vG']")
	private WebElement mouseHoverBtn;

	@FindBy(xpath="//ul[@class=\"UppwardMenu___JkA7Kl\"]//li[5]")
	private WebElement deleteBtn;

	@FindBy(xpath="//div[contains(text(),'Yes')]")
	private WebElement yesBtn;

	@FindBy(xpath="//div[@class='My-flows-empty___3_hU3V']")
	private WebElement workflowList;

	@FindBy(xpath="//div[@class='Profile-avatar___3Ezd7K']")
	private WebElement profileBtn;

	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	private WebElement logoutBtn;

	public Dashboardpage() {
		PageFactory.initElements(driver, this);
	}

	public boolean isUserOnDashboardPage() {
		return dashboardPage.isDisplayed();
	}

	public void clickOnCreateNewWorkflow(){
		createNewWorkflowBtn.click();
	}

	public void enterWorkflowName(String name) throws InterruptedException {
		workflowName.sendKeys(name);
		//Thread.sleep(1000);
	}

	public Triggerpage clickOnCreateBtn() {
		createBtn.click();
		return new Triggerpage();
	}

	public void mouseHoverToDelete() {
		Actions builder = new Actions(driver);
		builder.moveToElement(mouseHoverBtn).build().perform();
		deleteBtn	.click();
	}

	public void clickOnYes() throws InterruptedException{
		//Alert alert = driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
		yesBtn.click();
		Thread.sleep(1000);
	}

	public boolean isWorkflowDeleted() {
		return workflowList.isDisplayed();
	}

	public Loginpage clickOnLogout() {
		profileBtn.click();
		logoutBtn.click();
		return new Loginpage();
	}

}

package io.tray.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io_tray_base.Bootstrap;

public class Triggerpage extends Bootstrap{

	@FindBy(xpath = "//i[@class='icon___3RNBHf icon-times button-icon___1URmdp']")
	private WebElement closeBtn;

	@FindBy(xpath="//h1[contains(text(),'Add a trigger')]")
	private WebElement chooseATrigger;

	public Triggerpage() {
		PageFactory.initElements(driver,this);
	}

	public boolean isUserOnTriggerPage() {
		return chooseATrigger.isDisplayed();
		//return driver.getTitle();
	}

	public Dashboardpage clickOnCloseBtn() {
		closeBtn.click();
		return new Dashboardpage();
	}
}

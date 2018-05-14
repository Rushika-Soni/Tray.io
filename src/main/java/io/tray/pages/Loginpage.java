package io.tray.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io_tray_base.Bootstrap;

public class Loginpage extends Bootstrap{

	@FindBy(xpath = "//a[@class='Nav-Item-Link___1pc9UK' and contains(text(),'Login')]")
	private WebElement loginBtn;

	@FindBy(id = "login-form")
	private WebElement loginPage;

	@FindBy(name ="username")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement Password;

	@FindBy(xpath = "//button[@class='Button___27l6Gy button___1PSJhJ large___2qVdSJ success___3Tf3_d']")
	private WebElement accloginBtn;


	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	public boolean clickOnLoginBtn() {
		boolean flag = false;
		try {
			loginBtn.click();
			flag = true;
		}
		catch(Exception E){
			String exception = E.getMessage();
			System.out.println("An exception occured :" + exception);
			flag = false;
		}
		return flag;
	}

	public boolean isUserOnLoginPage() {
		return loginPage.isDisplayed();
	}

	public void enterUserNamePassword(String username, String password) {
		userName.sendKeys(username);
		Password.sendKeys(password);
	}

	public Dashboardpage clickOnAccLoginBtn() {
		accloginBtn.click();
		return new Dashboardpage();
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
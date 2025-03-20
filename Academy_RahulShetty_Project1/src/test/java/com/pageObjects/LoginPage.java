package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@FindBy(name = "email")
	WebElement emailField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	@FindBy(xpath = "//a[text()='Forgot your password?']")
	WebElement forgotPasswordLink;

	@FindBy(xpath = "//button[contains(text(), 'Continue with Google')]")
	WebElement googleButton;

	@FindBy(xpath = "//button[contains(text(), 'Continue with Facebook')]")
	WebElement facebookButton;

	@FindBy(xpath = "//label[normalize-space()='User robin']")
	WebElement UserName;

	@FindBy(xpath = "//p[@class='block text-sm text-black font-bold -mt-1']")
	WebElement SignIn;

	@FindBy(xpath = "//p[contains(text(),'Account')]")
	WebElement AccountButton;

	@FindBy(xpath = "//p[@class='flex items-center justify-start gap-3 text-slate-950 cursor-pointer']")
	WebElement logOutButton;
	
	@FindBy(xpath = "")
	WebElement logOutConfirmButton;
	
	
	String v= "djnkdxdxdxd";

	WebDriverWait wait;

	
	public void clickSignin() {
		
		wait.until(ExpectedConditions.visibilityOf(SignIn));
		SignIn.click();
	}

	public void verifySignin() {
		
			wait.until(ExpectedConditions.visibilityOf(emailField));
	}

	public void enterEmail(String email) {

		emailField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public void clickForgotPasswordLink() {
		forgotPasswordLink.click();
	}

	public void clickGoogleButton() {
		googleButton.click();
	}

	public void clickFacebookButton() {
		facebookButton.click();
	}

	public boolean isLoginButtonEnabled() {
		return loginButton.isEnabled();
	}

	public void clearEmail() {
		emailField.clear();
	}

	public void clearPassword() {
		passwordField.clear();
	}

	public boolean verifyLogin() {
		wait.until(ExpectedConditions.visibilityOf(UserName));
		
		if (UserName.getText().contains("User")) {
			return true;
		} else {
			return false;

		}
	}

	public void logOut() {
		AccountButton.click();
		logOutButton.click();
		logOutConfirmButton.click();
		
	}
}
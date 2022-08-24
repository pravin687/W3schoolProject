package com.w3school.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w3school.qa.testbase.TestBase;

public class LoginPage{
  WebDriver driver;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='current-password']")
	WebElement password;
	
	@FindBy(xpath="//span[normalize-space()='Log in']")
	WebElement loginbutton;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void email(String emailid) {
		this.email.sendKeys(emailid);
	}
	
	public void password(String pswd) {
		this.password.sendKeys(pswd);
	}
	
	public void loginbutton() {
		loginbutton.click();
	}
	
	public void loginmethod(String emailid,String pswd) {
		driver.get("https://profile.w3schools.com/log-in");
		this.email.sendKeys(emailid);
		this.password.sendKeys(pswd);
		loginbutton.click();
	}
}

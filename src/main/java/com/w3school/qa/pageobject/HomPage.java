package com.w3school.qa.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.w3school.qa.testbase.TestBase;

public class HomPage{
  WebDriver driver;
	
	@FindBy(xpath="//a[normalize-space()='My learning']]")
	WebElement myLearning;
	
	@FindBy(xpath="//a[normalize-space()='Paid courses']")
	WebElement paidcourse;
	
	@FindBy(xpath="//a[normalize-space()='Certificates']")
	WebElement certificates;
	
	@FindBy(xpath="//a[normalize-space()='Videos']")
	WebElement videos;
	
	@FindBy(xpath="//a[text()='Spaces']")
	WebElement spaces;
	
	@FindBy(xpath="//a[normalize-space()='Settings']")
	WebElement setting;
	
	@FindBy(xpath="//a[normalize-space()='Billing']")
	WebElement billing;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='current-password']")
	WebElement password;
	
	@FindBy(xpath="//span[normalize-space()='Log in']")
	WebElement loginbutton;
	
	public HomPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnVideo() {
		videos.click();
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
	
}

package com.w3school.qa.stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w3school.qa.pageobject.LoginPage;
import com.w3school.qa.testbase.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import com.w3school.qa.reusablemethods.*;


public class LoginStepDefination  extends TestBase{
	LoginPage lp = new LoginPage(driver);
	
	static{
		try {
			initilization();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@Given("^Navigate to \"([^\"]*)\"$")
	public void navigate_to_something(String strArg1) throws Throwable {
    driver.get(strArg1);
	}

	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\" and click on Login button$")
	public void enter_something_and_something_and_click_on_login_button(String strArg1, String strArg2)
			throws Throwable {
	
		lp.email(strArg1);
		lp.password(strArg2);
		lp.loginbutton();

	}

	@Then("^user should land on HomePage$")
	public void user_should_land_on_homepage() throws Throwable {
		Resuabale.explicitWait(By.xpath("//a[text()='My learning']"));
      String expectedUrl="https://my-learning.w3schools.com/";
      assertEquals(expectedUrl,driver.getCurrentUrl());
      
	}

	
	
}

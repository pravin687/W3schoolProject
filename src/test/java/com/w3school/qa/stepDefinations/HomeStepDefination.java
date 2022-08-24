package com.w3school.qa.stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w3school.qa.pageobject.HomPage;
import com.w3school.qa.pageobject.LoginPage;
import com.w3school.qa.testbase.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import com.w3school.qa.reusablemethods.*;


public class HomeStepDefination  extends TestBase{
	LoginPage lp = new LoginPage(driver);
	HomPage hp=new HomPage(driver);
	
	static{
		try {
			initilization();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@Given("^user land on home Page$")
    public void user_land_on_home_page() throws Throwable {
     lp.loginmethod("rtoor204", "Abc@1234");
    }

    @When("^then it should click on video menu$")
    public void then_it_should_click_on_video_menu() throws Throwable {
      hp.clickOnVideo();
    }

    @Then("^user should land on video page$")
    public void user_should_land_on_video_page() throws Throwable {
        System.out.println("url");
    }
	
}

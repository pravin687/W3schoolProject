package com.w3school.qa.reusablemethods;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.w3school.qa.testbase.TestBase;



public class Resuabale extends TestBase{
	
	static WebDriverWait wait;
	public static void explicitWait(By l) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(l));
		
	}

}

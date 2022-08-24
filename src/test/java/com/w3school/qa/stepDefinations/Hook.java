package com.w3school.qa.stepDefinations;


import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.w3school.qa.testbase.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;


public class Hook  extends TestBase{

@After
  public void afterclass(Scenario sc) throws IOException{
   if(sc.isFailed()) {
	 final  byte[] srceenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	 sc.attach(srceenshot, "image/png", sc.getName());
   }

	  driver.quit();
  }
}

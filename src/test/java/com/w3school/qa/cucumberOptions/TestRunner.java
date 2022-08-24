package com.w3school.qa.cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/w3school/qa/features", glue = "com/w3school/qa/stepDefinations",plugin= {"pretty","json:target/json-report/cucumber.json","html:target/htmlreport/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunner {

}

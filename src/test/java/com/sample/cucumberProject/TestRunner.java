package com.sample.cucumberProject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = "com.sample.cucumberProject.Steps",
		dryRun = false,
		tags = "@Testregisterfeature",
		publish = false,
		plugin = {"pretty",
				"html:target/cucumber-reports/report.html",
				"junit:target/cucumber-reports/Cucumber.xml",
				"json:target/cucumber-reports/cucumber.json" }
		)
public class TestRunner {
	
	
	
}

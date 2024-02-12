package com.sample.cucumberProject.Steps.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestBase {

	public WebDriver driver;
	public PropertiesReader props;

	public TestBase() {
		this.driver = Setup.GetDriver();
		this.props = new PropertiesReader();

	}

	public void selectDropdown(WebElement el, String option) {



	}

	
}

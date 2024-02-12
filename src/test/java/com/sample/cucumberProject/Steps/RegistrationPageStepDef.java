/**
 * 
 */
package com.sample.cucumberProject.Steps;

import com.sample.cucumberProject.Pages.RegistrationPage;

import io.cucumber.java.en.Given;

/**
 * 
 */
public class RegistrationPageStepDef {
	RegistrationPage reg = new RegistrationPage();
	
	@Given("I click on Create an account")
	public void i_navigate_to_xcite_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		reg.Registration();
		Thread.sleep(3000);
	    
	}

	
}

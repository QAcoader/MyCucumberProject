package com.sample.cucumberProject.Steps;

import com.sample.cucumberProject.Pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStepDef {

	HomePage page;

	@Given("I navigate to homepage")
	public void i_navaigate_to_homepage() throws InterruptedException {

		page = new HomePage();
		page.launchHomePage();
	}

	@Given("I login with username password")
	public void i_login_with_username_password() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		page.login();
		Thread.sleep(2000);

	}

	@Then("I search with keyword {string}")
	public void i_search_with_keyword(String searchString) throws InterruptedException {

		page.search(searchString);
		Thread.sleep(10000);

	}


}

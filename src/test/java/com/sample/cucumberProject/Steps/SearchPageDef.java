/**
 * 
 */
package com.sample.cucumberProject.Steps;

import com.sample.cucumberProject.Pages.SearchPage;

import io.cucumber.java.en.Then;

/**
 * 
 */
public class SearchPageDef {

	SearchPage searchpage = new SearchPage();

	@Then("select 2nd search result and click on add to cart")
	public void select_2nd_search_result_and_click_on_add_to_cart() throws InterruptedException {
		
		
		searchpage.clickaddtocart();
		
	}

}

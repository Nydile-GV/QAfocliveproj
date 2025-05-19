package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultsPages;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Search {
	HeadersSection headersection = new HeadersSection();
	SearchResultsPages searchresultspages = new SearchResultsPages();
	
	@When("I_search_for_a_product")
	public void I_search_for_a_product(String product)
	{
		Elements.TypeText(HeadersSection.searchboxfield,product);
		Elements.click(HeadersSection.searchbutton);
		
	}
	@Then("I_should_see_the_product_in_the_search_address")
	public void I_should_see_the_product_in_the_search_address()
	{
		Assert.assertTrue(Elements.isDisplayed(SearchResultsPages.SamsungProduct));
	}

}

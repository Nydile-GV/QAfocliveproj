package com.tutorialsninja.automation.stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.tutorialsninja.automation.base.*;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.CheckoutPages;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPages;
import com.tutorialsninja.automation.pages.OrderSuccessPages;
import com.tutorialsninja.automation.pages.SearchResultsPages;
import com.tutorialsninja.automation.pages.ShoppingCartPages;

public class Orders {
	HeadersSection headersection = new HeadersSection();
	ShoppingCartPages shoppingcart= new ShoppingCartPages();
	OrderSuccessPages ordersuccesspages= new OrderSuccessPages();
	
	@Given("I login to the application")
	public void I_login_to_the_application()
	{
		//Base.driver.get(Base.reader.getUrl());
		Browser.openApplicationURL();
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.login);
		//Elements.TypeText(LoginPages.loginemail,Base.reader.getUsername());
		//Elements.TypeText(LoginPages.loginpassword,Base.reader.getPassword());
		LoginPages.dologinforOrders();
	}
	@When("^I_add_any_product_to_Bag_and_checkout$")
	public void I_add_any_product_to_Bag_and_checkout() {
		
		//Elements.TypeText(HeadersSection.searchboxfield, Base.reader.getProduct());
		//Elements.click(HeadersSection.searchbutton);
		HeadersSection.SearchProduct();
		Elements.click(SearchResultsPages.Addtocart);
		Elements.click(HeadersSection.viewshoppingcart);
		Elements.click(ShoppingCartPages.Checkout);
	}
	
	@And("I_place_an_order")
	public void I_place_an_order()
	{
		Elements.click(CheckoutPages.continuebuttonofbillingdetails);
		Elements.click(CheckoutPages.continuebuttonofdelivarydetails);
		Elements.click(CheckoutPages.continuebuttonofdeliverymethod);
		Elements.click(CheckoutPages.termsandcondition);
		Elements.click(CheckoutPages.continuebuttonofPaymentmethod);
		Elements.click(CheckoutPages.continuebuttonofconfirmorder);

	}
	 @Then("I_should_see_that_the_order_is_placed_successfully")
	 public void I_should_see_that_the_order_is_placed_successfully()
	 {
		 Elements.isDisplayed(OrderSuccessPages.ordersucess);
	 }
}

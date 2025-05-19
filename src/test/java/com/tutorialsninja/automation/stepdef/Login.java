package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.FoegotPasswordPages;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPages;
import com.tutorialsninja.automation.pages.MyAccountPages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login {
	
	//create an object for headerssections.
	HeadersSection headersection = new HeadersSection();
	
	@And("I_navigate_to_the_loginaccount_page")
	public void I_launch_the_application()
	{
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.login);
	}
	
	@When("I_login_to_the_application_using_Username_and_Password")
	public void I_login_to_the_application_using_Username_and_Password(String email, String password)
	{
		//Elements.TypeText(LoginPages.loginemail,email);
		//Elements.TypeText(LoginPages.loginpassword, password);
		//Elements.click(LoginPages.loginbutton);
		
	//will be pushing above code to loginpages class for reusability.
		LoginPages.dologin(email, password);
	}
	
	@Then("I_should_see_that_the_User_is_able_to_successfully_login")
	public void I_should_see_that_the_User_is_able_to_successfully_login()
	{
		Assert.assertTrue(Elements.isDisplayed(MyAccountPages.Editaccount));
	}
	
	@Then("I_should_see_an_error_message_informing_the_User_about_invalid_credentials")//as part of 3rd scenario
	public void I_should_see_an_error_message_informing_the_User_about_invalid_credentials()
	{
	Assert.assertTrue(Elements.VerifyTextEquals(LoginPages.mainwarning,"type the warning text message"));
	}
	
	@When("I_reset_the_forgotten_password")
			public void I_reset_the_forgotten_password(String email) {
				Elements.click(LoginPages.forgotpassword);
				Elements.TypeText(FoegotPasswordPages.enteremailaddress,email);
				Elements.click(FoegotPasswordPages.continuebutton);
			}
	
	 @Then("I_should_see_message_that_the_password_reset_details_have_been_sent_to_the_email_address")
	 public void I_should_see_a_message_informing_that_the_password_reset_details_have_been_sent_to_the_email_address()
	 {
		 Assert.assertTrue(Elements.VerifyTextEquals(LoginPages.mainwarning, "type that email txt"));
	 
	 }
	
	
	

}

package com.tutorialsninja.automation.stepdef;

import java.util.Map;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPages;
import com.tutorialsninja.automation.pages.SuccessPages;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Register {
	
	//create an object for headerssections.
	HeadersSection headersection = new HeadersSection();
	RegisterPages registerpages = new RegisterPages();
	SuccessPages successpages = new SuccessPages();
	
	@Given("^I launch the application$")
	public void I_launch_the_application()
	{
		Base.driver.get(Base.reader.getUrl());
		// in base class, reader is assigned with proprtiesfile. And propertyfilereader has the geturl.
	}
	
	@And("^I navigate to account registration page$")
	public void I_navigate_to_account_registration_page()
	{
		Elements.click(HeadersSection.myAccountLink);// go to headersection class and check the code.
		Elements.click(HeadersSection.register);
	}
	
	@When("^I provide all the below valid details$")
	public void I_provide_all_the_below_valid_details(DataTable datatable)
	{
		//move this code to registerpages class , as there is number of many lines. we can reuse it in one class
		/*Map<String,String> map = datatable.asMap(String.class, String.class);//using datatable
		Elements.TypeText(RegisterPages.FirstName, map.get("FirstName"));
		Elements.TypeText(RegisterPages.LastName, map.get("LastName"));
		Elements.TypeText(RegisterPages.Email, map.get("Email"));
		Elements.TypeText(RegisterPages.Telephone, map.get("Telephone"));
		Elements.TypeText(RegisterPages.Password, map.get("Password"));
		Elements.TypeText(RegisterPages.ConfirmPassword, map.get("Password"));*/
		
		RegisterPages.enteralldetails(datatable,"unique");
		
	}
	
	@And("^I_select_the_Privacy_Policy$")
	public void I_select_the_Privacy_Policy()
	{
		Elements.click(RegisterPages.privacypolicy);
	}
	
	@And("^I_click_on_Continue_button$")
	public void I_click_on_Continue_button()
	{
		Elements.click(RegisterPages.continueButton);
	}
	
	@Then("I_should_see_that_the_User_Account_has_successfully_created")
	public void I_should_see_that_the_User_Account_has_successfully_created() {
		Assert.assertTrue(Elements.isDisplayed(SuccessPages.success));
		//Elements.isDisplayed(SuccessPages.success);
	}
	
	@Then("I_should_see_that_the_User_Account_is_not_created")
	public void I_should_see_that_the_User_Account_is_not_created()
	{
		Assert.assertTrue(Elements.isDisplayed(RegisterPages.registerwarningmessage));
	}
	
	@Then("I_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields")
	public void I_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields()
	{
		Assert.assertTrue(Elements.isDisplayed(RegisterPages.FirstNamewarningmssage));
		Assert.assertTrue(Elements.isDisplayed(RegisterPages.LastNamewarningmessage));
		Assert.assertTrue(Elements.isDisplayed(RegisterPages.Emailwarningmessage));
		Assert.assertTrue(Elements.isDisplayed(RegisterPages.Telephonewarningmessage));
		Assert.assertTrue(Elements.isDisplayed(RegisterPages.mainwarning));
		
	}
	
	@And("I_subscribe_to_Newsletter")
	public void I_subscribe_to_Newsletter()
	{
		Elements.click(RegisterPages.newsletter);
	}
	
	@When("I_provide_the_below_duplicate_details_into_the_fields")
	public void I_provide_the_below_duplicate_details_into_the_fields(DataTable datatable)
	{
		RegisterPages.enterduplicatedetails(datatable,"duplicate");
	}
	
	@Then("I_should_see_the_warning_message_stating_that_the_user_is_already_created")
	public void I_should_see_the_warning_message_stating_that_the_user_is_already_created()
	{
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPages.mainwarning,"Warning:E-mail address is already registered"));
	}
}
	

package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class CheckoutPages {
	
	public CheckoutPages() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="button-payment-address")
	public static WebElement continuebuttonofbillingdetails;
	
	@FindBy(id="button-shipping-address")
	public static WebElement continuebuttonofdelivarydetails;
	
	
	@FindBy(id="button-shipping-method")
	public static WebElement continuebuttonofdeliverymethod;
	
	@FindBy(id="button-payment-method")
	public static WebElement continuebuttonofPaymentmethod;
	
	@FindBy(name="agree")
	public static WebElement termsandcondition;
	
	@FindBy(id="button-confirm")
	public static WebElement continuebuttonofconfirmorder;

}

package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class FoegotPasswordPages {
	
	//constructor
		public FoegotPasswordPages() {
		PageFactory.initElements(Base.driver, this);//this means class that is headers sections. so this line of code says that below elements need to be initialzed
				//when this constructor is called, automatically below webelements will be initialized
		}
	
	@FindBy(linkText="input-email")
	public static WebElement enteremailaddress;
	
	@FindBy(css="input[type='submit'][value='Continue']")
	public static WebElement continuebutton;

}

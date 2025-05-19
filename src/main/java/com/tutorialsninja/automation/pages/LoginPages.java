package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPages {
	
	//constructor
		public LoginPages() {
			PageFactory.initElements(Base.driver, this);//this means class that is headers sections. so this line of code says that below elements need to be initialzed
		//when this constructor is called, automatically below webelements will be initialized
		}
		
	//webelements
	@FindBy(id="input-email")
	public static WebElement loginemail;
		
	@FindBy(id="input-password")
	public static WebElement loginpassword;
	
	@FindBy(css="input[type='submit'][value='Login']")
	public static WebElement loginbutton;
	
	public static void dologin(String email,String password)
	{
		Elements.TypeText(LoginPages.loginemail,email);
		Elements.TypeText(LoginPages.loginpassword, password);
		Elements.click(LoginPages.loginbutton);
	}
	@FindBy(css="div[class$='alert-dismisible']")
	public static WebElement mainwarning;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgotpassword;
	}
	
	




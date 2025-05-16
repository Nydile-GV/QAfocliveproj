package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPages {
	
	public RegisterPages()
	{
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(id="input-firstname")
	public static WebElement FirstName;

	@FindBy(id="input-lastname")
	public static WebElement LastName;
	
	@FindBy(id="input-email")
	public static WebElement Email;
	
	@FindBy(id="input-telephone")
	public static WebElement Telephone;
	
	@FindBy(id="input-password")
	public static WebElement Password;
	
	@FindBy(id="input-confirm")
	public static WebElement ConfirmPassword;
	
	public static void enteralldetails(DataTable datatable, String string) {
	Map<String,String> map = datatable.asMap(String.class, String.class);//using datatable
	Elements.TypeText(RegisterPages.FirstName, map.get("FirstName"));
	Elements.TypeText(RegisterPages.LastName, map.get("LastName"));
	Elements.TypeText(RegisterPages.Email, map.get("Email"));
	Elements.TypeText(RegisterPages.Telephone, map.get("Telephone"));
	Elements.TypeText(RegisterPages.Password, map.get("Password"));
	Elements.TypeText(RegisterPages.ConfirmPassword, map.get("Password"));
	}
	
	@FindBy(name="agree")
	public static WebElement privacypolicy;
	
	@FindBy(css="input[type='submit'][value='Continue']")
	public static WebElement continueButton;
	
	@FindBy(linkText= "Register")
	public static WebElement registerwarningmessage;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement FirstNamewarningmssage;

	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement LastNamewarningmessage;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement Emailwarningmessage;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement Telephonewarningmessage;
	
	@FindBy(css="input[id='input-password']+div")
	public static WebElement Passwordwarningmessage;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainwarning;
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement newsletter;
	
	public static void enterduplicatedetails(DataTable datatable, String string) {
		Map<String,String> map = datatable.asMap(String.class, String.class);//using datatable
		Elements.TypeText(RegisterPages.FirstName, map.get("FirstName"));
		Elements.TypeText(RegisterPages.LastName, map.get("LastName"));
		Elements.TypeText(RegisterPages.Email, map.get("Email"));
		Elements.TypeText(RegisterPages.Telephone, map.get("Telephone"));
		Elements.TypeText(RegisterPages.Password, map.get("Password"));
		Elements.TypeText(RegisterPages.ConfirmPassword, map.get("Password"));
		}
	

}

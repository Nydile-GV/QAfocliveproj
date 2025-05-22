package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSection {
	//constructor
	public HeadersSection() {
		PageFactory.initElements(Base.driver, this);//this means class that is headers sections. so this line of code says that below elements need to be initialzed
	//when this constructor is called, automatically below webelements will be initialized
	}
	//webelements
	//whenever we go to other pages and come back, these data may get lod inpage object so we need to initials it using constructor.
	@FindBy(xpath="//span[text()='My Account']")
	public static WebElement myAccountLink;

	@FindBy(linkText="Register")
	public static WebElement register;
	
	@FindBy(linkText="Login")
	public static WebElement login;
	
	@FindBy(linkText="search")
	public static WebElement searchboxfield;
	
	@FindBy(css="button[class$='btn-lg]")
	public static WebElement searchbutton;
	
	public static void SearchProduct(){
		Elements.TypeText(HeadersSection.searchboxfield, Base.reader.getProduct());
		Elements.click(HeadersSection.searchbutton);
		
	}
	
	@FindBy(xpath="//span[text()= 'Shopping Cart']")
	public static WebElement viewshoppingcart;
	}

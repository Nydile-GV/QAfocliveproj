package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class ShoppingCartPages {
	
	public ShoppingCartPages() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(linkText="Checkout")
	public static WebElement Checkout;

}

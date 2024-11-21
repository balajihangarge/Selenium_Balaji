package com.ShoppersStack_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_method_page {
	public Payment_method_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@name='radio-buttons-group'])[2]")
	private WebElement CashRB;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement CashProceedbtn;

	public WebElement getCashRB() {
		return CashRB;
	}

	public WebElement getCashProceedbtn() {
		return CashProceedbtn;
	}
	
	
}

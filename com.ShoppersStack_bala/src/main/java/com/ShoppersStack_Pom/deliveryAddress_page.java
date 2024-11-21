package com.ShoppersStack_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deliveryAddress_page {
	public deliveryAddress_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radiobtn;
	
	@FindBy(xpath="//button[contains(@class,'selectaddress_proceed__qiGsK')]")
	private WebElement Proceedbtn;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getProceedbtn() {
		return Proceedbtn;
	}
	
	
	

}

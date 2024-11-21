package com.ShoppersStack_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
	public Cart_page(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	@FindBy(id="buynow_fl")
	private WebElement BuyNowbtn;
	
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeSm')]")
	private WebElement removefromcartbtn;

	

	

	public WebElement getBuyNowbtn() {
		return BuyNowbtn;
	}

	public WebElement getRemovefromcartbtn() {
		return removefromcartbtn;
	}
	
	
}

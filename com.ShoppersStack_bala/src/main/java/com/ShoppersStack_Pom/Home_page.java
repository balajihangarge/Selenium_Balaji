package com.ShoppersStack_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiIconButton-root ')]")
	private WebElement settingbtn;
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myprofilebtn;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//h1[text()='Featured Products']")
	private WebElement FeaturedProducts;
	
	@FindBy(id="addToCart")
	private WebElement Addtocartbtn;
	
	@FindBy(id="cartIcon")
	private WebElement carticonbtn;
	
	
	
	public WebElement getCarticonbtn() {
		return carticonbtn;
	}

	public WebElement getAddtocartbtn() {
		return Addtocartbtn;
	}

	public WebElement getFeaturedProducts() {
		return FeaturedProducts;
	}

	public WebElement getSettingbtn() {
		return settingbtn;
	}

	public void setSettingbtn(WebElement settingbtn) {
		this.settingbtn = settingbtn;
	}

	public WebElement getMyprofilebtn() {
		return myprofilebtn;
	}

	public void setMyprofilebtn(WebElement myprofilebtn) {
		this.myprofilebtn = myprofilebtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	
	
	
	
	

}

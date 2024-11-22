package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_Pom.Cart_page;
import com.ShoppersStack_Pom.Payment_method_page;
import com.ShoppersStack_Pom.deliveryAddress_page;

public class tc_003_addingProductTo_cart_Test extends Base_Test {
	@Test
	public void addingproducttocart() throws InterruptedException, IOException {

		webDriverUtility.javaScriptscroll(driver, homePage.getFeaturedProducts());
		Thread.sleep(3000);

		homePage.getAddtocartbtn().click();
		homePage.getCarticonbtn().click();
		Thread.sleep(2000);

		Cart_page cartPage = new Cart_page(driver);
		Thread.sleep(3000);
		cartPage.getBuyNowbtn().click();
		Thread.sleep(3000);

		deliveryAddress_page deliveryAddressPage = new deliveryAddress_page(driver);
		Thread.sleep(3000);
		deliveryAddressPage.getRadiobtn().click();
		Thread.sleep(2000);

		deliveryAddressPage.getProceedbtn().click();

		Payment_method_page paymentMethodPage = new Payment_method_page(driver);
		Thread.sleep(2000);
		paymentMethodPage.getCashRB().click();
		Thread.sleep(3000);

		paymentMethodPage.getCashProceedbtn().click();

		webDriverUtility.webPageScreenShot(driver);
		Thread.sleep(7000);

	}
}

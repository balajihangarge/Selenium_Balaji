package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_Pom.Home_page;
import com.ShoppersStack_Pom.Myaddress_page;
import com.ShoppersStack_Pom.Myprofile_page;

public class tc_002_verify_user_is_able_to_deleteAddress_or_not_Test  extends Base_Test{
	@Test
	public void deleteAddress() throws InterruptedException, IOException {
		Thread.sleep(3000);
		homePage.getSettingbtn().click();
		homePage.getMyprofilebtn().click();		
		
		Myprofile_page myProfilePage= new Myprofile_page(driver);
		myProfilePage.getMyaddressesbtn().click();
		
		Thread.sleep(3000);
		
		Myaddress_page myAddressPage=new Myaddress_page(driver);
		myAddressPage. getDeletebtn().click();
		
		Thread.sleep(2000);
		
		myAddressPage.getYesbtn().click();
		Thread.sleep(2000);
	
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		webDriverUtility.webPageScreenShot(driver);
	}

}

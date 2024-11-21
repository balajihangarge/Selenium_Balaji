package com.ShoppersStack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.functions.Address;
import org.testng.annotations.Test;

import com.ShoppersStack_GenericUtility.Base_Test;
import com.ShoppersStack_Pom.AddaddressForm_page;
import com.ShoppersStack_Pom.Myaddress_page;
import com.ShoppersStack_Pom.Myprofile_page;

public class tc_001_verify_user_is_able_to_addAddress_or_not_Test extends Base_Test {
	@Test
	public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(3000);
		homePage.getSettingbtn().click();
		homePage.getMyprofilebtn().click();
		
		Myprofile_page myProfilepage=new Myprofile_page(driver);
		myProfilepage.getMyaddressesbtn().click();
		
		Thread.sleep(3000);
		
		Myaddress_page myAddressPage=new Myaddress_page(driver);
		myAddressPage.getAddaddressbtn().click();
		
		AddaddressForm_page addressFormPage=new AddaddressForm_page(driver);
		
		addressFormPage.getNametextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 0));
		addressFormPage.getHousetextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 1));
		addressFormPage.getStreenfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 2));
		addressFormPage.getLandmarktextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 3));
		
		webDriverUtility.selectByvalue(addressFormPage.getCountryDD(),fileUtility.readPropertyFile("Country"));
		webDriverUtility.selectByvalue(addressFormPage.getStateDD(),fileUtility.readPropertyFile("State"));
		webDriverUtility.selectByvalue(addressFormPage.getCityDD(), fileUtility.readPropertyFile("City"));
		
		addressFormPage.getPincodeTextfiled().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 4));
		addressFormPage.getPhonenumbertextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 5));
		
		addressFormPage.getAddressbtn().click();
		
	}

}

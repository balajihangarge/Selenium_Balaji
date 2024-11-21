package com.ShoppersStack_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.ShoppersStack_Pom.Home_page;

public class WebDriver_Utility {
	java_Utility javaUtility=new java_Utility();
	
	public void selectByvalue(WebElement element,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
		
	}
	public void selectByindex(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void selectByvisibleText(WebElement element, String visibletext) {
		Select sel=new Select(element);
		sel.deselectByVisibleText(visibletext);
	}
	public void deselectByindex(WebElement element,int index) {
		Select sel=new Select(element);
		sel.deselectByIndex(index);
	}
	public void deselectByvalue(WebElement element,String index) {
		Select sel=new Select(element);
		sel.deselectByValue(index);
	}
	public void deselectByvisibletext(WebElement element,String visibletext) {
		Select sel=new Select(element);
		sel.deselectByVisibleText(visibletext);
	}
	
	
	public void webPageScreenShot(WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameworkConstants.screenShotPath+javaUtility.dateAndTime()+".png");
		FileHandler.copy(temp, dest);
	}
	public void WebElementScreenShot(WebElement element) throws IOException {
		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameworkConstants.screenShotPath+javaUtility.dateAndTime()+".png");
		FileHandler.copy(temp, dest);
		
	
	}
	public void javaScriptscroll(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		
	

	}
	
	

}

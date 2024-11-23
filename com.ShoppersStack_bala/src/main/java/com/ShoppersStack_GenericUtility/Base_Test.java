package com.ShoppersStack_GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.ShoppersStack_Pom.Home_page;
import com.ShoppersStack_Pom.Login_page;
import com.ShoppersStack_Pom.Welcome_page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Test {
	public File_Utility fileUtility=new File_Utility();
	public WebDriver driver;
	public static WebDriver sDriver;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public Welcome_page welcomepage;
	public Login_page loginpage;
	public Home_page homePage;
	public java_Utility javaUtility=new java_Utility();
	public WebDriverWait wait;
	public WebDriver_Utility webDriverUtility=new WebDriver_Utility();
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");
		spark=new ExtentSparkReporter(FrameworkConstants.extentReportsPath+javaUtility.dateAndTime()+".html");
		reports = new ExtentReports();
		reports.attachReporter(spark);
		 
	}
	@BeforeClass
	public void beforeClass() throws IOException {
		System.out.println("@BeforeClass");
		
	//String browser = fileUtility.readPropertyFile("browserName");
	 //String url = fileUtility.readPropertyFile("url");
		
	String url = System.getProperty("url");
	String browser = System.getProperty("browserName");
		if(browser.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if (browser.contains("firefox")){
			driver=new FirefoxDriver();
		}
		else if (browser.contains("edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Enter Valid Browser Name");
		}
		sDriver= driver;
		homePage=new Home_page(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	
		}
	@BeforeMethod
	public void beforeMathod() throws IOException, InterruptedException {
		System.out.println("@BeforeMethod");
		
		String userName= fileUtility.readPropertyFile("userName");
		String password = fileUtility.readPropertyFile("password");
		
		welcomepage=new Welcome_page(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(25));
	wait.until(ExpectedConditions.elementToBeClickable(welcomepage.getLoginBtn()));
		Thread.sleep(3000);
		
	welcomepage.getLoginBtn().click();
	
	loginpage=new Login_page(driver);
	loginpage.getEmailtextfield().sendKeys(userName);
	loginpage.getPasswordtextfield().sendKeys(password);
	loginpage.getLoginbtn().click();
	}
	
	@AfterMethod
public void afterMathod() {
		System.out.println("@AfterMethod");
		homePage.getSettingbtn().click();
		homePage.getLogoutbtn().click();
		
	}
	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("@AfterClass");
		Thread.sleep(30000);
		driver.quit();
	}
	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");
		reports.flush();
	}
	@AfterSuite
	public void afterSuite() {
	System.out.println("@AfterSuite");
	}
	
	
	
		
	}


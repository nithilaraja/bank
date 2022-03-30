package com.ibanking.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

//import com.ibanking.utilities.ExcelDatap ;


import com.ibanking.utilities.BrowserFactory;



public class BaseClass {

	public WebDriver driver;



	@BeforeClass
	public void beforeClass()throws Exception
	{  
		driver = BrowserFactory.startApplication(driver, "Chrome", "https://demo.guru99.com/V1/index.php");

		Reporter.log("Welcome to  Home page");  
	}





	@AfterClass
	public void afterClass() 
	{
		BrowserFactory.quitBrowser(driver);
	}

}


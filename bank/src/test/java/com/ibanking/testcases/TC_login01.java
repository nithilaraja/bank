package com.ibanking.testcases;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import com.ibanking.PageObjects.*;
import com.ibanking.utilities.*;




public class TC_login01 extends BaseClass {
	
	@Test(priority=0, dataProvider="Login")
	public void LoginTest(String uname,String pword)
	{
					
		Loginpage loginPO = PageFactory.initElements(driver, Loginpage.class);   
			loginPO.setUsername(uname);
			loginPO.setPassword(pword);
			loginPO.setlogin();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
			Reporter.log("Welcome to  Login page ");	
			System.out.println("Page title is : " + driver.getTitle());
	
	if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);
	}
	}
	
	@DataProvider(name="Login")
	public Object[][] getdatafromdataprovider() throws IOException
	{
		Object[][] datafromexcel = ExcelData.read(".\\Excel\\Login.xlsx", "Sheet1");

		return datafromexcel;	

	}

	}



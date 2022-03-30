package com.ibanking.PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}

By txt_username=By.name("uid");
By txt_password=By.name("password");
By btn=By.name("btnLogin");
public void setUsername(String uname)
{
	driver.findElement(txt_username).sendKeys(uname);
}
public void setPassword(String pword)
{
	driver.findElement(txt_password).sendKeys(pword);
}
public void setlogin()
{
	driver.findElement(btn).click();
}
}


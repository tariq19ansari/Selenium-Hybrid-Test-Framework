package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;						// ldriver = local driver
	public LoginPage (WebDriver rdriver)			// rdriver = remote driver
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this );
		
				
	}
	
	@FindBy(name = "uid") 
	WebElement txtUserName;
	
	@FindBy(name = "password") 
	WebElement txtPassword;
	
	@FindBy(name = "btnLogin") 
	WebElement btnLogin;
	
	/// Action method	 for the above web elements
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
}

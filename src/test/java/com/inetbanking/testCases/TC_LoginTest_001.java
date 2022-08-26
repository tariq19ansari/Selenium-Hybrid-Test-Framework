package com.inetbanking.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	

	@Test
	public void loginTest()
	{
		driver.get(baseUrl);
		logger.info("URL is opened");
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is entered");
		lp.setPassword(password);
		logger.info("Password is entered");
		lp.clickSubmit();
		logger.info("Successfully submitted");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		logger.info("Login Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}
	}
}


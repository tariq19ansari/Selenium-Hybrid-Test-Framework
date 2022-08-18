// This Class has common resource(variables and methods) and hence this class must always be extended

package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseUrl = "https://demo.guru99.com/v4/";
	public String username = "mngr431339";
	public String password = "tunyhyn";
	public static WebDriver driver;       // WebDriver object is initiated
	
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();      // Instantiation of Chrome Driver
		
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}
	

}

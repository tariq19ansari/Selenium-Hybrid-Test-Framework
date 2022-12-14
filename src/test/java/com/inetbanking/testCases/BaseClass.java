// This Class has common resource(variables and methods) and hence this class must always be extended

package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readConfig = new ReadConfig();
	
	public String baseUrl = readConfig.getApplicationURL();
	public String username = readConfig.getUsername();
	public String password = readConfig.getPassword();
	public static WebDriver driver;       						// WebDriver object is initiated
	
	public static Logger logger;

	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
		driver = new ChromeDriver();     						 // Instantiation of Chrome Driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");		 // Log4j.properties file configuration with help of logger class
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}
	

}

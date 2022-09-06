package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	// Create a constructor to load the properties file
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}		
	}
		
	// Define method for every variable present in the properties file
	// Since we will be using the below methods to return the value to the base class, 
	// hence the method should be returning method which access from config properties file
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseUrl");
		return url;	
	}
	
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;	
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;	
	}
	
	public String getChromePath() {
		String chromePath = pro.getProperty("chromepath");
		return chromePath;
	}
	
	public String getFirefoxPath() {
		String firefoxpathpath = pro.getProperty("firefoxpathpath");
		return firefoxpathpath;		
	}
	public String getIEPath() {
		String IEpath = pro.getProperty("IEpath");
		return IEpath;		
	}
	
	}
	
	


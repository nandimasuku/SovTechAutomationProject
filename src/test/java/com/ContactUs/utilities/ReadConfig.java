package com.ContactUs.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	//object for properties
	Properties prop;
	
	//create a constructor
	
	public ReadConfig()
	{
		File src = new File("./configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
			
		}catch(Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	//different methods to read each variables 
	
	public String getApplicationURL()
	{
		String url = prop.getProperty("baseURL");
		return url;
		
	}
	
	public String getUsername1()
	{
		String url = prop.getProperty("username");
		return url;
		
	}
	
	public String getEmail()
	{
		String url = prop.getProperty("email");
		return url;
		
	}
	
	public String getPhone()
	{
		String url = prop.getProperty("phone");
		return url;
		
	}
	
	
	
	public String getMessage()
	{
		String url = prop.getProperty("message");
		return url;
		
	}
	public String getChromePath()
	{
		String url = prop.getProperty("chromepath");
		return url;
		
	}
	
	
	public String getFireFoxPath()
	{
		String url = prop.getProperty("firefox");
		return url;
		
	}
	

}

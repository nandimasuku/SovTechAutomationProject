package com.ContactUs.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ContactUs.utilities.ReadConfig;


public class BaseClass {

	//create object readConfig
	ReadConfig readconfig = new ReadConfig();
	
	
	public String baseURL = readconfig.getApplicationURL();
	public String username =readconfig.getUsername1();
	public String email = readconfig.getEmail();
	public String phone = readconfig.getPhone();
	public String message = readconfig.getMessage();
	
	
	
	public static WebDriver driver;
	
	public static Logger logger ;


	@Parameters("browser")
	@BeforeClass
	public void SetUp(String br) throws InterruptedException
	{
			
		//implement log for testcase -ContactUs "create logger class"
		 logger = Logger.getLogger("SovTechContactUsForm");
		PropertyConfigurator.configure("Log4j.properties");
		
		if (br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(1000);
	
		
	}else if (br.equals("firefox")) {
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFireFoxPath());
			driver = new FirefoxDriver();
			
		}
	}
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}

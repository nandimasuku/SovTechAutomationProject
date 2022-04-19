package com.ContactUs.testcases;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ContactUs.pageObjects.ContactUsPage;


public class TC_FillForm_Test_001 extends BaseClass{
	

	@Test
	public void ContactUsTest() throws InterruptedException
	{
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		//Thread.sleep(1000);
		//create login object and pass driver parameter
		ContactUsPage lp = new ContactUsPage(driver);
		Thread.sleep(1000);

		
		//calling methods (no hard coding)
		logger.info("Enter username");
		lp.SetUserName(username);
		logger.info("Enter email address");
		lp.SetEmail(email);
		logger.info("Enter phone");
		lp.SetPhone(phone);
		//lp.SetEmail(employees);
		//lp.SetHelp(help);
		logger.info("Enter username");
		lp.SetMessage(message);
		//lp.SetAgree(Agree);
		//lp.SetSubmit(btnsubmit);
		
				
		//check home page title is correct
		if(driver.getTitle().equals("Contact us for your Custom Software Quote"))
		{
			Assert.assertTrue(true);
			logger.info("FillForm Test Passed");

		}
		else
		{
			Assert.assertTrue(false);
			logger.info("FillForm Test Failed");

		}
		
		
		
		
	}
	public void scrollDown(){
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,250)", "");
	}
	
	public WebElement waitUntilElementVisible(WebDriver driver, WebElement element, Duration delay) {
	    try{
	        WebDriverWait wait = new WebDriverWait(driver, delay);
	        return wait.until(ExpectedConditions.visibilityOf(element));
	    }catch (NoSuchElementException e){
	        throw new RuntimeException("Web element not visible within given time" + element +" Time "+ delay);
	    }
	}

}

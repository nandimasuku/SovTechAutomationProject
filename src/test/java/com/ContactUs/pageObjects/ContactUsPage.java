package com.ContactUs.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	
	//get driver object
	WebDriver ldriver;
	
	//write a constructor
	public ContactUsPage(WebDriver rdriver) {
		
		//initiate a driver
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	

}
	
	//identify elements which are present in login page (creating objects)
		@FindBy(id ="your_name-c2e387f9-4bd8-496f-ab2a-81fbbc31712a")
		@CacheLookup
		WebElement txtUsername;
		
		@FindBy(name="email")
		@CacheLookup
		WebElement txtEmail;
		
		@FindBy(name="mobilephone")
		@CacheLookup
		WebElement txtPhone;
		
		@FindBy(name="numemployees")
		@CacheLookup
		WebElement txtEmployees;
		
		@FindBy(name="what_kind_of_problem_is_your_business_currently_facing_")
		@CacheLookup
		WebElement drpbxHelp;
		
		@FindBy(name="message")
		@CacheLookup
		WebElement txtMessage;
		

		@FindBy(name="LEGAL_CONSENT.subscription_type_10841063")
		@CacheLookup
		WebElement chkbxAgree;
		
		@FindBy(xpath="//*[@id=\"LEGAL_CONSENT.subscription_type_10841063-c2e387f9-4bd8-496f-ab2a-81fbbc31712a\"]")
		@CacheLookup
		WebElement btnSubmit;
		
		
		
		
		public void SetUserName(String uname)
		{
			
			txtUsername.sendKeys(uname);
		}
		
		public void SetEmail(String uemail)
		{
			
			txtEmail.sendKeys(uemail);
		}
		
		public void SetPhone(String uPhone)
		{
			
			txtPhone.sendKeys(uPhone);
		}
		
		public void SetEmployees(String uEmployees)
		{
			
			txtEmployees.sendKeys(uEmployees);
		}
		
		public void SetHelp(String uHelp)
		{
			
			drpbxHelp.sendKeys(uHelp);
		}
		
		public void SetMessage(String uMessage)
		{
			
			txtMessage.sendKeys(uMessage);
		}
		
		public void SetAgree(String uAgree)
		{
			
			chkbxAgree.sendKeys(uAgree);
		}
		
		public void SetSubmit(String uSubmit)
		{
			
			btnSubmit.sendKeys(uSubmit);
		}
		
}

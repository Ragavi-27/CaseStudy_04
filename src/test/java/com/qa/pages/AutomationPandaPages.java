package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPandaPages {

	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div/ul/li[3]/a")
	WebElement contact;
	public WebElement getContact() {
		return contact;
	}
	
	@FindBy(id="g3-name")
	WebElement contactName;
	public WebElement getContactName() {
		return contactName;
	}
	
	@FindBy(id="g3-email")
	WebElement contactEmail;
	public WebElement getContactEmail() {
		return contactEmail;
	}
	
	@FindBy(id="contact-form-comment-g3-message")
	WebElement contactMessage;
	public WebElement getContactMessage() {
		return contactMessage;
	}
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/article/div/div[1]/form/div/div[4]/button")
	WebElement contactMeButton;
	public WebElement getContactMeButton() {
		return contactMeButton;
	}
	
	@FindBy(id="contact-form-success-header")
	WebElement confirmMessage;
	public WebElement getConfirmMessage() {
		return confirmMessage;
	}
	
	public AutomationPandaPages(WebDriver rdriver) {
		this.driver = rdriver;
	    PageFactory.initElements(rdriver, this);
	   
	}
	
	

}

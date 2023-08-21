package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomationPanda_Scenario_01 extends TestBase{
	
	@Test(priority=1)
	public void verifyingTitle() throws InterruptedException{
		//verifying title
		String ExpectedTitle = driver.getTitle();
		ExpectedTitle.contains("Want to practice test automation? Try these demo sites! | Automation Panda");
		Assert.assertTrue(driver.getTitle().contains(
				"Want to practice test automation? Try these demo sites! | Automation Panda"),
				"Title couldn't be verified");
	}
	
	@Test(priority=2)
	public void verifyingContactPage() throws InterruptedException {
		obj.getContact().click();
		String ContactTitle = driver.getTitle();
		Assert.assertTrue(ContactTitle.contains("Contact | Automation Panda"),
				"contacts page Title couldn't be verified");
		
		obj.getContactName().sendKeys("Rosy");
		obj.getContactEmail().sendKeys("abc@gmail.com");
		obj.getContactMessage().sendKeys("Available only on working days and working hours");
		obj.getContactMeButton().submit();
		Thread.sleep(2000);
	}
	
	@Test(dependsOnMethods="verifyingContactPage")
	public void verifyingMessageSent() {
		System.out.println(obj.getConfirmMessage());
		Assert.assertTrue(obj.getConfirmMessage().isDisplayed(), "Message Sent is not visible");
	}

}

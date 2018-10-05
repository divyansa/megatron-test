package com.megatron.test.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.megatron.lib.utils.TestConfiguration;

public class TestSample {
	WebDriver driver;
	@BeforeMethod
	public void preCondition(){
		driver = TestConfiguration.getDriverInstance();
	}
	@AfterMethod
	public void postCondition(){
		driver.close();
	}
	@Test
	public void testLogInPageTitle(){
		String actualTitle = driver.getTitle();
		String expectedTitle = "actiTIME-Login";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
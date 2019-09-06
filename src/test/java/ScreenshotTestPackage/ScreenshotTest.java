package ScreenshotTestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import TestNGListenerConsept.Base;
import TestNGListenerConsept.CustomListener;

@Listeners(CustomListener.class)

public class ScreenshotTest extends Base{
	
	@BeforeMethod
	public void LaunchBrwoser() {
		Initilization();
	}
	
	@Test
	public void LoginTest() {
		Assert.assertEquals(true, false);
		
	}
	@Test
	public void SearchTest() {
		Assert.assertEquals(true, false);
		
	}@Test
	public void ContactTest() {
		Assert.assertEquals(true, false);
		
	}
	@AfterMethod
	public void teardown() {
	driver.quit();	
	} 
}

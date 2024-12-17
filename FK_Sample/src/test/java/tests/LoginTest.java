package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass {

	BaseClass base;
	RemoteWebDriver driver;
	LoginPage loginPage;
	
	
	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		launchApp();
		loginPage=new LoginPage();
	}

	@Test
	public void login() throws Exception {
		loginPage.login();
		String actualText=loginPage.getHomeText();
		String expected="Home";
		Assert.assertEquals(actualText, expected);
	}
	
	@AfterMethod
	public void tearDown() {
		
	}
}

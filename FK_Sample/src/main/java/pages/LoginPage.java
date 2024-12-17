package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='3']")
	WebElement selectLanguage;
	
	@FindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
	WebElement clickOnContinue;
	
	@FindBy(xpath = "//android.widget.TextView[@text='CONTINUE WITH 8722290964']")
	WebElement continueButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Home']")
	WebElement homeText;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login() throws Exception {
		Thread.sleep(3000);
		selectLanguage.click();
		clickOnContinue.click();
		Thread.sleep(3000);
		continueButton.click();
		
	}
	
	public String getHomeText() {
		String text=homeText.getText();
		return text;
	}
}

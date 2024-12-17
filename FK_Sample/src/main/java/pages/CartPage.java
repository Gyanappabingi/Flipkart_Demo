package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CartPage extends BaseClass {

	@FindBy(xpath = "")
	WebElement search;
	
	@FindBy(xpath = "")
	WebElement selectItem;
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
}

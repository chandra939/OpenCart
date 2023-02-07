package opencart.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Abstraction.BaseTest;

public class product extends BaseTest {
	
	WebDriver driver;

	public product(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	By by = By.xpath("(//h4)[1]");
	By w = By.cssSelector(".alert.alert-success.alert-dismissible");
	@FindBy(xpath="(//h4)[1]/a")
	WebElement Click;
	@FindBy(id="button-cart")
	WebElement cart;
	By secondClick = By.id("button-cart");
	@FindBy(css=".alert.alert-success.alert-dismissible")
	WebElement alert;
	By nameWait = By.cssSelector(".img-fluid");
	
	public Boolean products() throws InterruptedException {
		waitForElementToVisible(nameWait);
		js();
		Thread.sleep(3000);
		actions(Click);
				
		waitForElementToVisible(by);
		
		Click.click();
		
		js();
		Thread.sleep(3000);
		waitForElementToClickable(secondClick);
		
		cart.click();
		waitForElementToVisible(w);
		Boolean bool =alert.isDisplayed();
		return bool;
	}
	
	

}

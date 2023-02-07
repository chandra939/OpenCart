package opencart.PageObjects;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Abstraction.BaseTest;

public class demo extends BaseTest{
	
	WebDriver driver;
	
	public demo(WebDriver driver){
		super(driver);
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		
	}

	@FindBy(linkText="Demo")
	WebElement Demo;
	@FindBy(css=".box-overlay")
	WebElement click;
	
	public product clickDemo() {
		Demo.click();
		click.click();
		Iterator<String> it = iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		return new product(driver);
	}
	
	
//	driver.findElement(By.linkText("Demo")).click();
	// driver.findElement(By.cssSelector(".box-overlay")).click();
}

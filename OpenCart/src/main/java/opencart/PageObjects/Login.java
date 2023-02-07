package opencart.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Abstraction.BaseTest;

public class Login extends BaseTest {
	
	
		
		WebDriver driver;
		
		public Login(WebDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		// WebElement username = driver.findElement(By.name("username")).sendKeys("chandra");
		 
		 @FindBy(name="email")
		 WebElement Email;
		 @FindBy(name="password")
		 WebElement Password;
		 @FindBy(css=".col-sm-6 button")
		 WebElement submit;
		 @FindBy(name="pin")
		 WebElement Pin;
		 @FindBy(css="[type='submit']")
		 WebElement login;
		 
		 public void login(String email,String password) throws InterruptedException {
			 
			 Email.sendKeys(email);
			 Password.sendKeys(password);
			 submit.click();
			
			 
			 
		 }
		 public demo pin(String pin) {
			 
			 Pin.sendKeys(pin);
			 login.click();
			 return new demo(driver);
			 
		 }
		 
		 public void goTo() {
			 
			 driver.get("https://www.opencart.com/index.php?route=account/login");
			 driver.manage().window().maximize();
		 }
		
		
		 
		 
	}
	



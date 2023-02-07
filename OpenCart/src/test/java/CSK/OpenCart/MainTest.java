package CSK.OpenCart;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import opencart.PageObjects.Login;
import opencart.PageObjects.demo;
import opencart.PageObjects.product;

public class MainTest extends StartTest { 
	
	@Test
	public void Test() throws InterruptedException, IOException {
		Login login =  landapp();
		 login.login("cs29996@gmail.com", "Cs29996@");
		 demo demo=login.pin("3109");
		product product = demo.clickDemo(); 
		Boolean bool =product.products();
	
		SoftAssert a = new SoftAssert();
		a.assertEquals(bool, true); 
		Thread.sleep(1000);
		driver.navigate().back();
		driver.quit();
		
		
		
		 
		 
		 
	}

}

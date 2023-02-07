package CSK.OpenCart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import opencart.PageObjects.Login;

public class StartTest {
	public WebDriver driver;
	
	public WebDriver initialize() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\global.properties");
		prop.load(file);
		String browsername = prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			 WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 return driver;
	}
	
	public Login landapp() throws IOException {
		driver = initialize();
		Login login = new Login(driver);
		login.goTo();
		return login;
	}

}

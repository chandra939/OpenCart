package base.Abstraction;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	WebDriver driver;
	WebDriverWait w;
	public BaseTest(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.w=w;
	}
	
	public Iterator<String> iterator() {
		Set<String> tab = driver.getWindowHandles();
		Iterator<String> it = tab.iterator();
		return it;
		
	}
	public void js() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	}
	
	public void waitForElementToVisible(By by) {
		
		w.until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
	
public void waitForElementToClickable(By by) {
		
		w.until(ExpectedConditions.elementToBeClickable(by));
		
	}

	public void actions(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();;
		
	}
	

}

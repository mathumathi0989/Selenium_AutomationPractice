package Selenium.AutoPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class udemyPract_Oops3Page {

	private WebDriver driver;
	public WebElement ThankyouText;
	
	
	public udemyPract_Oops3Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getThankyouText() {
		return driver.findElement(By.className("complete-text"));
	}
	
	
	public boolean thankyou() {
		return getThankyouText().isDisplayed();
	}
	
}

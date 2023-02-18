package Selenium.AutoPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class udemyPract_Oops2Page {

	private WebDriver driver;
	public WebElement finish_button;
	
	public WebElement getFinish_button() {
		return driver.findElement(By.id("finish"));
	}

	public udemyPract_Oops2Page(WebDriver driver) {
		this.driver = driver;
	}
	
	public void finish() {
		getFinish_button().click();
	}
	
	
}

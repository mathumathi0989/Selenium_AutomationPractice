package Selenium.AutoPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class udemyPract_OopsPage {

	private WebDriver driver;
	public WebElement first_name;
	public WebElement last_name;
	public WebElement zipCode;
	public WebElement submit_Button;
	
	public udemyPract_OopsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getFirst_name() {
		return driver.findElement(By.id("first-name"));
	}


	public WebElement getLast_name() {
		return driver.findElement(By.id("last-name"));
	}


	public WebElement getZipCode() {
		return driver.findElement(By.id("postal-code"));
	}


	public WebElement getsubmit_Button() {
		return driver.findElement(By.id("continue"));
		
	}

	public void submitPersonalInfo() {
		getFirst_name().sendKeys("Mathu");
		getLast_name().sendKeys("Mathi");
		getZipCode().sendKeys("07002");
		getsubmit_Button().submit();
	}

	
	
	
}

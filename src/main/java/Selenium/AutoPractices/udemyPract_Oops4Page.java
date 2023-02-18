package Selenium.AutoPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class udemyPract_Oops4Page {

	private WebDriver driver;
	
	public WebElement userName;
	public WebElement password;
	public WebElement login;
	public udemyPract_Oops4Page(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserName() {
		return driver.findElement(By.id("user-name"));
	}
	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}
	public WebElement getLogin() {
		return driver.findElement(By.id("login-button"));
	}
	
	public void login() {
		getUserName().sendKeys("standard_user");
		getPassword().sendKeys("secret_sauce");
		getLogin().click();
	}
	
}

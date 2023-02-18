package Selenium.AutoPractices;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class udemyPract_WebElements {

	public WebDriver driver;
	
	@BeforeTest
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void focus() {
		driver.get("https://example.cypress.io/commands/actions");
	WebElement	e = driver.findElement(By.id("password1"));
	e.click();
	WebElement ele = driver.findElement(By.xpath("//*[@for='password1']"));
		String actual =ele.getAttribute("style");
		System.out.println(actual);
	Assert.assertTrue(ele.getAttribute("style").contains("color: orange;"));
	}
	
	
	@Test
	public void cookies() {
		driver.get("https://example.cypress.io/commands/cookies");
		driver.findElement(By.xpath("//div[@id='getCookies']/div/div[2]//button")).click();
		String actual = driver.manage().getCookieNamed("token").getValue();
		System.out.println(actual);
		Assert.assertEquals(actual, "123ABC");
		
	}
	
	@Test
	public void scrollToBottom() throws Exception {
		driver.get("https://ultimateqa.com/complicated-page");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(2000);
	}
	
	@Test
	public void scrollToTop() throws Exception {
		driver.get("https://ultimateqa.com/complicated-page");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		Thread.sleep(2000);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	
	
	
}
